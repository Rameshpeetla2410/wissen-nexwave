

function doTeach() {
    let tnrName = "Nag";  // will move to heap
    let actions="scolding...."
    try {
        console.log(tnrName + ' teaching javascript');
        //throw new Error('hate-.js');
        setTimeout(() => {
            console.log(tnrName + ' teaching NG');
            // throw new Error('hate-NG');
            console.log('teaching NG ends..');
        }, 5000);
        console.log('teaching javascript ends');
    } catch (e) {
        console.log('caught :' + e.message);
    }
}

doTeach();