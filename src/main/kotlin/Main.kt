package org.example

import org.example.practiceoop.classexample.Vehicle
import org.example.practiceoop.inheritance.Dog

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //start here

    //using class
//    val v1 = Vehicle("X", "Y", 465)
//    v1.showDetails()
//
//    val v2 = Vehicle("Xvv", "gttY")
//    v2.showDetails()

    val dg = Dog(
        "Buddy", "Golden Retriever"
    )
    dg.eat() // inherited from Animal
    dg.bark() // specific to Dog

    println(dg.breed) // from Dog
    println(dg.name) // from Animal

}










