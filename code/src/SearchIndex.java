import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SearchIndex implements Search {
    Map<String, List<Member>> memberNames;
    Map<String, List<Company>> companyNames;
    Map<String, List<JobPosting>> jobTitles;

    public void addMember(Member member) {
        if (memberNames.containsKey(member.getName())) {
            memberNames.get(member.getName()).add(member);
        } else {
            memberNames.put(member.getName(), Arrays.asList(member));
        }
    }

    public boolean addCompany(Company company);
    public boolean addJobPosting(JobPosting jobPosting);

    public List<Member> searchMember(String name) {
        return memberNames.get(name);
    }
    public List<Company> searchCompany(String name) {
        return companyNames.get(name);
    }
    public List<JobPosting> searchJob(String title) {
        return jobTitles.get(title);
    }
}