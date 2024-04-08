package homework.homework24new;

public class SocialNetz {
    public static void main(String[] args) {
        //Создание объектов пользователей
        User user1 = new User("Vera Riefert", 395783);
        User user2 = new User("Aleksandr Badaev", 643564);
        User user3 = new User("Ekaterina Myskina", 95325);
        User user4 = new User("Viktor Romanenko", 12345);
        User user5 = new User("Maksim Yazuk", 987676);
        User user8=null;

//        user1.addNewFriend(user2);
//        user1.addNewFriend(user3);
//        System.out.println(user1);

        //Добавление в друзья
//        user2.addNewFriend(user5);
//        user2.addNewFriend(user8);
//        System.out.println(user2);

        //Отправка сообщений и лайки
        user1.addMessage(user1, "Hello every one!!","22:30 12.01.2024");
        user1.addMessage(user1,"Happy New Year!!!", "00:00 01.01.2024");


        user1.addLikeToMassage(1,user5);
        user1.addLikeToMassage(0,user2);
        user1.addLikeToMassage(0,user3);
        user1.addLikeToMassage(3,user3);
        user1.printAllMessages();


    }
}
