'use strict';

var _menu = require('./hotel/menu');

// item1=null; // error , its const reference
_menu.item1.price = 100.00;

// import {item1,item2} from './hotel/menu'
// console.log(item1);
// console.log(item2);


// or


// import {item1 as nonVeg,item2 as veg} from './hotel/menu'
// console.log(nonVeg);
// console.log(veg);


// or


// import * as items from './hotel/menu'
// console.log(items.item1);
// console.log(items.item2);


// or 

console.log(_menu.item1.price);