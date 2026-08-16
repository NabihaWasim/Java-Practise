public class book_object {
    public static void main(String[] args) {
        book_class book1=new book_class("VERITY","Cooloen hoover",34 );
        book_class book2=new book_class("SILENT PATIENT","Alex Michaleids",567 );
        book1.borrowbook();
        book2.borrowbook();
        book1.returnbook();
        book2.returnbook();
        System.out.println(book_class.gettotalbooks()+" are total books.");

    }
    
}
