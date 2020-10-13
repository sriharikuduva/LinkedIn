import java.util.Date;
import java.util.List;

public class Member extends Person {
    private Date dateOfMembership;
    private String headline;
    private byte[] photo;
    private List<Member> memberSuggestions;
    private List<Member> memberFollows;
    private List<Member> memberConnections;
    private List<Company> companyFollows;
    private List<Group> groupFollows;
    private Profile profile;

    public boolean sendMessage(Message message);
    public boolean createPost(Post post);
    public boolean sendConnectionInvitation(ConnectionInvitation invitation);

    public Date getDateOfMembership() {
        return dateOfMembership;
    }
    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public byte[] getPhoto() {
        return photo;
    }
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public List<Member> getMemberSuggestions() {
        return memberSuggestions;
    }
    public void setMemberSuggestions(List<Member> memberSuggestions) {
        this.memberSuggestions = memberSuggestions;
    }

    public List<Member> getMemberFollows() {
        return memberFollows;
    }
    public void setMemberFollows(List<Member> memberFollows) {
        this.memberFollows = memberFollows;
    }

    public List<Member> getMemberConnections() {
        return memberConnections;
    }
    public void setMemberConnections(List<Member> memberConnections) {
        this.memberConnections = memberConnections;
    }

    public List<Company> getCompanyFollows() {
        return companyFollows;
    }
    public void setCompanyFollows(List<Company> companyFollows) {
        this.companyFollows = companyFollows;
    }

    public List<Group> getGroupFollows() {
        return groupFollows;
    }
    public void setGroupFollows(List<Group> groupFollows) {
        this.groupFollows = groupFollows;
    }

    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}