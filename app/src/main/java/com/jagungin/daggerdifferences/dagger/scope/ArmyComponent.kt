package com.jagungin.daggerdifferences.dagger.scope

import dagger.Component

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 27/12/2019.
 */
@BattleScope
@Component(modules = [ArmyModule::class])
interface ArmyComponent {
    fun inject(house: House)
}