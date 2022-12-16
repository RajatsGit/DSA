// // // // var foo = "59";
// // // // /*
// // // // number --> Number
// // // // string ---> String
// // // // object ---> Object
// // // // Array ---> Object
// // // // */
// // // // const fum = Number(foo);
// // // // console.log(fum);
// // // // console.log(typeof foo, typeof fum);
// // // // // By default in JS the plus operator is reserved for concatination unless both the operators are numbers.
// // // // console.log(7.7 + "8.8");
// // // // // == checks only the value not the type
// // // // // === checks both
// // // // function throwerror(){
// // // //     throw new Error("This is error");
// // // // }  
// // // // function checknumber(a,b){
// // // //     if(typeof a !== Number || typeof b !== Number){
// // // //         throw new Error("2 numbers are expected");
// // // //     }
// // // //     else if(a > b){
// // // //         console.log(a-b);
// // // //     }
// // // //     else if(b > a){
// // // //         console.log(b-a);
// // // //     }
// // // // }
// // // // checknumber(10,"5");


// // // // Hoisting 
// // // // it is a concept which enables us to extract values of variables and functions even brfore assignment value without getting error
// // // // Moving to the scope of this course
// // // // It is used to debugg the old code 
// // // // getName(); //Get Name Function is not defined

// // // // console.log(x); // X is not defined

// // // // var x=7;

// // // // function getName(){

// // // // console.log("My name is Vanshu");

// // // // }

// // // //  getname(); // It shows error
// // //  console.log(getname);
// // // //  Function Expressions 
// // // // It behaves same as variables
// // // var getname = function (){
// // //     console.log("Juno Batch");
// // // }
// // // getname(); // It has to be declare then it can work;
// // // // Arrow Function
// // // var getNameDuplicate = () => {};
// // // // When your function has only one line and that line is return something
// // // var returnNumber = ()=>1;
// // // // This is equilavent to 
// // // // var returnNumber =()=>return 1;

// // // // Reference Error v/s undefined
// // // console.log("Value of x is",x);
// // // var x=7;
// // // // undefined means that the variable exists in the memory but it does not have value
// // // try{console.log("Value of y is",y);}
// // // catch(err){
// // //     console.log("Error is ",err);
// // // }
// // // // reference error occurs when the variable is not in the memory 
// // // //  it ends the line and not excute the next line
// // // // Using try and catch you can execute the next line
// // // console.log("Value is as it is");

// // // // Functions in JS
// // // //  Functions are first class member in JS explain?
// // // var x=4;
// // // foo(x); 
// // // function foo(name){
// // //     console.log("foo is executed",name);
// // // }
// // // function baz(name){
// // //     // call back function
// // //     // Functions passed as arguments and 
// // //     console.log("baz is executed",name);
// // // }
// // // // We have a number . If a number is greater than 4 call foo else baz
// // // // This takes function as a parameter

// // // function makeAcall(functiontobeExecuted){
// // //  functiontobeExecuted("rajat");
// // // }
// // // // foo() => execute this function
// // // // foo => 
// // // function determineNumber(num){
// // //    if(num > 4){
// // //     // when function is passed as arguments , we need to pass reference 
// // //     makeAcall(foo);
// // //    }
// // //    else{
// // //     makeAcall(baz);
// // //    }
// // // }
// // // determineNumber(5);
// // // // If argument is undefined it should have default value
// // // function sayMyName(name="Rajat"){
// // //     console.log("My name is ",name);
// // // }
// // // // function sayMyName(roll,name){
// // // //     console.log("my details ",roll,name);
// // // // }
// // // // sayMyName("rajatsharma");
// // // sayMyName();
// // // // undefined means there is a variable with that name it dies not has any value
// // // // but null means there is a variable with that name with value null;

// // // // IIFE
// // // // Immediately Invoked Function Expressions
// // // (function demo(name){
// // //     console.log("Demo",name);
// // // })("RAJAT");
// // // function a(){
// // //     console.log(b);
// // // }
// // // var b =10;
// // // a(); // Function a is able to acess variable b from global scope
// // // function a(){
// // //     c();
// // //     function c(){
// // //         console.log(b);
// // //     }
// // // }
// // // var b =10;
// // // a();   // Within nested function to global scope variable can be accessed.
// // // function a(){
// // //     c();
// // //     function c(){
// // //         var b =100;
// // //         console.log(b);
// // //     }
// // // }
// // // var b =10;
// // // a();
// // // function a(){
// // //     var b =10;
// // //     c();
// // //     function c(){
// // //         console.log(b);
// // //     }

