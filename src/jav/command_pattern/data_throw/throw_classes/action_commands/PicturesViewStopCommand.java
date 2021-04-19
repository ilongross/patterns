package jav.command_pattern.data_throw.throw_classes.action_commands;

import jav.command_pattern.data_throw.Command;
import jav.command_pattern.data_throw.throw_classes.PicturesThrow;

public class PicturesViewStopCommand implements Command {

    private PicturesThrow view;

    public PicturesViewStopCommand(PicturesThrow view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.stop();
    }
}
