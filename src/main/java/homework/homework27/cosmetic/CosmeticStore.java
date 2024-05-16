package homework.homework27.cosmetic;

public class CosmeticStore {
    private String storeName;
    private String location;

    public CosmeticStore(String storeName, String location) {
        this.storeName = storeName;
        this.location = location;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CosmeticStore{" +
                "storeName='" + storeName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    public void describe() {
        System.out.println("About us: ");
    }
}
