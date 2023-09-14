package com.thetestingacademy.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.util.Date;

public class ExtentManager {
    static ExtentReports reports;

    public static ExtentReports getReports(){
        if(reports==null){
            reports = new ExtentReports();
            //Create Dynamic folder name using date class for no overwrite for every result
            Date d = new Date();
            String reportFolderPath = System.getProperty("user.dir")+"/target/Reports/"+d.toString().replace(":","-")+"/";
            String ScreenshotFolderPath = reportFolderPath+"screenshots/";
            File file = new File(ScreenshotFolderPath);
            file.mkdirs();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFolderPath);
            sparkReporter.config().setReportName("Extent Report Practice");
            sparkReporter.config().setDocumentTitle("Extent Report Document");
            sparkReporter.config().setTheme(Theme.STANDARD);
            sparkReporter.config().setEncoding("utf-8");

            reports.attachReporter(sparkReporter);
        }
        return reports;
    }

}
