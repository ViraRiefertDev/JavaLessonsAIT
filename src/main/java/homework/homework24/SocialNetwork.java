package homework.homework24;

import java.util.ArrayList;

public class SocialNetwork {
    public static void main(String[] args) {
        //Создание объектов пользователей
        User user1 = new User("Vera Riefert", 395783);
        User user2 = new User("Aleksandr Badaev", 643564);
        User user3 = new User("Ekaterina Myskina", 95325);
        User user4 = new User("Viktor Romanenko", 12345);
        User user5 = new User("Maksim Yazuk", 987676);

        //Дубликаты объектов
        User user6 = new User("Vera Prokusheva", 395783);
        User user7 = new User("Aleksandr Badaev", 643564);

        //Добавление ползователей в список пользователей
        User.addNewUser(user1);
        User.addNewUser(user2);
        User.addNewUser(user3);
        User.addNewUser(user4);
        User.addNewUser(user5);
        User.addNewUser(user6);
        User.addNewUser(user7);

        //Вывод списка пользователей на экран
        //System.out.println(User.getUserList());

        //Добавление и удаления пользователей в/из друзья/ей
//        user1.addNewFriend(user2);
//        user1.addNewFriend(user3);
//        user1.removeFriend(user5);
//        user1.removeFriend(user2);
//
//
//        user2.addNewFriend(user4);
//        user3.addNewFriend(user5);
//        user4.addNewFriend(user6);
//        user5.addNewFriend(user7);
//        System.out.println(User.getUserList());

        //Отправка сообщений и лайки
//        user1.addMassage("Hello every one!!","22:30 12.01.2024");
//        user1.addMassage("Happy New Year!!!", "00:00 01.01.2024");
//
//
//        user1.addLikeToMassage(1,user2);
//        user1.addLikeToMassage(1,user3);
//        user1.addLikeToMassage(0,user2);
//        user1.addLikeToMassage(3,user2);
//        user1.printAllMassages();

        //Управнение сообществами
        Community.printCommunities();
        Community.AddNewCommunity("AIT TR");
        Community.AddNewCommunity("AIT TR");
        Community.AddNewCommunity("CodeMasters");
        //Добавление в комьюнити нового участника
        Community.addFollowerInCommunity(user1,"AIT TR");
        Community.addFollowerInCommunity(user2,"AIT TR");
        Community.addFollowerInCommunity(user3,"AIT TR");

        Community.addFollowerInCommunity(user1,"CodeMasters");
        Community.addFollowerInCommunity(user2,"CodeMasters");
        Community.addFollowerInCommunity(user2,"CodeMasters");
//        Community.printCommunities();

        //Поиск пользователя по имени
//        ArrayList<User>findeduser  = User.findUser("user1");
//        System.out.println(findeduser);
//        findeduser = User.findUser("Vera Riefert");
//        System.out.println(findeduser);
//
//        //Поиск сообщества по имени
//        Community community = Community.findCommunity("AIT TR");
//        System.out.println(community);
//        community = Community.findCommunity("AIT");
//        System.out.println(community);













    }
}
