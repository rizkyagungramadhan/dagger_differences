package com.jagungin.daggerdifferences.dagger

import javax.inject.Inject
import com.jagungin.daggerdifferences.without.Senjata


/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class LightKnightDagger @Inject constructor(
    @Choose("MainWeapon") val senjataMain: SenjataDagger, @Choose(
        "SecondWeapon"
    ) val senjataSecond: SenjataDagger
) {

    //create Function to return string value
    fun setEquip_Dagger(): String {
        //return "LightKnight Dagger army begin war using ${senjara.pedang_Dagger()}"
        return "LightKnight Dagger army begin war using ${senjataMain.pedang_Dagger()} dan ${senjataSecond.pedang_Dagger()}"
    }
}