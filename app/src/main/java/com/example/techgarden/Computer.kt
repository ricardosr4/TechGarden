package com.example.techgarden

class Computer(val brand: String, val model: String, val state: State) : Device(brand, model, state) {

    val cpu: String = ""
    val ram: Int = 0
//funciones de muestra
    fun ok1(): String {
        return "okidoki"

    }

    fun ram(): Int {
        return 16
    }


}