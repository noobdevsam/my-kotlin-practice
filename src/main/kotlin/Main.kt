package org.example

import org.example.practiceoop.classexample.Vehicle
import org.example.practiceoop.inheritance.Animal
import org.example.practiceoop.inheritance.Cat
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

    // using inheritance - 1
    /*
    val dg = Dog(
        "Buddy", "Golden Retriever"
    )
    dg.eat() // inherited from Animal
    dg.bark() // specific to Dog

    println(dg.breed) // from Dog
    println(dg.name) // from Animal
     */

    // using inheritance - 2
    val c1 = Cat("Whiskers")
    c1.makeSound() // calls the overridden function

    val m1: Animal = Cat("Whisk") // Polymorphism
    m1.makeSound() // calls the overridden function from Cat

    val m2: Animal = Animal("Generic") // Polymorphism
    m2.makeSound() // calls the original function

}