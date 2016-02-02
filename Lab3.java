import java.io.File;
import java.util.*;

public class Lab3{
    public static void main(String[]args){
        //reading in the file
        Scanner in = null;
        try
        {
            in = new Scanner(new File("dates.txt"));
        }
        catch (Exception FileNotFoundException)
        {
            System.err.println("failed to open dates.txt");
            System.exit(1);
        }
        int i=0;
        DateRange daterange = new DateRange();
        
        //need to simplify the read in times
        while (in.hasNextLine()){
        	daterange.date2.dateline=in.nextLine();
        	daterange.date1.dateline=daterange.date2.dateline;
        	daterange.date2.dateline=in.nextLine();
        	System.out.println(daterange.date2);
            System.out.println(daterange.date1);
        	System.out.println(daterange.toString());
        } 
    }
}
