package com.conscifora.arenaservice

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<CfLangArenaServiceApplication>().with(TestcontainersConfiguration::class).run(*args)
}
