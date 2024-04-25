package com.example.techgarden.ui.activity

import android.os.Bundle
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
        binding= ActivityHomeTechGardenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var miComputer = Computer("acer", "intel i5", State.EN_REPARACION)
        val myTablet= Tablet("amazon","a1",State.NUEVO)
        val mySmartPhone = SmartPhone("Samsung","s22",State.USADO)

        binding.tvResult.text = mySmartPhone.getListSmartPhone()

       // mySmartPhone.ok3()
       // binding.tvTitle.text = mySmartPhone.ok3().toString()



    }
}