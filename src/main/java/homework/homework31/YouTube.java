package homework.homework31;

public class YouTube {
    public static void main(String[] args) {
        //создаем юзеров
        User andrij = new User(1,"Andrij Pupkin");
        User arti = new User(2, "Arti Schwarz");
        User jecki = new User(3, "Jecki Chan");
        User ilon = new User (4, "Ilon Mask");

        Video cats = new Video(11,"2.05.2024 12:30","Cuttie cats",123);
        Video dogs = new Video(22,"03.05.2024 23:14", "But dogs are cuttier", 2334);

        //User Andrij заливает новые видео
        andrij.addNewVideo(cats);
        andrij.addNewVideo(dogs);

        //выводим на экран список видео
        andrij.displayAllVideos();

        //Смотрим видео про собак и кошек
        dogs.watch();
        dogs.watch();
        dogs.watch();
        cats.watch();
        cats.watch();


        //Лайкаем видео про собачек и кошек
        cats.addLike();
        cats.addLike();
        cats.addLike();
        cats.addLike();
        cats.addLike();
        cats.addLike();
        dogs.addLike();
        dogs.addLike();
        dogs.addLike();
        dogs.addLike();
        dogs.addLike();
        dogs.addLike();

        //дизлайкаем видео
        dogs.addDisLike();
        cats.addDisLike();


        andrij.displayAllVideos();

        //добавляем комментарии
        dogs.addComment(ilon,"04.05.2023","Dogs are the best!");
        cats.addComment(ilon,"07.02.2024", "I dont like cats so mush like i like dogs");

        dogs.addComment(jecki,"05.05.2023", "This dogs everywhere :(");
        cats.addComment(arti,"08.02.2024", "I want more cat videos!!!");


        andrij.displayAllVideos();
        }


    }




