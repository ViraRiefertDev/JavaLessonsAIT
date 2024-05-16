package homework.homework31;

import java.util.HashMap;

public class User {
    private int userId;
    private String userName;
    private HashMap<Integer,Video> videos = new HashMap<>();

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }


    //метод добавления видео в список загруженных видео
    public void addNewVideo(Video video){
        if(videos.containsKey(video.getVideoId())){
            System.out.println("Video with such idNumber: "+ video.getVideoId() +" is already exist in list");
        }
        else{

            videos.put(video.getVideoId(),video);
            video.setAutorName(this.getUserName());
            System.out.println("Video: " + video.getVideoTitle() + " was successfull added into the list");
        }
    }

    //метод удаления видео из списка загруженных видео
    public void removeVideo(String videoId){
        if(videos.containsKey(videoId)){
            videos.remove(videoId);
            System.out.println("Video: " + videos.get(videoId).getVideoTitle() + " was successfull removed from the list");
        }
        else{
            System.out.println("ERROR can't find video with videoId: " + videoId);
        }
    }

    //метод вывода списка загруженных видео
    public void displayAllVideos(){
        for(Video video: videos.values()){
            video.displayInfo();
        }
    }

//    //метод добавления комментария к любому видео
//    public void addComment(Video video,String publicationData, String commentTest){
//        video.addComment(this.userName,publicationData,commentTest);
//    }
//
//    //лайк любому видео
////    public void addLike(int videoId){
////        if(videos.containsKey(videoId)){
////            videos.get(videoId).addLike();
////            System.out.println("Liked video: " + videos.);
////        }
////        videos.get(videoId).addLike();
////    }


}
