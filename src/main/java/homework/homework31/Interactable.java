package homework.homework31;

public interface Interactable {
    void watch();
    void addLike();
    void addDisLike();
    void addComment(User user, String publicationData, String commentText);
}
