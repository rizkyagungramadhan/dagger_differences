package com.jagungin.daggerdifferences.dagger.scope

import javax.inject.Inject

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 27/12/2019.
 */
class House {

    @Inject
    lateinit var uniqueArmy: UniqueArmy

    @Inject
    lateinit var normalArmy: NormalArmy

}