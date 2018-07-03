
//-----------------------------------------------
let products = [
    { id: 1, name: 'product-1', price: 100 },
    { id: 2, name: 'product-2', price: 200 },
    { id: 3, name: 'product-3', price: 300 }
];
let newProducts = null;
//-----------------------------------------------
// push() -> mutable

// products.push({id:3,name:'product-3',price:300})
//-----------------------------------------------
// concat() -> immutable

// newProducts=products.concat({id:3,name:'product-3',price:300})
//-----------------------------------------------
// pop() -> mutable

// products.pop();
//-----------------------------------------------
// forEach()

// products.forEach(function(item,idx){
//     console.log(idx)
//     console.log(item);
// });
//-------------------------------------------------
// filter() -> immutable

// newProducts = products.filter(function (item, idx) {
//     return item.price<300;
// });

//-------------------------------------------------
// map()    --> immutable

// newProducts = products.map(function (item, idx) {
//     return item.name;
// })

//-------------------------------------------------
// every()

// let isEvery=products.every(function (item) {
//     return item.price > 100;
// })

//-------------------------------------------------
// some()

// let b=products.some(function (item) {
//     return item.price > 100;
// })

//-------------------------------------------------

// indexOf()

// let names=["apple","banana"]
// console.log(names.indexOf('banana'))

//--------------------------------------------------

// find()   & findIndex()

// let i=products.findIndex(function(item){
//     if(item.price===200)return true;
//     return false;
// })

//--------------------------------------------------

// slice()  ==> immutable

// newProducts=products.slice(1,2);


//--------------------------------------------------

// splice()

// products.splice(1,1);
// products.splice(1,1,{},{});


//--------------------------------------------------

// delete products[0];

//--------------------------------------------------

// Join()


// let menu=["A","B","C","D"]
// let newMenu=menu.join(" ");

//--------------------------------------------------

// reduce()

// let totalPrice=products.reduce(function(acc,item){
//     console.log(item);
//     console.log(acc);
//     return item.price+acc;
// },0)

//-------------------------------------------------