console.log('-index.js-');
import { combineReducers, createStore } from 'redux';

// Action(s)
//---------------------------------------
const INCREMENT = "increment";
const DECREMENT = "decrement";
const ADD_NEW_REVIEW = "add_new_review";
//---------------------------------------
// Action creators(s)
function increment(value) {
    return { type: INCREMENT, value }
}
function decrement(value) {
    return { type: DECREMENT, value }
}
function addNewReview(review, productId) {
    return { type: ADD_NEW_REVIEW, review, productId }
}
//---------------------------------------
// reducer(s)
function counterReducer(state = { count: 0 }, action) {
    console.log('counterReducer()');
    switch (action.type) {
        case INCREMENT:
        case ADD_NEW_REVIEW:
            return Object.assign({}, { count: state.count + (action.value ? action.value : 1) })

        case DECREMENT:
            return Object.assign({}, { count: state.count - action.value })
        default:
            return state;
    }
}
function reviewsReducer(state = {}, action) {
    console.log('reviewsReducer()');
    switch (action.type) {
        case ADD_NEW_REVIEW: {
            let productId = action.productId;
            if (state[productId]) {
                let existingReviews = state[productId];
                return Object.assign({}, state, { [productId]: [...existingReviews, action.review] })
            } else {
                return Object.assign({}, state, { [productId]: [action.review] })
            }
        }
        default:
            return state;
    }
}
//----------------------------------------
// rootReducer
const rootReducer = combineReducers({
    counter: counterReducer,
    reviews: reviewsReducer
});
//----------------------------------------
// intial state
let intialState = {
    counter: {
        count: 100
    },
    reviews: {
        '111': [
            { stars: 3, author: 'who@email.com', body: 'sample1' }
        ]
    }
};
// store
const store = createStore(rootReducer, intialState, window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__());

//----------------------------------------


// View ( plain-js | jquery | NG | React | etc... )

let plusBtn = document.querySelector('.btn-success');
let minusBtn = document.querySelector('.btn-danger');
let displaySpan = document.querySelector('.badge');
let lapReviewBtn = document.getElementById("lap");
let mobReviewBtn = document.getElementById("mob");

let state = store.getState();
displaySpan.innerText = state.counter.count;

store.subscribe(() => {
    let state = store.getState();
    displaySpan.innerText = state.counter.count;
});

plusBtn.addEventListener('click', () => {
    let action = increment(10);
    store.dispatch(action);
});
minusBtn.addEventListener('click', () => {
    let action = decrement(10);
    store.dispatch(action);
});

lapReviewBtn.addEventListener('click', () => {
    let action = addNewReview({ stars: 1, author: 'who', body: 'i hate' }, '111');
    store.dispatch(action);
});

mobReviewBtn.addEventListener('click', () => {
    let action = addNewReview({ stars: 1, author: 'who', body: 'i hate' }, '222');
    store.dispatch(action);
});