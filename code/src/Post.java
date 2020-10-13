public class Post {
    private String text;
    private int totalLikes, totalShares;
    private Member owner;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public int getTotalLikes() {
        return totalLikes;
    }
    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getTotalShares() {
        return totalShares;
    }
    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public Member getOwner() {
        return owner;
    }
    public void setOwner(Member owner) {
        this.owner = owner;
    }
}