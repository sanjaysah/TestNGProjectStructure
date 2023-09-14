package com.thetestingacademy.Profiles;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IEOptions {
    @Test
    public void InternetExplorerOptions(){
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.setCapability("--start-maximized");
        DesiredCapabilities cap = new DesiredCapabilities();

        String proxy = "82.876.98.0";
        Proxy p = new Proxy();
        p.setAutodetect(false);
        p.setProxyType(Proxy.ProxyType.MANUAL);
        p.setSocksProxy(proxy);

        cap.setCapability(CapabilityType.PROXY,p);
        options.merge(cap);

        InternetExplorerDriver driver = new InternetExplorerDriver(options);
    }
}
