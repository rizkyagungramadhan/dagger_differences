package com.jagungin.daggerdifferences.dagger

import dagger.Module
import dagger.Provides

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
@Module
class BattleModule {
    //provide dependencies wi=hich will used with parameter
    @Provides
    fun setSenjata(): SenjataDagger{
        return SenjataDagger("Pedang Larva Dagger", "Tombak Halilintar Dagger")
    }
}