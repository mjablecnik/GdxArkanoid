package com.applemann.arkanoid.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.applemann.arkanoid.GdxArkanoid

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        config.width = 800
        config.height = 600
        LwjglApplication(GdxArkanoid(), config)
    }
}
