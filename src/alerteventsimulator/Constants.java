/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alerteventsimulator;

import java.util.ArrayList;

/**
 *
 * @author ivano
 */
public class Constants {
    
    public static String sActiveMQAddress = "tcp://www.cimcollege.rs:61616";
    public static String sLogFilesLocation = "";
    public static ArrayList <String> c_Topics = new ArrayList<String>();
    public static ArrayList <String> sEventTypes = new ArrayList<String>();
    
    public static String c_ET_ALERT_KESI_IssueNew = "ALERT.KESI.IssueNew";
    public static String c_ET_ALERT_KESI_IssueUpdate = "ALERT.KESI.IssueUpdate";
    public static String c_ET_ALERT_KESI_CommitNew = "ALERT.KESI.CommitNew";
    public static String c_ET_ALERT_ForumSensor_ForumPostNew = "ALERT.ForumSensor.ForumPostNew";
    public static String c_ET_ALERT_MLSensor_MailNew = "ALERT.MLSensor.MailNew";
    public static String c_ET_ALERT_WikiSensor_ArticleAdded = "ALERT.WikiSensor.ArticleAdded";
    public static String c_ET_ALERT_WikiSensor_ArticleModified = "ALERT.WikiSensor.ArticleModified";

}
