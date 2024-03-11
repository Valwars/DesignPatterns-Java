package Structural.Proxy.Internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("banned.com");

    }
    @Override
    public void connectTo(String host) {
        if(bannedSites.contains(host.toLowerCase())){
            System.out.println("Access Denied" + " for " + host);
            return;
        }
        internet.connectTo(host);
    }
}
