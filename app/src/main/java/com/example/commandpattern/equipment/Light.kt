package com.example.commandpattern.equipment

import android.util.Log

class Light(private var mName: String) {


    fun on() {
        Log.d("actionLight", this.javaClass.simpleName + " On")
    }

    fun off() {
        Log.d("actionLight", this.javaClass.simpleName + " Off")
    }

    fun setName(pName: String) {
        mName = pName
    }


}