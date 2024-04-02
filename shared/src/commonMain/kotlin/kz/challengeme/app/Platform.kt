package kz.challengeme.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform