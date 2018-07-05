
const { Observable } = require('rxjs');
const { map, filter, switchMap } = require('rxjs/operators');

// observable-stream
//------------------------------------------

const stream = Observable.create(observer => {
    //async-operation
    let i=setInterval(() => {
        let rn = Math.floor(Math.random() * 1000)
        console.log('pushing new number into stream - ' + rn);
        observer.next(rn);
        if (rn < 50) {
            console.log('closing stream');
            observer.complete("i wont send any numbers further");
            clearInterval(i);
        }
    }, 2000);
});

//------------------------------------------

// subscriber-1
stream
    .pipe(filter(n => n % 2 !== 0))
    .subscribe(
        (newResult) => { console.log("sub-1: " + newResult); 
        (error)=>{},
        (complete)=>{
            console.log(complete);
        }
    });


//------------------------------------------