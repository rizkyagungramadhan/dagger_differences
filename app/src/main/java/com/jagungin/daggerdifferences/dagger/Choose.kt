package com.jagungin.daggerdifferences.dagger

import javax.inject.Qualifier

/**
 * Created by Rizky Agung Ramadhan
( rizkyagungramadhan@gmail.com ) on 26/12/2019.
 */
@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Choose(val value: String = "")