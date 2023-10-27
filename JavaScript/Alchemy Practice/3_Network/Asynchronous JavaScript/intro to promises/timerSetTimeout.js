function timer() {
    return new Promise(function(resolve,reject){
        setTimeout(function(){
            resolve();
        },1000)
    });
}

module.exports = timer;