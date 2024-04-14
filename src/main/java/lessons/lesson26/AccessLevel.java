package lessons.lesson26;

public enum AccessLevel {
    //c методами, которые внутри себя проверяют коэфициенты доступа
    NONE(0),READ(1),WRITE(2), ADMIN(3);
    private final int level;


    AccessLevel(int level){
        this.level=level;
    }
//эти методы определяют какие опреации может делать пользователь
    public boolean canRead(){
        return this.level>= READ.level;
    }

    public boolean canWrite(){
        return this.level>= WRITE.level;
    }
    public boolean isAdmin(){
        return this.level == ADMIN.level;
    }


}
