package homework.homework24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class User {
    private String name;
    private int id;
    //список друзей
    private HashSet<User> friends = new HashSet<>();
    //Список сообщений
    private ArrayList<Message> listMassages = new ArrayList<>();
    private static HashMap<Integer, User> userList = new HashMap<>();
    //Конструктор для создания объектов User------------------------

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
    //---------------------------------------------------------------


    //Геттеры, сеттеры ----------------------------------------------
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

    public HashSet<User> getFriends() {
        return friends;
    }

    //этот сеттер не нужен, мы добалвяем в друзья через метод
//    public void setFriends(HashSet<User> friends) {
//        this.friends = friends;
//    }

    public ArrayList<Message> getListMassages() {
        return listMassages;
    }

    // этот сеттер не нужен мы добавляем сообщения в список через метод
//    public void setListMassages(ArrayList<Message> listMassages) {
//        this.listMassages = listMassages;
//    }

    public static HashMap<Integer, User> getUserList() {
        return userList;
    }


    //------------------------------------------------------------


    // equals & hashCode
    //id уникальный значит эти методы будут только через id проверять на уникальность.
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
    //--------------------------------------------------------------

    //toString------------------------------------------------------

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
    //-------------------------------------------------------------------------------------------


    //Метод добавления друзей пользователя-------------------------------------------------------
    public void addNewFriend(User friend) {
        //Мы не можем без конструктора стоздать юзера, значит объект не может быть пустой, значит проверка на это не нужна?
        if (friends.isEmpty() || !friends.contains(friend) && friend.getId() != this.getId()) {
            Boolean isAdded = getFriends().add(friend);
            if (isAdded) {
                System.out.println("Пользователь " + friend.getName() + " был добавлен в друзья!");
            } else {
                System.out.println("Error, не получилось добавить пользователя " + friend.getName() + " в друзья!");
            }
        } else if (friend.getId() == this.getId()) {
            System.out.println("Вы не можете добавить сами себя в друзья:(");
        } else {
            System.out.println("Данный пользователь уже является вашим другом!");
        }
    }


    //Метод удаления друзей пользователя----------------------------------------------------
    public void removeFriend(User friend) {

        if (!friends.contains(friend)) {
            System.out.println("Данного пользователя нет в списке Ваших друзей!");
        } else {
            boolean isRemoved = friends.remove(friend);
            if (isRemoved) {
                System.out.println("Пользователь " + friend.getName() + " был успешно удален из списка Ваших друзей!");
            }
        }
    }
    //----------------------------------------------------------------------------------------

    //Метод добавление сообщения пользователем------------------------------------------------
    public void addMassage(String text, String sentTime) {
        Message mess = new Message(name, text, sentTime);
        listMassages.add(mess);
        //устанавливаем значение индекса сообщению в листе, чтоб его потом можно было найти и лайкнуть
        mess.setIndex(listMassages.indexOf(mess));
    }

    //Метод вывода списка сообщений на экран
    public void printAllMassages() {
        System.out.println("-----------------------------");
        System.out.println("Сообщения пользователя" + name);
        for (Message mes : listMassages) {
            System.out.println("-----------------------------");
            System.out.println("Индекс " + listMassages.indexOf(mes));
            System.out.println(mes);
        }
    }

    //Метод добавления лайка к сообщению
    public void addLikeToMassage(int index, User user) {
        if (listMassages.size() < index + 1) {
            System.out.println("Сообщения с индексом " + index + " нет в списке сообщений!");
        } else {
            for (Message mes : listMassages) {
                if (mes.getIndex() == index) {
                    if (mes.getLikes().contains(user)) {
                        System.out.println(user.getName() + ", вы уже лайкнули это сообщение!");
                    } else {
                        mes.likeMassage(user);
                    }
                }
            }
        }
    }

    //метод добавления пользователя в список пользователей //!!!!!проверить остальные методы
    public static void addNewUser(User user) {
        if (userList.containsKey(user.getId())) {
            System.out.println("Пользователь с ID:" + user.getId() + " уже есть в списке!");
        } else {
            userList.put(user.getId(), user);
        }
    }

    //метод поиска пользователя по имени
    public static ArrayList<User> findUser(String userName) {
        ArrayList<User> userArrayList = new ArrayList<>();
        for (User user : userList.values()) {
            if (user.getName().equalsIgnoreCase(userName)) {

                userArrayList.add(user);
            }
        }
        if (userArrayList.isEmpty()) {
            System.out.println("Пользователей с таким именем нет в списке");
        }
        else{
            System.out.println("Пользователи с таким именем есть в списке ");
        }
        return userArrayList;
    }
}
