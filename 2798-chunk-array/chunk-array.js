/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {

    if(arr.length==0) return [];

    let boss=[];
    if(arr.length<size) {
        boss.push(arr);
        return boss;
    }
    let count=0;
    let miniboss=[];
    for( let i of  arr){

        if(count ==size)
        {
            boss.push(miniboss);
            miniboss=[];
            count=0;
        }
       miniboss.push(i);
       count+=1;
    }
    boss.push(miniboss);

    return boss;
    
};
