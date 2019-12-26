package com.jagungin.daggerdifferences.dagger

import javax.inject.Inject
import com.jagungin.daggerdifferences.without.Senjata


/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class DarkKnightDagger @Inject constructor(
    @Choose("MainWeapon") val senjataMain: SenjataDagger, @Choose(
        "SecondWeapon"
    ) var senjataSecond: SenjataDagger
) {

    //add 2 qualifier
    /*   @Inject
       @Choose("MainWeapon")
       lateinit var senjataMains: SenjataDagger

       @Inject
       @Choose("SecondWeapon")
       lateinit var senjataSeconds: SenjataDagger*/

    //create Function to return string value
    fun setEquip_Dagger(): String {
        //return "DarkKnight Dagger army begin war using ${senjata.tombak_Dagger()}"
        return "DarkKnight Dagger army begin war using ${senjataMain.tombak_Dagger()} dan ${senjataSecond.tombak_Dagger()}"
    }
}