package com.example.commandpattern.equipment

import android.util.Log

class Heater(mName: String) {
    var mHot = "mHot"
    var mWarm = "mWarm"
    var mOff = "mOff"
    var mHeatType = "mHeatType"

    fun on() {
        mHeatType = mHot
        Log.d("actionLight", this.javaClass.simpleName + " On")
    }

    fun off() {
        if (mHeatType == mHot) {
            mHeatType = mWarm
        } else if (mHeatType == mWarm) {
            mHeatType = mOff
        } else {
            mHeatType = mOff
        }
        Log.d("actionLight", this.javaClass.simpleName + " Off")
    }
}