package com.example.commandpattern.command

import com.example.commandpattern.equipment.Light

class LightOffCommand(private val mLight: Light) : Command {



    override fun execute() {
        mLight.off()
    }

    override fun undo() {
        mLight.off()
    }
}