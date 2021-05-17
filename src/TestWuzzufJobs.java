import java.io.File;
import java.util.List;

public class TestWuzzufJobs {
    public  void test(){
        IO Reader = new IO();

        //For Reading DataSet (.csv) File.
        List<JobDetails> Dataset = Reader.ReadCSVFile("C:\\Users\\Yasoo\\Documents\\AAAAa\\Section_Dr.Ghozia\\04_Pyramids_CSV_Task\\Pyramids\\src\\pyramids.csv");

        JobsDataService job = new JobsDataService();

        //Testing Filter functions on jobs into wuzzuf dataset.
        System.out.println("#Jobs according to Title:");
        job.FilterJobsByTitle(Dataset);

        System.out.println("");
        System.out.println("#Jobs according to Country:");
        job.FilterJobsByCountry(Dataset);
        System.out.println("");

        System.out.println("#Jobs according to Level:" );
        job.FilterJobsByLevel(Dataset);
        System.out.println("");

        System.out.println("#Jobs according to Years_experience:");
        job.FilterJobsByExp_Years(Dataset);

    }
}

