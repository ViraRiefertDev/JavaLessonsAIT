package homework.homework24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Community {
    private String communityName;
    private HashSet<User> followers = new HashSet<>();
    private static HashMap<String, Community> allCommunities = new HashMap<>();

    //Конструктор создания  нового сообщества----------------------------
    public Community(String communityName) {
        this.communityName = communityName;
    }

    //Геттеры и сеттеры---------------------------------------------------

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

//    public HashSet<User> getFollowers() {
//        return followers;
//    }

//    public void setFollowers(HashSet<User> followers) {
//        this.followers = followers;
//    }

    //equals & hashCode---------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Community community = (Community) o;
        return Objects.equals(communityName, community.communityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(communityName);
    }

    //Метод вывода на печать 1ого сообщества-----------------------------------
    @Override
    public String toString() {
        String result = "--------Cообщество "+ communityName + "------\n";
        if(followers.isEmpty()){
            result += "Пока не добавился ни один участник!";
        }
        else{
            result += "Список участников:\n";


            for(User user: followers){
                result += user.getName() + "\n";
            }
        }


        return result;
    }

    //Метод вывода на печать список сообщества и их участников-------------------------
    public static void printCommunities(){
        if(allCommunities.isEmpty()){
            System.out.println("Еще не было создано ни одного сообщества!");
        }
        else {
            for (Community community : allCommunities.values()) {
                System.out.println(community);
            }
        }
    }

    //Метод добавления нового комьюнити------------------------------------------------
    public static void AddNewCommunity(String communityName){
        if (allCommunities.containsKey(communityName)) {
            System.out.println("Сообщество с таким именем уже существует!");
        }
        else{
            allCommunities.put(communityName,new Community(communityName));
        }
    }

    //Метод добавление в комьюнити нового учасника----------------------------------
    public static void  addFollowerInCommunity(User user, String communityName){
              Community community = allCommunities.get(communityName);
              community.addFollower(user);
    }
    private void addFollower(User user){
        if(followers.contains(user)){
            System.out.println("Вы уже состоите в этом сообщесте!");
        }
        else {
            followers.add(user);
        }
    }

    //Метод поиска сообщества по названию
    public static Community findCommunity(String communityName){

        if(allCommunities.isEmpty()){
            System.out.println("Список сообществ пуст!");
        }
        else if(!allCommunities.containsKey(communityName)){
            System.out.println("Сообщество с  названием " + communityName +" нет в списке!");
        }
        else{
            System.out.println("Сообщество с именем " + communityName +" найдено!");
           return allCommunities.get(communityName);
        }
        return null;
    }
}
