package main.java.com.ohgiraffers.understand;

public enum Grade {

    FRESHMAN("1"),
    SOPHOMORE("2"),
    JUNIOR("3"),
    SENIOR("4");

    private final String description;

    Grade(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

}
