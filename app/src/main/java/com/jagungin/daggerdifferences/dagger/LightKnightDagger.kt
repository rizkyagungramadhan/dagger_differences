package com.jagungin.daggerdifferences.dagger

import javax.inject.Inject

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class LightKnightDagger @Inject constructor(val senjara: SenjataDagger) {

   /* @Inject
    fun LightKnightDagger(){}*/

    //create Function to return string value
    fun setEquip_Dagger(): String{
        return "LightKnight Dagger army begin war using ${senjara.pedang_Dagger()}"
    }
}