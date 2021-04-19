package jav.command_pattern.data_throw.throw_classes.action_commands;

import jav.command_pattern.data_throw.Command;
import jav.command_pattern.data_throw.throw_classes.PicturesThrow;

public class PicturesViewStartCommand implements Command {

    private PicturesThrow view;

    public PicturesViewStartCommand(PicturesThrow view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.start();
    }
}
