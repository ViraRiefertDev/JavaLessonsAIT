package lessons.lesson27.exercise2;

public class CosmeticStore {
    private String storeName;
    private String location;

    public CosmeticStore(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
    }

    public void describe(){
        System.out.println("Описание нашего магазина: ");
    }

    @Override
    public String toString() {
        return "CosmeticStore{" +
                "storeName='" + storeName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
