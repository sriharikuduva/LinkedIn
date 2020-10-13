import java.util.List;

public class Company {
    private String name, description, type;
    private int companySize;
    private List<JobPosting> activeJobPostings;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getCompanySize() {
        return companySize;
    }
    public void setCompanySize(int companySize) {
        this.companySize = companySize;
    }

    public List<JobPosting> getActiveJobPostings() {
        return activeJobPostings;
    }
    public void setActiveJobPostings(List<JobPosting> activeJobPostings) {
        this.activeJobPostings = activeJobPostings;
    }
}