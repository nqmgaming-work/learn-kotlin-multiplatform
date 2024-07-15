package com.nqmgaming.learnkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform