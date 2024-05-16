package homework.homework29;

import java.util.Objects;

public class PieceOfArt {
    private String name;
    private String creator;

    public PieceOfArt(String name, String creator) {
        this.name = name;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public String getItemCreator() {
        return creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PieceOfArt that = (PieceOfArt) o;
        return Objects.equals(name, that.name) && Objects.equals(creator, that.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creator);
    }
}
