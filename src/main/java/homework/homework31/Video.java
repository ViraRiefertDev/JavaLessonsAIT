package homework.homework31;

import java.util.ArrayList;
import java.util.Objects;

public class Video extends Content implements Interactable{
    private int videoId;
    private String videoTitle;
    private int duration;
    private int views = 0;
    private int likes = 0;
    private int dislikes = 0;

    ArrayList<Comment> listOfComments = new ArrayList<>();


    public Video(int videoId, String publicationData, String videoTitle, int duration) {
        super(publicationData);
        this.videoId = videoId;
        this.videoTitle = videoTitle;
        this.duration = duration;
    }

    public int getVideoId() {
        return videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    @Override
    public void displayInfo() {
        System.out.println("------------------------------------");
        System.out.println("Video: " + videoTitle);

        System.out.println("Duration: " + duration + " seconds");
        System.out.println("Views: " + views);
        System.out.println("Likes: " + likes);
        System.out.println("Dislikes: " + dislikes);
        System.out.println("------------------------------------");
        System.out.println("----Comments------");
        if(listOfComments.isEmpty()){
            System.out.println("No one has commented your video yet...");
        }
        else{
            for(Comment comment:listOfComments){
                comment.displayInfo();
            }
        }
    }

    @Override
    public void watch() {
        views++;
        System.out.println("Video watched. Total views: " + views);

    }

    @Override
    public void addLike() {
        likes++;
        System.out.println("Video was liked. Total likes: " + likes + " Total dislikes: " + dislikes);
    }

    @Override
    public void addDisLike() {
        dislikes++;
        System.out.println("Video was disliked. Total likes: " + likes + "Total dislikes: " + dislikes);

    }



    @Override
    public void addComment(User user, String publicationData, String commentTest) {
        Comment comment = new Comment(user.getUserName(),publicationData,commentTest);
        boolean isAdded = listOfComments.add(comment);
        if(isAdded){
            System.out.println("Comment was successfull added to the video " + videoTitle);
            System.out.println("Thank you for your activiti");
        }
        else{
            System.out.println("ERROR!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return videoId == video.videoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoId);
    }
}
