package com.talha.learnkotlin

//Constructor- Primary and Secondary
// initializer Blocks
// Class has 2 things - properties & methods
// initialize object & provide default values to properties
// we create class for we need object in that properties & methods
//in that properties/object  we want to give default value
//so we use constructor
//simple in a class we have two things properties & methods

fun main (){
    //object
    // in that we are providing default value to the object
    var car = Automobile("Car",4,5)//properties
}
//class
class Automobile(val name: String, val tyres: Int, val maxSeating: Int ){// primary constructor
    fun drive(){}
    fun applyBreaks(){}
}