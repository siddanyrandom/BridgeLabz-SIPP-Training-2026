package ScenarioBasedOOPs.Interface;

interface TextModeration {
    boolean checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive content.");
    }

    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("bad");
    }
}

interface SpamDetection {
    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("No spam.");
    }
}

public class ContentModerator implements TextModeration, SpamDetection {
    public boolean checkOffensiveContent(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean checkSpam(String post) {
        return post.toLowerCase().contains("buy now");
    }

    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public static void main(String[] args) {
        String[] posts = { "Hello friends", "buy now offer", "this is bad content" };
        ContentModerator cm = new ContentModerator();
        for (String p : posts) {
            if (cm.checkSpam(p))
                System.out.println("Spam: " + p);
            else if (cm.checkOffensiveContent(p))
                System.out.println("Offensive: " + p);
            else
                System.out.println("Valid: " + p);
        }
    }
}
