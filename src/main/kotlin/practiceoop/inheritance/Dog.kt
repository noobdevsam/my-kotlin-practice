package org.example.practiceoop.inheritance

class Dog(name: String, val breed: String): Animal(name) {
    fun bark() {
        println("Woof!")
    }
}