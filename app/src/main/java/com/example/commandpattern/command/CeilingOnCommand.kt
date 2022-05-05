package com.example.commandpattern.command

import com.example.commandpattern.equipment.CeilingLight

class CeilingOnCommand(private val mCeilingLight: CeilingLight) : Command {


    override fun execute() {
        mCeilingLight.on()
    }

    override fun undo() {
        mCeilingLight.off()
    }
}