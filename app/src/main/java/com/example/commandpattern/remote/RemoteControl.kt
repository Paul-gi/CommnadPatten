package com.example.commandpattern.remote

import com.example.commandpattern.command.Command

class RemoteControl() {

    private val mCommandOn = ArrayList<Command>()
    private val mCommandOff = ArrayList<Command>()


    fun setCommand(pSlot: Int, pOnCommand: Command, pOffCommand: Command) {
        mCommandOn.add(pSlot, pOnCommand)
        mCommandOff.add(pSlot, pOffCommand)
    }

    fun OnButtonWasPressed(pSlot: Int) {
        mCommandOn[pSlot].execute()
    }

    fun OffButtonWasPressed(pSlot: Int) {
        mCommandOff[pSlot].undo()
    }

    fun unDoButtonWasPressed() {
        for (iUndo in mCommandOff) {
            iUndo.undo()
        }
    }
}