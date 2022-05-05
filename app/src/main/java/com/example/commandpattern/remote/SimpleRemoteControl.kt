package com.example.commandpattern.remote

import com.example.commandpattern.command.Command

class SimpleRemoteControl(private var mSlot: Command) {

    fun setCommand(pCommand: Command) {
        mSlot = pCommand
    }

    fun buttonWasPressed() {
        mSlot.execute()
    }
}