package com.example.testingkmmfromios

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform