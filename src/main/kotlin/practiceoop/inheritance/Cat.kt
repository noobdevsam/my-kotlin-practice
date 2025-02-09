package org.example.practiceoop.inheritance

class Cat(name: String) : Animal(name) {

    // 'override' keyword to override something
    override fun makeSound() {
//        super.makeSound()
        println("Calling $name")
        println("Meow")
    }
}