package com.jagungin.daggerdifferences.dagger

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class SenjataDagger(private val pedangDagger: String, private val tombakDagger: String){

    fun tombak_Dagger(): String { return tombakDagger}
    fun pedang_Dagger(): String { return pedangDagger}
}