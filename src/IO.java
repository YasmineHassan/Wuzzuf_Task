import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IO {
    public List<JobDetails> ReadCSVFile(String dataset) {
        List<JobDetails> content = new ArrayList<JobDetails>();
            try{BufferedReader B_Read = new BufferedReader(new FileReader(dataset));
            String Line = B_Read.readLine();
            // loop until all lines are read
            if (Line != null) {
                Line = B_Read.readLine(); // the first real data
            }
            while (Line != null) {

                String[] attributes = Line.split(",");
                JobDetails job = NewJob(attributes);
                content.add(job);
                Line = B_Read.readLine();
            } } catch (Exception e) {
                e.printStackTrace();
        }
        return content;
    }

    public JobDetails NewJob(String[] metadata) {

        String title = metadata[0];
        String level = metadata[4];
        String Y_Exp =metadata[5];
        String country = metadata[6];

        return new JobDetails(title, country, level, Y_Exp);
    }
}
/*
 * these numbers in metadata[..]: number of column that belong variable which assigned.
 */