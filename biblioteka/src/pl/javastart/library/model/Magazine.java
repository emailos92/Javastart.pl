package pl.javastart.library.model;

public class Magazine extends Publication{
    int month;
    int day;
    String language;

    public Magazine(String title, String publisher, int year, int month, int day, String language) {
        setTitle(title);
        setPublisher(publisher);
        setYear(year);
        this.month = month;
        this.day = day;
        this.language = language;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void printInfo() {
        String info = getTitle() + "; " + getPublisher() + "; " + getYear() + "; " +
                getMonth() + "; " + getDay() + "; " + getLanguage();
        System.out.println(info);
    }

}
