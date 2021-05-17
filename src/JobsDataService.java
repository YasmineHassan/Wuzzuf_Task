import java.util.*;
import java.util.stream.Collectors;

public class JobsDataService {
    public static void FilterJobsByTitle(List<JobDetails> Jobs){
        int i=0;
        Map<String,Long> JobTitle=new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (JobTitle.containsKey(Jobs.get(i).GetTitle())){
                JobTitle.put(Jobs.get(i).GetTitle(),Long.valueOf(JobTitle.get(Jobs.get(i).GetTitle())+1));
            }else {
                JobTitle.put(Jobs.get(i).GetTitle(), 1L);
            }
            i++;
        }
        System.out.println(JobTitle);
    }
    public static void FilterJobsByCountry(List<JobDetails> Jobs){
        int i=0;
        Map<String,Long> JobCountry =new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (JobCountry.containsKey(Jobs.get(i).GetCountry())){
                JobCountry.put(Jobs.get(i).GetCountry(),Long.valueOf(JobCountry.get(Jobs.get(i).GetCountry())+1));
            }else {
                JobCountry.put(Jobs.get(i).GetCountry(), 1L);
            }
            i++;
        }
        System.out.println(JobCountry);
    }
    public static void FilterJobsByLevel(List<JobDetails> Jobs){
        int i=0;
        Map<String,Long> JobLevel =new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (JobLevel.containsKey(Jobs.get(i).GetLevel())){
                JobLevel.put(Jobs.get(i).GetLevel(),Long.valueOf(JobLevel.get(Jobs.get(i).GetLevel())+1));
            }else {
                JobLevel.put(Jobs.get(i).GetLevel(), 1L);
            }
            i++;
        }
        System.out.println(JobLevel);
    }
    public static LinkedHashMap<String,Long> sortMap(Map<String,Long> map){
        LinkedHashMap<String, Long> sortedMap = map.entrySet().stream()
                .sorted(Comparator.comparingLong(e -> e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
        return sortedMap;
    }
    public static void FilterJobsByExp_Years(List<JobDetails> Jobs){
        int i=0;
        Map<String,Long> JobYearsExp=new HashMap<String,Long>();
        while(i<Jobs.size()){
            if (JobYearsExp.containsKey(Jobs.get(i).GetYearsExp())){
                JobYearsExp.put(Jobs.get(i).GetYearsExp(),Long.valueOf(JobYearsExp.get(Jobs.get(i).GetYearsExp())+1));
            }else {
                JobYearsExp.put(Jobs.get(i).GetYearsExp(), 1L);
            }
            i++;
        }
        System.out.println(sortMap(JobYearsExp));
    }
}
