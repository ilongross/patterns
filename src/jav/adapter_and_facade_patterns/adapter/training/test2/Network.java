package jav.adapter_and_facade_patterns.adapter.training.test2;


public class Network {
    public static void main(String[] args) {
        OperationSystem windows = new Windows();
        OperationSystem android = new Android();
        OperationSystem macOS = new MacOS();

        Server server = new Server(
                new AdapterOS(windows), new AdapterOS(android), new AdapterOS(macOS));
        server.sendUpdates();
    }
}
