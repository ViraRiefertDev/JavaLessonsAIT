package homework.homework29;

import java.util.Objects;

public class Sculpture extends PieceOfArt implements Artwork{
    private sculptureMaterial material;
    private double weight;

    public Sculpture(String name, String creator, sculptureMaterial material, double weight) {
        super(name, creator);
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String getClassName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public void displayInfo() {
        System.out.println(getClass().getSimpleName() + "\nName " + getName()  + "\nCreator " + getCreator() + ", material " + material + ", weight " + weight);
    }

    @Override
    public String getCreator() {
        return getItemCreator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sculpture sculpture = (Sculpture) o;
        return Double.compare(weight, sculpture.weight) == 0 && material == sculpture.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), material, weight);
    }
}
