package Task_1;

public class Main {
    public static void main(String[] args) {
        Book[] fictionBooks = new Book[10];
        Book[] legalBooks = new Book[10];
        Book[] technicalBooks = new Book[10];

        Book book1 = new Book(1, "Pushkin", "Onegin", 1989);
        Book book2 = new Book(2, "Lef", "War and Peace", 1946);
        Book book3 = new Book(3, "Duma", "Devil's gorge", 1812);

        addBook(book1, fictionBooks);
        addBook(book2, fictionBooks);
        addBook(book3, fictionBooks);

        printBooks(fictionBooks);//Вывод всех книг
        System.out.println("Количество книг: " + countBooks(fictionBooks));//Подсчет кол-во книг
        findAuthor(fictionBooks, "Lef");

    }

    public static void addBook(Book book, Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null) {
                System.out.println(books[i].toString());
            }
            else return;
        }
    }

    public static int countBooks(Book[] books) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null) {
                count ++;
            }
            else return count;
        }
        return count;
    }

    public static void findAuthor(Book[] books, String author) {
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null && books[i].getAuthor() == author) {
                System.out.println("Такая книга есть, его код: " + books[i].getCode());
                return;
            }
        }
        System.out.println("К сожалению такой книги нет");
    }
}