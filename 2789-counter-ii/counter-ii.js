/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
   let val=init;

   
  function increment() {
    return ++val;
  }

  function decrement(){
   val--;
   return val;}

   let reset =()=>{ val=init; return val;}

  return { increment, decrement, reset };
    
};

