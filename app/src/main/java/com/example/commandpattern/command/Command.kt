package com.example.commandpattern.command

interface Command {
    fun execute()
    fun undo()
}