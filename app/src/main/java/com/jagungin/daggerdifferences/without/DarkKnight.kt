package com.jagungin.daggerdifferences.without

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class DarkKnight {
    //create Instance/Object from Senjata class
    private val senjata = Senjata()

    //create function to return the String
    fun setEquip(): String{
        return "DarkKnight army begin war using ${senjata.tombak()}"
    }
}