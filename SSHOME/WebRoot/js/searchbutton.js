// JavaScript Document
function su(number){
var x=document.getElementById("number"+number).innerHTML;
var su=document.getElementById("sub"+number);
if(parseInt(x)>0){
	x=parseInt(x)-1;console.log(x);
document.getElementById("number"+number).innerHTML=x;	
}
}
function add(number){
var x=document.getElementById("number"+number).innerHTML;
	var add=document.getElementById("add"+number);
if(parseInt(x)<5){
	x=parseInt(x)+1;
	document.getElementById("number"+number).innerHTML=x;
}
}