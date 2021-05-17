import java.io.File;

public class JobDetails {
  //  File DataSet = new File("C:\\Users\\Yasoo\\Documents\\AAAAa\\Section_Dr.Ghozia\\Tasks\\Wuzzuf_Task\\Wuzzuf_Jobs.csv");

    String title;
    String country;
    String level;
    String Y_Exp;

   // Constructor..
    public JobDetails(String title, String country, String level, String Y_Exp) {
        this.title= title;
        this.country = country;
        this.Y_Exp = Y_Exp;
        this.level = level; }

    public String GetTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title; }

    public String GetCountry(){return  country;}
    public void setCountry(String country) {
        this.country = country; }

    public  String GetLevel(){return level; }
    public void setLevel(String level) {
        this.level = level; }

    public String GetYearsExp(){return  Y_Exp;}
    public void setY_Exp(String y_Exp) {
        Y_Exp = y_Exp; }
}
