package com.kmm.noteappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform