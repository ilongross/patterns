package jav.command_pattern.data_throw.throw_classes.action_commands;

import jav.command_pattern.data_throw.Command;
import jav.command_pattern.data_throw.throw_classes.AudioThrow;

public class AudioStartCommand implements Command {

    private AudioThrow audio;

    public AudioStartCommand(AudioThrow audio) {
        this.audio = audio;
    }

    @Override
    public void execute() {
        audio.start();
    }
}
