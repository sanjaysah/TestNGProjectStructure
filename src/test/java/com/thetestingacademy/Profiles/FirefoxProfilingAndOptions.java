package com.thetestingacademy.Profiles;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class FirefoxProfilingAndOptions {
    @Test
    public void firefoxprofiles(){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"logs/Firefox.log");
        FirefoxOptions foptions = new FirefoxOptions();
        ProfilesIni allProf = new ProfilesIni();
        FirefoxProfile prof1 = allProf.getProfile("SanjaySah");
        //Notification suppress
        prof1.setPreference("dom.webnotifications.enabled",false);
        //SSL Certificate issue suppress
        prof1.setAcceptUntrustedCertificates(true);
        prof1.setAssumeUntrustedCertificateIssuer(false);
        // proxy settings
        prof1.setPreference("network.proxy.type",1);
        prof1.setPreference("network.proxy.socks","198.0.0.11");
        prof1.setPreference("network.proxy.socks_port",1818);
        foptions.setProfile(prof1);

        FirefoxDriver fdriver = new FirefoxDriver(foptions);
        //fdriver.get("https://www.gmail.com");
        fdriver.get("https://www.pushengage.com/demo");
    }
}
