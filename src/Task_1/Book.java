package Task_1;

public class Book {
    private int code;
    private String author;
    private String name;
    private int year_of_issue;

    public Book(int code, String author, String name, int year_of_issue) {
        this.code = code;
        this.author = author;
        this.name = name;
        this.year_of_issue = year_of_issue;
    }

    public Book() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    @Override
    public String toString() {
        return "Code: " + code + "\nAuthor: " + author + "\nName: " + name + "\nYear of issue: " + year_of_issue;
    }
}
