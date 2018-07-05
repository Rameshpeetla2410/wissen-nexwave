

// service-module  ( e.g swiggy )
//--------------------------------------------

let swiggy = {
    getFood() {
        let promise = new Promise((resolve, reject) => {
            //async operations..
            setTimeout(() => {
                //console.log('swiggy rejecting promise');
                //reject('d-boys not available');return;
                setTimeout(() => {
                    let response = 'biryani';
                    console.log('swiggy resolving promise');
                    resolve(response)
                }, 3000)
            }, 2000);
        });
        return promise;
    }
}


//--------------------------------------------


// service-module  ( e.g bar )
//--------------------------------------------

let bar = {
    getDrink() {
        let promise = new Promise((resolve, reject) => {
            //async operations..
            setTimeout(() => {
                let response = "bira-beer";
                console.log('bar resolving promise');
                resolve(response)
            }, 1000)
        });
        return promise;
    }
}


//--------------------------------------------



//ui-module
//--------------------------------------------

let person = {
    doWork() {
        console.log('person working.....');
        console.log('person feels hungry..requesting food & beer on swiggy & bar modules');
        let promise1 = swiggy.getFood();
        let promise2 = bar.getDrink();
        console.log('person got 2 promises, defer actions to future with callbacks');
        let newPromise = Promise.all([promise1, promise2]).then(
            (result) => {
                console.log('yummy ' + result[0]);
                return result[1];
            },
            (error) => { console.log('oops ' + error); }
        );
        console.log('person working further....ends');
        return newPromise;
    }
}

let promise = person.doWork();

promise.then(
    (drink) => {
        console.log(' party with ' + drink)
    }
);

//--------------------------------------------




// UI-module
let todosPromise=fetch('https://jsonplaceholder.typicode.com/todos?_limit=3')
todosPromise
.then(result=>result.json())
.then(todos=>console.log(todos))