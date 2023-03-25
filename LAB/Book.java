import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;;

public class Book {
    private String title;
    private int id;
    private ArrayList<Author> authors;

    public static void main(String[] args) {
        try {
            PrintStream out = new PrintStream(System.out, true, "UTF-16");
            out.println("ድስፍዝሽችድስ ");
        } catch (Exception e) {

        }
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("ግፍስችቭብ ግብ Enter the number of books : ");
        int nbook = keyBoard.nextInt();
        keyBoard.nextLine();

        Book[] bookList = new Book[nbook];
        for (int i = 0; i < bookList.length; i++) {
            bookList[i] = new Book();
        }
        for (int j = 1; j <= bookList.length; j++) {

            System.out.println("Creating book " + j);
            System.out.print("Enter the name of the book : ");
            String name = keyBoard.nextLine();
            System.out.print("Enter the the book id : ");
            int id = keyBoard.nextInt();
            Book book1 = new Book(name, id);
            System.out.print("enter the number of authors : ");
            int n = keyBoard.nextInt();
            keyBoard.nextLine();
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter author " + i + " name : ");
                String autName = keyBoard.nextLine();
                System.out.print("Enter author " + i + " id : ");
                int autId = keyBoard.nextInt();
                keyBoard.nextLine();
                System.out.print("Enter author " + i + " DOB : ");
                String autDob = keyBoard.nextLine();

                Author aut = new Author(autName, autId, autDob);
                book1.setAuthor(aut);
            }
            bookList[j - 1] = book1;
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        for (Book book : bookList) {
            System.out.println(book);
        }
        keyBoard.close();
    }

    public Book() {
        authors = new ArrayList<>();
    }

    public Book(String aTitle, int aId) {
        setTitle(aTitle);
        setId(aId);
        authors = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(Author aa) {
        Author temp = new Author(aa.getName(), aa.getId(), aa.getDOB());
        authors.add(temp);
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getAuthors() {
        String aut = "";
        for (Author author : authors)
            aut += author.getName() + " with id " + author.getId() + " born on " + author.getDOB() + "\n\t";

        return aut;
    }

    @Override
    public String toString() {
        return title + " with ISBN " + id + " is written by \n" + getAuthors();
    }
}
