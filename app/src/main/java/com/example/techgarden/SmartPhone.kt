package com.example.techgarden

class SmartPhone(brand: String, model: String, state: State) : Device(brand,model, state){

    val dualSim = Boolean
    companion object{
    val listSmartPhone = mutableListOf<Device>(
        Computer("acer","intel i5", State.NUEVO),
        Computer("HP", "AMD Rayzer 5", State.USADO),
        Tablet("Lenovo", "A8", State.EN_REPARACION),
        SmartPhone("Samsung", "S22", State.EN_REPARACION)



    )
    }
    fun getListSmartPhone(): String {
        val stringBuilder = StringBuilder()
        for (device in listSmartPhone) {
            stringBuilder.append(device.toString()).append("\n")
        }
        return stringBuilder.toString()
    }


   /*fun ok3(): Boolean {
        return true
    }
    */
}