package com.talha.learnkotlin

                    //KOTLIN - OOP LANGUAGE
                        //• OOP - Object Oriented Programming.
                        //• Paradigm which allows us to solve problems with the help of objects which represents the real world entities.
                        //. set of object interact and solve the problem

                    //CLASSES & OBJECTS
                        //• Class is a blueprint or template.
                        //• Objects are the real thing.
                        //• You create objects in your program and they interact with each other to complete the work.

                    //DESIGN A CLASS
                        //• Properties or Fields (Object knows)
                        //• Methods (Object Does)
                //SUMMARIZE
                    //OOP ME HAM KYA KARTE HAIN KUCH SET OF OBJECT BANATE HAIN VO APAS ME INTERACT KARATE HAIN PROBLEM KO SOLVE KARNE KE LIYE
                    //VO OBJECT BANEGE KAISE ISLEYA HAMRE PASS CLASSES HOTI HAI
                    //CLASS A DEFINE KARTI HAI KI OBJECT KIS TARIKE KA HOGA
                    //ONE OBJECT IS DIFFERENT FROM ANOTHER OBJECT ITS AN REAL WORLD ENTITIES
//fun main(){
//    val  punch = Car("punch","petrol",100)
//    val  bmw = Car("bmw","disel",1000)
//
//     println(punch.name)
//     println(punch.Kmran)
//     println(bmw.name)
//     bmw.driveCar()
//     punch.applyBreaks()
//}
//class Car (val  name: String, val type: String, var Kmran : Int)   //Properties
//{
//    fun driveCar(){ //methods
//        println("${name} Car Is Driving")
//    }
//    fun applyBreaks(){
//        println("${name} Applied Breaks")
//    }
//}

                                        //More About Classes
//in these we will see differnt point ofv view
//what we are doing back is that when ever i want to  store a data we use
// var age: Int =10 for
//decimal no i use float or double
//What if i want to store information about Student or Car or Account?Do we have  any data type for that?
// we cant write like these //var mycar: car = Information about car
// for eg we dont have data type of var mycar Car
//in OOP Languages in which we can create User Defined Data Type
// like how int, float work we can also create our own data type by the use of  class
// class is an user defined data type in that we can store complex data
//eg i want to store student information i will create a data type of student in that i will track  info


// in class we have <Properties> and <Methods>
// properties store over data
// method is an normal function who works on that data

fun main(){
    var i: Int = 20
    println(i.plus(30))
    println(i.toFloat())
    // main point is that method always work on properties values
    // what ever the properties values method always work around him
    val p1 = Person("A",21)
    val p2 = Person("b",16)
    println(p1.canvote())
    println(p2.canvote())
}
class Person(val name: String, var age: Int){ // Properties
    //Methods
    fun canvote(): Boolean{
        return age>18
    }

}

        // how class and object work?
//cookie Cutter <Class>      // Cookies<Actual Object>
//class  is nothing but an blue print it will show how the object look like
//object is an real world entites