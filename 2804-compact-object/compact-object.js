/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {


    const compobj=Array.isArray(obj)?[]:{};
    for(const key in obj){// in jo hai index deta
       
       let elem=obj[key];

       if(elem)//not falsy
{
    if(typeof elem==="object") elem=compactObject(elem);

    Array.isArray(obj)? compobj.push(elem): compobj[key]=elem;
}
    }
    return compobj;
    
};