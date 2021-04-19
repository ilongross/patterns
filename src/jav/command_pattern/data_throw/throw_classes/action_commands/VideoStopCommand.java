package jav.command_pattern.data_throw.throw_classes.action_commands;

import jav.command_pattern.data_throw.Command;
import jav.command_pattern.data_throw.throw_classes.VideoThrow;

public class VideoStopCommand implements Command {

    private VideoThrow video;

    public VideoStopCommand(VideoThrow video) {
        this.video = video;
    }

    @Override
    public void execute() {
        video.stop();
    }
}
