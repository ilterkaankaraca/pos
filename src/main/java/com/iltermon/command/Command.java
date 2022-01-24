package com.iltermon.command;

public abstract class Command {
    public void execute() {
        System.out.println("Command executed");
    }

    public void undo() {
        System.out.println("Command undone");
    }
}
