package com.jagungin.daggerdifferences.with_di

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class LightKnightDI(private val senjatDi: SenjataDI) {
    //create function to return string value
    fun setEquip_DI(): String{
        return "LightKnight army begin war using ${senjatDi.pedangDI()}"
    }
}