package jav.command_pattern.data_throw.throw_classes.action_commands;

import jav.command_pattern.data_throw.Command;
import jav.command_pattern.data_throw.throw_classes.AudioThrow;

public class AudioStopCommand implements Command {

    private AudioThrow audio;

    public AudioStopCommand(AudioThrow audio) {
        this.audio = audio;
    }

    @Override
    public void execute() {
        audio.stop();
    }
}
