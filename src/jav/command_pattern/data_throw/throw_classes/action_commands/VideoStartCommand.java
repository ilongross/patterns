package jav.command_pattern.data_throw.throw_classes.action_commands;

import jav.command_pattern.data_throw.Command;
import jav.command_pattern.data_throw.throw_classes.VideoThrow;

public class VideoStartCommand implements Command {

    private VideoThrow video;

    public VideoStartCommand(VideoThrow video) {
        this.video = video;
    }

    @Override
    public void execute() {
        video.start();
    }
}
