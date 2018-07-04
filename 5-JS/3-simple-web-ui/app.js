
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
        let apiUrl = "https://jsonplaceholder.typicode.com/todos?_limit=3";
        let promise = fetch(apiUrl)
        promise
            .then((response) => response.json())
            .then(todos => {
                document.querySelector('.jumbotron')
                    .innerText = JSON.stringify(todos)
            })

    })


//-------------------------------------------------
// Form-validation
//-------------------------------------------------

let myForm = document.getElementById("my-form");
myForm.addEventListener('submit', e => {
    e.preventDefault();
    let nameField = document.getElementById('nameField');
    let name = nameField.value;
    if (!name) {
        nameField.style.border = "1px solid red";
        nameField.focus();
    } else {
        nameField.style.border = ""
    }

    let emailField = document.getElementById('emailField');
    let email = emailField.value;
    if (!email) {
        emailField.style.border = "1px solid red";
        emailField.focus();
    } else {
        emailField.style.border = ""
    }

    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    if (!re.test(email)) {
        document.getElementById('emailMessage')
            .innerText = "invalid Email"
    } else {
        document.getElementById('emailMessage')
            .innerText = ""
    }

});


