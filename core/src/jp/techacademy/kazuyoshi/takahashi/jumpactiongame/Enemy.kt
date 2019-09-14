package jp.techacademy.kazuyoshi.takahashi.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Enemy(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {
        // 横幅、高さ
        val ENEMY_WIDTH = 1.5f
        val ENEMY_HEIGHT = 2.5f
    }

    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)
    }
}