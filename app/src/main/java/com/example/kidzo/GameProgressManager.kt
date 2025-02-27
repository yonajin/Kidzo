package com.example.kidzo

import android.content.Context
import android.content.SharedPreferences

class GameProgressManager(context: Context) {
    private val sharedPref: SharedPreferences = context.getSharedPreferences("GamePrefs", Context.MODE_PRIVATE)

    fun unlockLevel(level: Int) {
        val editor = sharedPref.edit()
        editor.putBoolean("level_$level", true)
        editor.apply()
    }

    fun isLevelUnlocked(level: Int): Boolean {
        return sharedPref.getBoolean("level_$level", level == 1)  // Level 1 is always unlocked
    }
}
