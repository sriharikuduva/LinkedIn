import java.util.Date;

public class Experience {
    private String title, company, location, description;
    private Date from, to;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFrom() {
        return from;
    }
    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }
    public void setTo(Date to) {
        this.to = to;
    }
}