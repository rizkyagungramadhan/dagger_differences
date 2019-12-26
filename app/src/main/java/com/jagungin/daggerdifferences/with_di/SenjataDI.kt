package com.jagungin.daggerdifferences.with_di

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class SenjataDI (private val namaPedang:String, private val namaTombak: String) {

    //create 2 weapons function to return a string value with differennt data
    fun tombakDI(): String { return namaTombak}
    fun pedangDI(): String { return namaPedang}
}