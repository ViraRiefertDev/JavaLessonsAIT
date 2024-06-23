package homework.homework43.task2;

public class Review {
    String travelerName;
    String country;
    String reviewText;
    String visitDate;


    public Review(String travelerName, String country, String reviewText, String visitDate) {
        this.travelerName = travelerName;
        this.country = country;
        this.reviewText = reviewText;
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "travelerName='" + travelerName + '\'' +
                ", country='" + country + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", visitDate='" + visitDate + '\'' +
                '}';
    }
}
