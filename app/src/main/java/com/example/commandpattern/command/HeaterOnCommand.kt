package com.example.commandpattern.command

import com.example.commandpattern.equipment.Heater

class HeaterOnCommand(private val mHeater: Heater) : Command {


    override fun execute() {
        mHeater.on()
    }

    override fun undo() {
        mHeater.off()
    }
}