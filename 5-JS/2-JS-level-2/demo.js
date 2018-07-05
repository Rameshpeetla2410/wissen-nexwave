

function fn(staticSegments, ...dynamicSegments) {
    console.log(staticSegments);
    console.log(dynamicSegments);
}

const aVar = 'good';
const num = 10;
fn(['this is a ', ' day', 'num'], aVar, num);
// or
fn`this is a ${aVar} day ${10} num`;