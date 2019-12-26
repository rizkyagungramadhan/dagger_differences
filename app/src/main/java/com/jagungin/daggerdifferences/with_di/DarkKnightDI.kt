package com.jagungin.daggerdifferences.with_di


/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class DarkKnightDI(private val senjatDI: SenjataDI){
    //create Function to return string value
    fun setEquip_DI(): String{
        return "DarkKnight army begin war using ${senjatDI.tombakDI()}"
    }
}