package main;


/*
 * To change any of these values, we do not have to look for all references and change there
 * Just change the values here.
 */
public class Config {
public static String user = "root";
public static String password = "root";   // include a new service class to encrypt the password. This is a bad practice.
	public static String style = "styles/style2.css"; //stylesheet for home pages
	public static String styleAdmin = "../styles/style2.css";  //stylesheet for admin pages
	
	public static int numRows = 10;   //number of articles to fetch in a single query.
	public static String imageSrc = "images/logo2.jpg";
	public static String imageSrcAdmin= "../images/logo2.jpg";
	public static String footer = "Designed and Coded by <b>Usman Rana</b>&nbsp&nbsp<br> The UI is not cool and I advise you to add your own";

}
