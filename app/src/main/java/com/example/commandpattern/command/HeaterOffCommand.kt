package com.example.commandpattern.command

import com.example.commandpattern.equipment.Heater
import com.example.commandpattern.equipment.Light

class HeaterOffCommand(private val mHeater: Heater) : Command {


    override fun execute() {
        mHeater.off()
    }

    override fun undo() {
        mHeater.off()
    }
}