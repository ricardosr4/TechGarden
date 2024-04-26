package com.example.techgarden.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.techgarden.Computer
import com.example.techgarden.Device
import com.example.techgarden.R
import com.example.techgarden.SmartPhone
import com.example.techgarden.State
import com.example.techgarden.Tablet
import com.example.techgarden.databinding.ActivityHomeTechGardenBinding

class HomeTechGarden : AppCompatActivity() {

    private lateinit var binding: ActivityHomeTechGardenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeTechGardenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val etBrand = binding.etBrand
        val etModel = binding.etModel
        val etState = binding.etState
        val tvResult = binding.tvResult


        //aqui se llama a la funcion cuando se presiona el boton
        binding.btnShowDevice.setOnClickListener {
            showDevide()

        }
        binding.btnAddDevice.setOnClickListener {
            val brand = etBrand.text.toString()
            val model = etModel.text.toString()
            val state: State = State.valueOf(etState.text.toString())

         // esta funcion aun no se logra
            var device = SmartPhone(brand, model, State.NUEVO)
            SmartPhone.listSmartPhone.add("")
            cleanCamp()


        }
        binding.btnRemoveDevice.setOnClickListener {
            removeDevice()
        }
        binding.btnRemoveDevice.setOnClickListener {
            searchDevice()
        }


    }

    private fun searchDevice() {
        TODO("Not yet implemented")
    }

    private fun removeDevice() {
        TODO("Not yet implemented")
    }

    private fun addDevice(device: Device) {
        TODO("Not yet implemented")
    }

    //funcion para mostrar todos los dispositivos
    private fun showDevide() {
        val result = StringBuilder("lista de dispositivos registrados:\n")
        SmartPhone.listSmartPhone.forEach { device ->
            result.append("$device\n")
        }
        binding.tvResult.text = result.toString()
    }

    //funcion para limpiar campos
    fun cleanCamp() {
        binding.apply {
            etBrand.text.clear()
            etModel.text.clear()
            etModel.text.clear()
        }
    }


}