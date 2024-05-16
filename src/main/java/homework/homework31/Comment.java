package homework.homework31;

public class Comment extends Content{
    private String commentTest;

    public Comment(String autorName, String publicationData, String commentTest) {
        super(autorName, publicationData);
        this.commentTest = commentTest;
    }

    @Override
    public void displayInfo() {
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Autor: " + getAutorName());
        System.out.println("Publication Data " + super.getPublicationData());
        System.out.println("Text-----------------------------");
        System.out.println(commentTest);
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}
