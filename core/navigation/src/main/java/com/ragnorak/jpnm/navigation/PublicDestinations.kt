package com.ragnorak.jpnm.navigation

import kotlinx.serialization.Serializable

interface Route

@Serializable
object Main : Route

@Serializable
object Feature1 : Route

@Serializable
object Feature2 : Route