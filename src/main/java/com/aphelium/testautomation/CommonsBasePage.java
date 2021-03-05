package com.aphelium.testautomation;

public class CommonsBasePage extends DriveFactory{

    public static void goTo(String website){
        driver().get(website);
    }

    public static String getPageTitle() { return driver().getTitle(); }

    public static String getURL() { return driver().getCurrentUrl(); }

}
