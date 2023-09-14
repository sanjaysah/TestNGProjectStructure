package com.thetestingacademy.Profiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeProfilingOptions {

    @Test
    public void chromeProfilingOptions(){
        //Chrome browser Logs in mentioned file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_APPEND_LOG_PROPERTY,"logs/chrome.log");
        // Silent output in console, no logs
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--ignore-certificate-errors");
        //options.addArguments("--proxy-server=http://89.2872.292.2/9090");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
    }
}
