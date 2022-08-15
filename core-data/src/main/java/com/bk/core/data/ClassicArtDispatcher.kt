package com.bk.core.data

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
annotation class Dispatcher(val classicArtDispatchers: ClassicArtDispatchers)

enum class ClassicArtDispatchers {
    IO
}
