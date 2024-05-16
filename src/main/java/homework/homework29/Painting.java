package homework.homework29;

import java.util.Objects;

public class Painting extends PieceOfArt implements Artwork{

    private Paint typeOfPaint;
    private String paintingSize;

    @Override
    public String getClassName(){
        return this.getClass().getSimpleName();
    }

    public Painting(String name, String creator, Paint typeOfPaint, String paintingSize) {
        super(name, creator);
        this.typeOfPaint = typeOfPaint;
        this.paintingSize = paintingSize;
    }

    @Override
    public void displayInfo() {

        System.out.println(getClass().getSimpleName() + "\nName: "+ getName() +"\nCreator: " + getCreator() + ", typeOfPaint " + typeOfPaint + ", paintingSize " + paintingSize);
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
        Painting painting = (Painting) o;
        return typeOfPaint == painting.typeOfPaint && Objects.equals(paintingSize, painting.paintingSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfPaint, paintingSize);
    }
}
