package jav.proxy_pattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class TestRemote {
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
