// first letter of datatype name should be small same as Java.
// Print the statement we use 
console.log("Hello World");
// Declaration of variable

var a=4;   // this variable can be changed if it is declared within a function then its scope is within that function only.
let b=6;    // this variable can be changed  if it is declared within a function then its scope is within that function only.
const c=6;   // can not be changed throughout the program i.e. immutable
// Variables declared using const can not be changed
var st = 89;
var st = 90;// both the satements are true;
let s = 0;
// let s = 5; // it is showing the error
s =9 ;// It is not showing the error that means we can change the value of let but we can not decalre the same variable name with let. 
// for example
function scopeofLet(){
    let jas = "function scope";
    if(true){  // Here let scope is for that block only that I have created new let inside true statement(new block with same name)
        let jas = "block scope"; // but that is not in the case for var.
        console.log(jas);
    }
    console.log(jas);
}
function scopeofLet(){
    // let jas = "function scope";
    if(true){  
    var jas = "block scope"; // but that is not in the case for var i.e. it is printing in both the statements.
        console.log(jas);
    }
    console.log(jas);
}
scopeofLet();
// for array we can use const but we can individually change the element at each index
const my = [2,3,4];
// my = [5,6,7];// This is wrong way to do it 
my[0] = 5;
my[1] = 6;
my[2] = 7;
console.log(my); // This printing the array with no error
// We can use Object.freeze for objects.
a="Hello";// Valid
b="hello";//Valid
// c="string"; //InValid
// String is also IMMutable
// var,let->mutable
// const->immutable
console.log("Value of a is", a);
// Check the data type of the mentioned variable
console.log(typeof a);
// It is always String of more than one typeof
console.log(typeof typeof a);
let arr = [1,2,3,4,5];
let ar = [1,2,3,'c',"hello",true,false];
console.log(typeof ar);// Object Type...
// Object is a collection of key-value pair
// Key- String or number , Value - any datatype,
var obj = {
name:"Rajat",
city:"Dharamshala",
address:"sdjhfbhw",
designation:"hat",
"state name":"jkdnfuy",
age:27,
78:79
};
console.log(obj["state name"]);
obj.aim = 90;//adding the value to obj;
obj['aim'] = 100;// same as above;
console.log(obj.aim);
delete obj.aim; // deleting the value of obj's element;
console.log(obj.aim);// undefined ;
obj["state name"] = "Himachal Pradesh";// I can change the value of any element of an object // update the value;
var num = 78;
var number = obj[num];
console.log(number);
console.log(obj.age);

// Keys in object is separated by commas
console.log(obj);
console.log(obj.city);
console.log(obj["state name"]);// basically this [] thing is used when there is space in between the name of the objedt value.

// Js is synchoronous(one command at a time) and a single thread (only one thread i.e. main thread will do all the tasks)
// Memory phase is variable environment and Code phase is thread of execution.
// arrayname.shift() removes the first element in the array
// arrayname.pop() removes the last element in the array
// arrayname.push([],string,number) i.e. anything to the array in the last position of the array
// arrayname.unshift([],string,number) i.e. anything to the array in the first position of the array
var myList = [[],[],[]]; // 2-d array in js with index values as myList[i][j]
function ourWorld(){
    console.log("my Name is anthony");
}
ourWorld();
ourWorld();
ourWorld();
ourWorld();
function nyfunction(a,b){
    console.log(a-b);
}
nyfunction(10,5);


var global = 10;
// const myglobal = 6;
function fun1(){
 myglobal = 8; // if with no initialising it can be used in other function eg: in line 67 it is used and giving output.
}
function fun2(){
    var output = "";
    if(global != "undefined"){
        output += "global is "+global+" ";
    }
    if(myglobal != "undefined"){
        output += "myGlobal is "+myglobal;
    }
    console.log(output);
}
fun1();
fun2();
// fun1();
var myClothes = "T-Shirt";
function wear(){
    var myClothes = "sweater"; // we can change/ update the same variable name but locally not globally as you can see the output in line 80;
    return myClothes;
}
console.log(wear());
console.log(myClothes);
  

function numb(num){
    return num - 7;
}
console.log(numb(10));
 
var num = 0;
function addThree(){
    num += 3;
}
console.log(num);


var test = [1,2,3,4,5];
function myArray(arr,item){
    arr.push(item);
    return arr.shift();
}
console.log(test);
console.log(myArray(test,6));
console.log(test);
/*  3 == 3 or 3 == '3' it is equal in if statement
but 3 === 3 is equal but 3 === '3' is not equal in if statement 
i.e. === is strict equal which doesnot convert and check on other side == converts and then checks the value.
 */
function compare1(a,b){
    if(a === b){
        return "Equal";
    }
    return "Not Equal";
}
function compare2(a,b){
    if(a == b){
        return "Equal";
    }
    return "Not Equal";
}
console.log(compare1(10,"10"));// Not Equal === operator do not do type conversion before comparison.
console.log(compare2(10,"10")); // Equal becuase == operator does type conversion and then checks.
//  Not Equality operator != works as vice-versa of ==
// And !== works vice versa of === operator.
var myObj = {
    "name" : "RAJAT",
    "Student": "YES"
};
function checkProperty(val){
    if(myObj.hasOwnProperty(val)){
        console.log(myObj[val]);
    }else{
        console.log("Not Found");
    }
}
checkProperty("name");
var myArray = [];
var i = 0;
while(i < 5){
myArray.push(i);
myArray.unshift(i);
i++;
}
for(let j = 0 ;j < 10;j++){
    myArray.push(j);
    myArray.unshift(i);
    i++;
}
console.log(myArray);
function multiplyall(arr){
    var multipl = 1;
    for(var i=0;i<arr.length;i++){
        for(var j=0;j<arr[i].length;j++){
            multipl *= arr[i][j];
        }
    }
    console.log(multipl);
}
multiplyall([[1,2,3],[3,4],[1,1,1]]);
