package com.example.commandpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.commandpattern.command.*
import com.example.commandpattern.equipment.Light
import com.example.commandpattern.equipment.CeilingLight
import com.example.commandpattern.equipment.Heater
import com.example.commandpattern.remote.RemoteControl

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mLight = Light("PaulLight")
        val mLightOn = LightOnCommand(mLight)
        val mLightOff = LightOffCommand(mLight)

        val mCeilingLight = CeilingLight("CeilingLight")
        val mCeilingLightOn = CeilingOnCommand(mCeilingLight)
        val mCeilingLightOff = CeilingOffCommand(mCeilingLight)

        val mHeaterLight = Heater("HeaterLight")
        val mHeaterLightOn = HeaterOnCommand(mHeaterLight)
        val mHeaterLightOff = HeaterOffCommand(mHeaterLight)

        val mRemote = RemoteControl()



        mRemote.setCommand(0, mLightOn, mLightOff)
        mRemote.OnButtonWasPressed(0)

        mRemote.setCommand(1, mCeilingLightOn, mCeilingLightOff)
        mRemote.OffButtonWasPressed(1)
        mRemote.OnButtonWasPressed(1)


        mRemote.setCommand(2, mHeaterLightOn, mHeaterLightOff)
        mRemote.OffButtonWasPressed(2)


        mRemote

    }
}