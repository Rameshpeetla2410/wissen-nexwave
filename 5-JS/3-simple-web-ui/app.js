
console.log('-app.js-');

//-----------------------------------------------------
// using DOM API
//-----------------------------------------------------
// step-1 : query DOM for required elements
let alertBox = document.querySelector('.alert');
let showBtn = document.querySelector('.btn-primary');
let hideBtn = document.querySelector('.btn-danger');
let greetBtn = document.querySelector('.btn-success');
// step-2 : bind event listeners & react on event
showBtn.addEventListener('click', function (e) {
    alertBox.style.display = ''
});
hideBtn.addEventListener('click', function (e) {
    alertBox.style.display = 'none'
});
greetBtn.addEventListener('click', function (e) {
    alertBox.innerHTML = 'Good Evening'
});

//-----------------------------------------------------
// Using Timer-API
//-----------------------------------------------------

let imgEle = document.getElementById('pov');
document.getElementById('stop').setAttribute('disabled', true);

document.getElementById('start')
    .addEventListener('click', () => {
        document.getElementById('stop').removeAttribute('disabled')
        let idx = 0;
        let interval = setInterval(() => {
            idx++;
            imgEle.src = `./images/${idx}.jpg`
            if (idx === 5) idx = 0
        }, 1000)

        document.getElementById('stop')
            .addEventListener('click', () => {
                clearInterval(interval)
            });
    });





//-----------------------------------------------------
// Using XHR/Fetch APi
//-----------------------------------------------------


document.getElementById('load-todos-btn')
    .addEventListener('click', () => {
        let apiUrl="https://jsonplaceholder.typicode.com/todos?_limit=3";
        let promise=fetch(apiUrl)
        promise
        .then((response)=>response.json())
        .then(todos=>{
            document.querySelector('.jumbotron')
            .innerText=JSON.stringify(todos)
        })

    })