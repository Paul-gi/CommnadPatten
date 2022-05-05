package com.example.commandpattern.equipment

import android.util.Log

class CeilingLight(mName: String) {

    fun on() {
        Log.d("actionLight", this.javaClass.simpleName + " On")
    }

    fun off() {
        Log.d("actionLight", this.javaClass.simpleName + " Off")
    }

}