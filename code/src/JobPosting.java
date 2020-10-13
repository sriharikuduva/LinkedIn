import java.util.Date;

public class JobPosting {
    private Date dateOfPosting;
    private String description, employmentType, location;
    private boolean isFulfilled;

    public Date getDateOfPosting() {
        return dateOfPosting;
    }
    public void setDateOfPosting(Date dateOfPosting) {
        this.dateOfPosting = dateOfPosting;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmploymentType() {
        return employmentType;
    }
    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFulfilled() {
        return isFulfilled;
    }
    public void setFulfilled(boolean fulfilled) {
        isFulfilled = fulfilled;
    }
}