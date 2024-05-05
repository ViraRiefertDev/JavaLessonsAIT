package homework.homework31;

abstract class Content {
    private String autorName;
    private String publicationData;

    public Content(String publicationData) {
        this.publicationData = publicationData;
    }

    public Content(String autorName, String publicationData) {
        this.autorName = autorName;
        this.publicationData = publicationData;
    }

    public void setAutorName(String autorName){
        this.autorName = autorName;
    }

    public String getAutorName() {
        return autorName;
    }

    public String getPublicationData() {
        return publicationData;
    }

   abstract public void displayInfo();




}
