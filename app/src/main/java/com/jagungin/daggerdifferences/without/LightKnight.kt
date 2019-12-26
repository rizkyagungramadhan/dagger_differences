package com.jagungin.daggerdifferences.without

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class LightKnight {
    //Create Instance/Object from Senjata class
    private val senjata = Senjata()

    //Function for returning string value
    fun setEquip(): String{
        return "LightKnight army begin war using ${senjata.pedang()}"
    }
}