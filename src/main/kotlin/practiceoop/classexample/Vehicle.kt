package org.example.practiceoop.classexample

// class with Primary Constructor
class Vehicle(
    val brand: String,
    val model: String,
    val price: Int) {

    // defining secondary constructor
    constructor(brand: String, model: String): this(brand, model, 0) {}

    fun showDetails() {
        println("Brand: $brand Model: $model Price: $price")
    }
}