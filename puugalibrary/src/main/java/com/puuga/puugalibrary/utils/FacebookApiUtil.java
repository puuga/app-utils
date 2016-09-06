package com.puuga.puugalibrary.utils;

/**
 * Created by siwaweswongcharoen on 9/6/2016 AD.
 */
public class FacebookApiUtil {
    public enum FacebookProfilePictureSize {
        DEFAULT, SMALL, NORMAL, ALBUM, LARGE, SQUARE
    }

    public static String getFacebookProfilePicture(String facebookId, FacebookProfilePictureSize profilePictureSize) {
        String option;
        switch (profilePictureSize) {
            case SMALL:
                option = "?type=large";
                break;
            case NORMAL:
                option = "?type=normal";
                break;
            case ALBUM:
                option = "?type=album";
                break;
            case LARGE:
                option = "?type=large";
                break;
            case SQUARE:
                option = "?type=square";
                break;
            case DEFAULT:
            default:
                option = "";
                break;
        }
        return "https://graph.facebook.com/" + facebookId + "/picture" + option;
    }
}
