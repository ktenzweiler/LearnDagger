package com.example.learndagger.di

import javax.inject.Qualifier
import javax.inject.Scope

@Qualifier
annotation class HorsePower

@Qualifier
annotation class Cylinders

@Scope
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity()

@Scope
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class PerApplication()