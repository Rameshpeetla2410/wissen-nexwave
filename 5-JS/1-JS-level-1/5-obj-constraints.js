"use strict"

//--------------------------------------------------------------
// let person = {
//     name: 'Nag',
//     age: 34
// }
// Object.defineProperty(person, 'name', { configurable: false, writable: false })

// // delete person.name;
// // person.name = "";

//--------------------------------------------------------------

// let person = {
//     name: 'Nag',
//     age: 34
// }
// Object.preventExtensions(person);
// Object.seal(person);
// Object.freeze(person);

// person.newProp="some-value";
// delete person.age;
// person.age=200;


//--------------------------------------------------------------


// let person = {
//     _name: 'Nag',
//     _age: 34,
//     set name(name) {
//         if (name) this._name = name;
//     },
//     get name() {
//         return this._name;
//     },
//     set age(age) {
//         if (age < 60) {
//             this._age = age;
//         }
//     },
//     get age() {
//         return this._age
//     }
// }

// person.age = 1000; // set
// console.log(person.age) // get








delete Array.prototype.pop


