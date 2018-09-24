
import java.util.Date;

public class File {

    private String name;
    private Date aenderungsdatum;
    private double groeßeKB;
    private String attribute;

    public File(String name, Date aenderungsdatum, double groeßeKB, String attribute) {
        this.name = name;
        this.aenderungsdatum = aenderungsdatum;
        this.groeßeKB = groeßeKB;
        this.attribute = attribute;
    }
    public String getName(){
        return name;
    }
    public Date getAenderungsdatum(){
        return aenderungsdatum;
    }
    public double getGroeßeKB(){
        return groeßeKB;
    }
    public String getAttribute(){
        return attribute;
    }
    
}
