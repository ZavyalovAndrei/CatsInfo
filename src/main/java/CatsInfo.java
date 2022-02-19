import com.fasterxml.jackson.annotation.JsonProperty;

public class CatsInfo {

    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final int upvotes;

    public CatsInfo(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public  String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\nCats info:" +
                "\nID: " + id +
                "\nText: " + text +
                "\nType: " + type +
                "\nUser: " + user +
                "\nUpvotes: " + upvotes;
    }
}