package homework.homework24;

import java.util.HashSet;
import java.util.Iterator;

public class Message {
    //Добавила переменную index сообщения, чтобы можно было найти определенное сообщение в списке и лайкнуть
    private int index;
    private String sender;
    private String text;
    private String sentTime;
    private HashSet<User> likes = new HashSet<>();


    //Конструктор создания сообщения-----------------------------------------
    public Message(String sender, String text, String sentTime) {
        this.sender = sender;
        this.text = text;
        this.sentTime = sentTime;
    }

    //Геттеры и сеттеры--------------------------------------------------------------------------
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSentTime() {
        return sentTime;
    }

    public void setSentTime(String sentTime) {
        this.sentTime = sentTime;
    }

    public HashSet<User> getLikes() {
        return likes;
    }

    //!!!!возможно сеттер для списка лайков не нужен, добавлять элементы будем в методе
//    public void setLikes(HashSet<User> likes) {
//        this.likes = likes;
//    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    //---------------------------------------------------------------------


    //equals & hashcode------------------------------------------------------

    //Сообщения у нас в ArrayList значит переопределение equals & hashcode не нужно!

    //------------------------------------------------------------------------

    //to-String вывод объекта Massage----------------------------------------------------------------
    @Override
    public String toString() {
       String message = "-----------------------------\n";
       message += sentTime + "\n" + text + "\n";
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

    //метод лайкнуть сообщение-------------------------------------------------------
    public void likeMassage(User user){
        if(user==null){
            System.out.println("Юзер пустой! Боты сообщения не лайкают!");
        }
        else {
            likes.add(user);
        }
    }
}
