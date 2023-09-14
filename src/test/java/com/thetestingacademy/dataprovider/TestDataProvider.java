package com.thetestingacademy.dataprovider;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class TestDataProvider {
    static String[] browser;
    @DataProvider
    public static Object[][] dataSuiteA(ITestContext context, Method m){
        browser = context.getCurrentXmlTest().getParameter("browsers").split(",");
        Object[][] data = null;
        if(m.getName().toUpperCase().equals("TESTA")) {
            data = new Object[2][3];
            data[0][0]=browser[0];
            data[0][1] = "AU1";
            data[0][2] = "AP1";
            data[1][0]=browser[1];
            data[1][1] = "AU2";
            data[1][2] = "AP2";
        }
        else if(m.getName().toUpperCase().equals("TESTAA")){
            data = new Object[2][3];
            data[0][0]=browser[0];
            data[0][1]="AAU1";
            data[0][2]="AAP1";
            data[1][0]=browser[1];
            data[1][1]="AAU2";
            data[1][2]="AAP2";
        }
        return data;
    }

    @DataProvider
    public static Object[][] dataSuiteB(Method m, ITestContext context){
        browser = context.getCurrentXmlTest().getParameter("browsers").split(",");
        Object[][] data = null;
        if(m.getName().toUpperCase().equals("TESTB")){
            {
                data = new Object[2][3];
                data[0][0]=browser[0];
                data[0][1]="BU1";
                data[0][2]="BP1";
                data[1][0]=browser[1];
                data[1][1]="BU2";
                data[1][2]="BP2";
            }
        }
        else if(m.getName().toUpperCase().equals("TESTBB")){
            {
                data = new Object[2][3];
                data[0][0]=browser[0];
                data[0][1]="BBU1";
                data[0][2]="BBP1";
                data[1][0]=browser[1];
                data[1][1]="BBU2";
                data[1][2]="BBP2";
            }
        }
        return data;
    }

    @DataProvider
    public static Object[][] dataSuiteC(Method m, ITestContext context){
        Object[][] data = null;
        browser = context.getCurrentXmlTest().getParameter("browser").split(",");
        if(m.getName().toUpperCase().equals("TESTC")) {
            data = new Object[2][3];
            data[0][0]="browser[0]";
            data[0][1]="CU1";
            data[0][2]="CP1";
            data[1][0]="browser[1]";
            data[1][1]="CU2";
            data[1][2]="CP2";
        }
        else if(m.getName().toUpperCase().equals("TESTCC")) {
            data = new Object[2][3];
            data[0][0]="browser[0]";
            data[0][1]="CCU1";
            data[0][2]="CCP1";
            data[1][0]="browser[1]";
            data[1][1]="CCU2";
            data[1][2]="CCP2";
        }
        return data;
    }
}
