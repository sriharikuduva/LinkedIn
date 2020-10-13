import java.util.List;

public class Group {
    private String name, description;
    private int totalMembers;
    private List<Member> members;

    public void addMember(Member member) {
        members.add(member);
    }

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

    public int getTotalMembers() {
        return totalMembers;
    }
    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public List<Member> getMembers() {
        return members;
    }
    public void setMembers(List<Member> members) {
        this.members = members;
    }
}