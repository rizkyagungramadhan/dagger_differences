package com.jagungin.daggerdifferences.dagger.scope

import dagger.Module
import dagger.Provides

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 27/12/2019.
 */
@Module
class ArmyModule {
    private var army = 3

    @BattleScope
    @Provides
    fun uniqueArmy(): UniqueArmy{
        return UniqueArmy(army++)
    }

    @Provides
    fun normalArmy(): NormalArmy{
        return NormalArmy(army++)
    }


}