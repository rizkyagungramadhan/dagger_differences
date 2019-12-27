package com.jagungin.daggerdifferences.dagger

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
@Component(modules = [BattleModule::class])
interface BattleComponent {
    //get the context from activity which is receiving injector
    fun inject(context: DaggerActivity)
}