package homework.homework24new;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class User {
    private String name;
    private int id;
    private HashSet<User> friends = new HashSet<>();
    private ArrayList<Message> listMessages=new ArrayList<>();

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashSet<User> getFriend() {
        return friends;
    }

    public void setFriend(HashSet<User> friend) {
        this.friends = friend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {

        String username = "Имя: " + name + "\n";
        String userId = "ID: " + id + "\n";
        String delimiterFriends = "-------Friends---------\n";
        String delimiterUser = "--------User-----------\n";
        String delimiterUnder = "-----------------------\n";

        String userFriends = "";
        if (!friends.isEmpty()) {
            for (User user : friends) {
                userFriends += user.getName() + "\n";
            }
        } else {
            userFriends = "No friends yet!\n";
        }
        return delimiterUser + username + userId + delimiterFriends + userFriends + delimiterUnder;
    }

    //метод для добавления и удаления друзей пользователя
    public void addNewFriend(User friend){
        if(friend==null){
            System.out.println("Error,не получилось добавить пользователя в друзья");
        }
        else{
            boolean isAdded = friends.add(friend);
            if(isAdded){
                System.out.println("Добавлен");
            }
            else{
                System.out.println("Не добавлен");
            }
        }
    }

    public void removeFriend(User friend){
        boolean isRemoved = friends.remove(friend);
        if(isRemoved){
            System.out.println("Удален");
        }
        else{
            System.out.println("Не удален");
        }
    }

    //Метод добавления сообщения пользователя
    public void addMessage(User user, String text, String time){
        Message mess = new Message(user,text,time);
        listMessages.add(mess);
        mess.setIndex(listMessages.indexOf(mess));
    }

    //Метод вывода списка сообщений на экран
    public void printAllMessages(){
        System.out.println("-----------------------------");
        System.out.println("Сообщения пользователя" + name);
        if(listMessages.isEmpty()){
            System.out.println("У вас пока нет сообщений. Напишите что нибудь:)");
        }
        else {
            for (Message mes : listMessages) {
                System.out.println("-----------------------------");
                System.out.println("Индекс " + listMessages.indexOf(mes));
                System.out.println(mes);
            }
        }
    }

    
    //Лайк сообщения
    public void addLikeToMassage(int index, User user){
        if(listMessages.size()<index+1){
            System.out.println("Сообщения с индексом " + index + " нет в списке сообщений!");
        }
        else{
            for(Message mes:listMessages){
               if(mes.getIndex() == index){
                   if(mes.getLikes().contains(user)){
                       System.out.println(user.getName() + ", вы уже лайкнули это сообщение!");
                   }
                   else {
                       mes.addLikeInMessage(user);
                   }
               }
            }
        }
    }
}
