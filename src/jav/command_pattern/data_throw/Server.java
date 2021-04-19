package jav.command_pattern.data_throw;

public class Server {
    public static void main(String[] args) {
        CommandsCreater creater = new CommandsCreater();
        creater.execute();
    }
}
