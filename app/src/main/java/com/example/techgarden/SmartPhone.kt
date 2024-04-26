package com.example.techgarden

import android.util.Log

class SmartPhone(brand: String, model: String, state: State) : Device(brand, model, state) {

    val dualSim: Boolean = true

    companion object {
        val listSmartPhone = mutableListOf<String>(

            "hola"

        )

    }

}