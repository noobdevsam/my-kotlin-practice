package org.example.practiceoop.inheritance

/*
*  Kotlin uses the : symbol to denote inheritance.
*  By default, classes in Kotlin are final, meaning they cannot be inherited from.
*  You must explicitly declare a class as open to allow inheritance.
* */

open class Animal(val name: String) {
    // open keyword is essential for inheritance

    fun eat() {
        println("$name is eating")
    }

    // 'open' for allowing overriding
    open fun makeSound() {
        println("Generic animal sound")
    }
}