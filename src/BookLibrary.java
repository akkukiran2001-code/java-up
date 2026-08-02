import java.util.Scanner;
class Book{
    private int book_id;
    private String title;
    private String author;

    //set book
    public void setBook(){
        Scanner input = new Scanner(System.in);

        System.out.print("set the Book ID: ");
        this.book_id = input.nextInt();
        input.nextLine();

        System.out.print("set the title: ");
        this.title = input.nextLine();

        System.out.print("set the author: ");
        this.author = input.nextLine();

    }

    // get method
    public int getBook_id(){
        return this.book_id;

    }
    public String getTitle(){
        return this.title;

    }

    public String getAuthor(){
        return this.author;
    }

}
class BookUtility{

    public static void displayBook(Book b){

        System.out.println("Book details");
        System.out.println("Book id:"+b.getBook_id());
        System.out.println("title: "+b.getTitle());
        System.out.println("author: "+b.getAuthor());

    }


        }
public class BookLibrary {
    public static void  main(String[] args){

        Book book1 = new Book();

        book1.setBook();

        BookUtility.displayBook(book1);
    }

}
