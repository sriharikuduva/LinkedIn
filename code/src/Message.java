public class Message {
    private Member[] sentTo;
    private String messageBody;
    private byte[] media;

    public Member[] getSentTo() {
        return sentTo;
    }
    public void setSentTo(Member[] sentTo) {
        this.sentTo = sentTo;
    }

    public String getMessageBody() {
        return messageBody;
    }
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public byte[] getMedia() {
        return media;
    }
    public void setMedia(byte[] media) {
        this.media = media;
    }
}