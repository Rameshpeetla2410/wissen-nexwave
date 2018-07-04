console.log('-app_v2.js-');


//----------------------------------------------
let myForm = $('.card');
myForm.hide();
let formBtn = $('#form-btn');
formBtn.click(e => {
    //myForm.show(2000);
    //myForm.toggle();
    myForm.slideDown()
});
$('#cancel-btn').click(e => {
    //myForm.hide();
    //myForm.toggle();
    myForm.slideUp()
})
//----------------------------------------------

let box = $('.jumbotron');
$('#load-todos-btn').click(e => {
    let url = "https://jsonplaceholder.typicode.com/todos?_limit=3";
    $.getJSON(url, function (resp) {
        box.text(JSON.stringify(resp))
    })
})

//----------------------------------------------