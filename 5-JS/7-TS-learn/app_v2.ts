

interface Wheel {
    rotate: (rpm) => void
}

class MRFWheel implements Wheel {
    rotate(rpm): void {
        console.log("MRF wheel rotating");
    }
}
class CEATWheel implements Wheel {
    rotate(rpm): void {
        console.log("CEAT wheel rotating");
    }
}

class Car {
    // private wheel: Wheel
    // constructor(wheel: Wheel) {
    //     this.wheel = wheel;
    // }
    constructor(private wheel:Wheel){}
    move(): void {
        this.wheel.rotate(100)
        console.log("Car moving....")
    }
}


let car: Car = new Car(new MRFWheel())
car.move();