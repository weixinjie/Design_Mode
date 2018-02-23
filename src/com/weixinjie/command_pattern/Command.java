package com.weixinjie.command_pattern;

public interface Command {
    public void execute();

    public void undo();

    public void redo();
}
