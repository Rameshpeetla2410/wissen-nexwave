
"use strict";

//-------------------------------------
// 5. de-structuring
//-------------------------------------

// let person = {
//     name: 'Nag',
//     age: 34
// };


// // let myName = person.name;
// // let myAge = person.age;

// // or

// let { name: myName, age: myAge } = person;
// // let {name:name,age:age}=person;
// // or
// // let {name,age}=person;

// let name, age;
// ({ name, age } = person)


// let arr = [1, 2, 3, 4, 5, 6, [7, 8]]

// // let n1 = arr[0];
// // let n2 = arr[1];
// // let n3 = arr[2];

// // or

// let [n1, n2, n3, n4 = 40, , n6, [n7, n8]] = arr;



//-------------------------------------
// 6. spread operator
//-------------------------------------


// function func(a, b, c) {
//     console.log(a);
//     console.log(b);
//     console.log(c);
// }

// let nums = [10, 20, 30]

// // func(nums[0],nums[1],nums[2]);
// // or
// func(...nums);


// let a1 = [1, 2, 3]
// let a2 = [7, 8, 9];
// let str="NAG";
// let newArr = [...a1, 4, 5, 6, ...a2,...str]




//-------------------------------------
// 7. octal & binary numbers
//-------------------------------------


// let v=0b10;
// console.log(v);



//-------------------------------------
// 8. obj-literal enhancements
//-------------------------------------

// let name = "Nag";
// let age = 34;

// // Es5
// let p1 = {
//     name: name,
//     age: age,
//     sayName: function () {
//         //...
//     },
//     'home-address': 'chennai'
// }

// // Es6
// let dynamicField = 'vacation'; // home | office | vacation
// let p2 = {
//     name,
//     age,
//     sayName() {
//         //..
//     },
//     [dynamicField + "-address"]: 'chennai',
//     [1 + 2 + 3 + 4]: 'ten',
//     'say Salary'() {
//         console.log('i cant');
//     }

// }
// p2["say Salary"]();





//-------------------------------------
// 9. Symbol data-type
//-------------------------------------

/*

  unique & immutable value, used as obj's identifier property

*/

// // How to create symbol ?

// let symbol1 = Symbol.for('key1');
// let symbol2 = Symbol.for('key1');

// // how to use them ?

// let javaSymbol = Symbol.for('java');
// let jsSymbol = Symbol.for('js');

// let e1 = { name: 'A', [javaSymbol]: 'core-java,spring,jpa' }
// let e2 = { name: 'B', [jsSymbol]: 'core-js,NG' }
// let e3 = { name: 'C', [javaSymbol]: 'core-java' }
// let e4 = { name: 'D', [jsSymbol]: 'core-js' }


// // in-team

// if (e1[javaSymbol]) {
//     console.log('"welcome java friend')
// }

//----------------------------------------------------------------

// let menu = ['sweet', 'chips', 'chapathi', 'curry', 'rice-1', 'rice-2', 'sambar', 'rasam', 'curd']

// let newMenu=[...menu,'chicken'];
// let [m1, , , m2, m3] = menu;
// for (let item of menu) {
//     console.log(item)
// }


//----------------------------------------------------------------

// let idMaker = {
//     [Symbol.iterator]: function () {
//         let id = 0;
//         return {
//             next: function () {
//                 id++;
//                 return { value: id <= 10 ? id : undefined, done: id <= 10 ? false : true }
//             }
//         };
//     }
// };


// // let ids=[...idMaker];
// // let [id1,id2,,id4]=idMaker;
// for(let id of idMaker){
//     console.log(id);
// }





//-------------------------------------
// 12. arrow-function
//-------------------------------------



// let getPrice = function () {
//     return 100 + 200;
// }


// or


// let getPrice = () => {
//     return 100 + 200;
// }


// let getPrice = (count) => {
//     return count * (100 + 200);
// }
// or
// let getPrice = count => {
//     return count * (100 + 200);
// }


// let getPrice = (count, gst) => {
//     return count * (100 + 200) + gst;
// }
//or
// let getPrice = (count, gst) => count * (100 + 200) + gst;



// let getPrice = (count, gst) => {
//     let cost = count * (100 + 200);
//     let total = cost + gst;
//     return total;
// }



/*

    when/where we arrow-functions?

    -> to make compact function-arg
    -> to capture 'this' ( imp )

*/
//----------------------------------------------------------
// -> to make compact function-arg

// let nums = [1, 3, 5, 7, 9, 2, 4, 6, 8, 10];
// nums.sort(function (a, b) { return a - b; });
// nums.sort((a, b) => { return a - b; });
// nums.sort((a, b) => a - b);
// nums.forEach(n => console.log(n))
// let result = nums.map(n => n * n)
// let evens = nums.filter(n => n % 2 === 0);

//----------------------------------------------------------

//-> to capture 'this' 


/*

  regular-function ==> statically oor dynamically , can bind to any object

  arrow-function   ==> always bound to creator i.e obj who created that arrow-function


*/


// let tnr = {
//     name: 'Nag',
//     doTeach: function () {
//         console.log(this.name + " teaching .js")
//         // let askQues = function (q) {
//         //     console.log(this.name + " answering " + q);
//         // }
//         // or
//         let askQues = (q) => {
//             console.log(this.name + " answering " + q);
//         }
//         console.log('teaching ends..');
//         return askQues;
//     }
// }

// let askQues = tnr.doTeach();
// askQues.call(tnr, "Q1");
// askQues("Q1");

// let newTnr = { name: 'kishore' }
// askQues.call(newTnr, "Q2");
// askQues("Q3");



//-------------------------------------------------

// console.log(this);

//----------------------------------------------------
// let regularFunc = function () {
//   console.log(this);
// }
// regularFunc();

// let o1 = { name: 'O1', f: regularFunc };
// o1.f();
// let o2 = { name: 'O2' }
// regularFunc.call(o2);
// //----------------------------------------------------
// let arrowFunc = () => {
//   console.log(this);
// };
// // arrowFunc();

// let o3 = { name: 'O3', f: arrowFunc };
// o3.f();
// let o4 = { name: 'O4' }
// arrowFunc.call(o4)


//---------------------------------------------------------




// let invoice = {
//   num: 123,
//   process: function () {
//     console.log("INV-" + this.num + " processed");
//   }
// };



// let invoice = {
//   num: 123,
//   process: () => {
//     console.log("INV-" + this.num + " processed");
//   }
// };

// let invoice = {
//   num: 123,
//   process: function () {
//     console.log("INV-" + this.num + " processed partially");
//     return function () {
//       console.log("INV-" + this.num + " processed completly");
//     }
//   }
// };


// let invoice = {
//   num: 123,
//   process: function () {
//     console.log("INV-" + this.num + " processed partially");
//     return () => {
//       console.log("INV-" + this.num + " processed completly");
//     }
//   }
// };


// let complete = invoice.process();
// complete();


//----------------------------------------------------------------



function Person(name, age) {
  this.name = name;
  this.age = age;

  //es5
  // let self=this;
  // let incAge = function () {
  //   console.log(this);
  //   self.age++;
  //   console.log(self.name + "-" + self.age);
  // }
  // setInterval(incAge, 1000);

  // or

  //es6
  let incAge = () => {
    console.log(this);
    this.age++;
    console.log(this.name + "-" + this.age);
  }
  setInterval(incAge, 1000);

}

let p = new Person('Ria', 3);





let o={
  a:10,
  b:20,
}









