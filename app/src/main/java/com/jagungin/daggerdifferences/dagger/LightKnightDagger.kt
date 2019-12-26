package com.jagungin.daggerdifferences.dagger

import javax.inject.Inject

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
class LightKnightDagger @Inject constructor() {

   /* @Inject
    fun LightKnightDagger(){}*/

    //create Function to return string value
    fun setEquip_Dagger(): String{
        return "LightKnight Dagger army begin war using Pedang Dagger"
    }
}