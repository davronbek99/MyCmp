package dev.davron.mycmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform