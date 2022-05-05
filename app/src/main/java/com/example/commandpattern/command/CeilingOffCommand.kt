package com.example.commandpattern.command

import com.example.commandpattern.equipment.CeilingLight

class CeilingOffCommand(private val mCeilingLight: CeilingLight) : Command {


    override fun execute() {
        mCeilingLight.off()
    }

    override fun undo() {
        mCeilingLight.off()
    }
}