package Structural.Proxy.Internet;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String host) {

        /*
        Instead of doing that, we can use the proxy pattern to check if the host is banned or not.
        if ("banned.com".equals(host)) {
            System.out.println("Access Denied" + " for " + host);
            return;
        } */
        System.out.println("Connecting to " + host);
    }
}
