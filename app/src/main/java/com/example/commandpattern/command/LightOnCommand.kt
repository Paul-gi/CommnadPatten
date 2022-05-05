package com.example.commandpattern.command

import com.example.commandpattern.equipment.Light

class LightOnCommand(private val mLight: Light) : Command {


    override fun execute() {
        mLight.on()
    }

    override fun undo() {
        mLight.off()
    }
}