// // // }
// // // a();
// // // console.log(b);
// // // // a function can access the global variable but global execution context can not access local variables
// // // // What all functions can access
// // // // local variable, global variable
// // // // Lexical environment is Local memory + Lexical Environment of Parent.
// // // // Preocess is Scope Chaining or Lexical Environment Chaining.

// // // // Let and Const are hoisted 
// // // // This is wrong.
// // // // console.log(a);
// // // // console.log(b);
// // // let a=10;
// // // // console.log(a);
// // // var b =15;    
// // // // a is in a separate memory space where it can be accessed only after assigning some values to it.
// // // // I can access a only if it is assigned a value else  error will be thrown.
// // // // Temporal Dead Zone : Time since when variable was hoisted until it is initialised value;
// // // var b =18;
// // // let b =16;
// // // let b =18;
// //  function changeBackgroundColor(){
// //     // Document object contains many prededined functions
// //     // It will return element by id return para
// //    const para =  document.getElementById("para");
// //    para.style.color="red";
// // //    If we have hypen in css propert use captial letter instead of hypen for example
// // para.style.backgroundColor="blue";
// //    const dad = document.getElementsByClassName("blue");
// //    const pap = document.getElementsByTagName("p");
// //    const hash = document.querySelector("#para",".blue");// Select elements with id para blue
// // //    Query selector returns first element that matches the criteria

// //    console.log("Paragrah is ",para);
// //    console.log("blus is ",dad);
// //    console.log("para is ",pap);
// //  }
// // changeBackgroundColor();

// // Create an element
// // const divElement = document.createElement("div");
// // // Write content in it.
// // // It only allows to write text in that element.

// // divElement.innerText="This is a content in div";


// // // It allows you to write a fullfleged HTML in the element.
// // // divElement.innerHTML = "This is html string in div";

// // const pargraph = document.getElementById("content");
// // pargraph.append(divElement);//Keep existing and add a child (divElement)

// // function showButtons(){
// // for(let i=1;i<=10;i++){
// //      const buttonElement = document.createElement("button");
// //      buttonElement.innerText = i;
// //    //   
// //    buttonElement.setAttribute("id","button-"+i);
// //      const body = document.querySelector("body");
// //      body.appendChild(buttonElement);
// // }
// // }
// // showButtons();
// const buttonSel = document.getElementById("btn");
// // click ,scroll,keypad interaction
// // buttonSel.addEventListener("click",function(event){
// //    // this function is automaticall called when button is clicked
// //    console.log("Button Clicked");
// // });
// let hidden=false;
// let count = 1;
// buttonSel.addEventListener("click",function(event){
// //  const paragraph = document.getElementById("toggle");
// // // let hidden = false;
// //  if(hidden){
// //    paragraph.style.display="block";
// //    hidden = false;
// // }
// //  else{
// //    paragraph.style.display="none";
// //    hidden = true;
// //  }
// const newButton = document.createElement("button");
// newButton.innertext = "Button " + count;
// count++;
// const bodyElement = document.querySelector("body");
// bodyElement.appendChild(newButton);

// });


// // Call Back function : it executes once some other thing has happened

let arr =[1,2,3,4,5];
let raj = arr.map(function(element,index){
    return element+2;
});
console.log("old is ",arr);
console.log("new is ",raj);

let rajat = arr.filter(function(element,index){
return element%2===0;
});
console.log("filtered is ",rajat);
let nums = [2,3,4,5,6,7,"Rajat"];
// reduce returns single element out of all the array element.
let sum = nums.reduce(function(accumulator,currentValue,index){
if(currentValue === "Rajat"){
return currentValue;
}
    return "undefined";
},0);
console.log("Sum is",sum);

const arrayOfObjects = [{
    "name" : "Rajat",
    "assi" : 100
},
{
    "name" : "Rajat",
    "assi" : 100000
},
{
    "name" : "Vanshu",
    "assi" : 890
}];
const my = arrayOfObjects.find(function(currentObject){
 return currentObject.name==="Rajat";
});
console.log(my);
const mi = arrayOfObjects.findIndex(function(currentObject){
 return currentObject.name==="Vanshu";
});
console.log(mi);