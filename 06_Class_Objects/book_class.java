/*Create a Book class for a library system.
• Instance variables: title, author, isbn.
• Static variable: totalBooks, a counter for 
the total number of book instances.
• Instance methods: borrowBook), returnBook).
• Static method: getTotalBooks), to get the total
 number of books in the library.*/
public class book_class {
    String title;
    String author;
    int isbn;
    
    static int total_books=0;
    book_class(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        total_books++;

    }
    void borrowbook(){
        System.out.println(title+" book is borrowed.");
    }
    void returnbook(){
        System.out.println(title+" books is returned");
    }
    static int gettotalbooks(){
        return total_books;


    }


    
}
