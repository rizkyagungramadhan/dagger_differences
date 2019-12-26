package com.jagungin.daggerdifferences.dagger

import javax.inject.Inject

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class DarkKnightDagger @Inject constructor() {
   /* @Inject
    fun DarkNight(){}
*/
    //create Function to return string value
    fun setEquip_DI(): String{
        return "DarkKnight Dagger army begin war using Tombak Dagger"
    }
}