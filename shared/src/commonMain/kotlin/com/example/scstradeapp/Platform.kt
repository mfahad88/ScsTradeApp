package com.example.scstradeapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform