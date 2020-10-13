import java.util.List;

public class Profile {
    private String summary;
    private List<Experience> experiences;
    private List<Education> educations;
    private List<Skill> skills;
    private List<Accomplishment> accomplishments;
    private List<Recommendation> recommendations;
    private List<Stat> stats;

    public void addExperience(Experience experience) {
        experiences.add(experience);
    }
    public void addEducation(Education education) {
        educations.add(education);
    }
    public void addSkill(Skill skill) {
        skills.add(skill);
    }
    public void addAccomplishment(Accomplishment accomplishment) {
        accomplishments.add(accomplishment);
    }
    public void addRecommendation(Recommendation recommendation) {
        recommendations.add(recommendation);
    }


    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }
    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public List<Education> getEducations() {
        return educations;
    }
    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Skill> getSkills() {
        return skills;
    }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Accomplishment> getAccomplishments() {
        return accomplishments;
    }
    public void setAccomplishments(List<Accomplishment> accomplishments) {
        this.accomplishments = accomplishments;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }
    public void setRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }

    public List<Stat> getStats() {
        return stats;
    }
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }
}