package jav.command_pattern.data_throw;

import jav.command_pattern.data_throw.throw_classes.AudioThrow;
import jav.command_pattern.data_throw.throw_classes.PicturesThrow;
import jav.command_pattern.data_throw.throw_classes.VideoThrow;
import jav.command_pattern.data_throw.throw_classes.action_commands.*;

import java.util.Random;

public class CommandsCreater {

    private ProcessExecuter executer = new ProcessExecuter();
    private Command[] commandsType = {
            new AudioStartCommand(new AudioThrow()),
            new AudioStopCommand(new AudioThrow()),
            new PicturesViewStartCommand(new PicturesThrow()),
            new PicturesViewStopCommand(new PicturesThrow()),
            new VideoStartCommand(new VideoThrow()),
            new VideoStopCommand(new VideoThrow())
    };
    private static long counter = 0;


    public CommandsCreater() {
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            executer.setCommands(commandsType[rand.nextInt(6)]);
            counter++;
        }
    }

    public void execute() {
        executer.executeProcesses();
        System.out.println(counter);
    }

}
