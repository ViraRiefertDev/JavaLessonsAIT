package homework.homework24new;

import java.util.HashSet;
import java.util.Iterator;

public class Message {
    private User sender;
    private String text;
    private String time;
    private int index;
    private HashSet<User> likes = new HashSet<>();

    public Message(User sender, String text, String time) {
        this.sender = sender;
        this.text = text;
        this.time = time;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public HashSet<User> getLikes() {
        return likes;
    }

    public void setLikes(HashSet<User> likes) {
        this.likes = likes;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        String message = "-----------------------------\n";
        message += time + "\n" + text + "\n";
        message +=".............................\n";
        if (!likes.isEmpty()) {
            Iterator<User> iterator = likes.iterator();
            while (iterator.hasNext()) {
                User user = iterator.next();
                message += "\uD83D\uDC96 " + user.getName()+ "\n";
            }
        }
        else{
            message += "\uD83D\uDC94 Пока никто не лайкнул\n";
        }
        message += "-----------------------------\n";
        return message;
    }

    //Метод лайкнуть сообщение
    public void addLikeInMessage(User user){
        if(user==null){
            System.out.println("Юзер пустой!");
        }
        else{
            likes.add(user);
        }
    }

}
