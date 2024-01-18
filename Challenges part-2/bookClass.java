 class bookClass {
    static int totalnoofBooks;
    String title;
    String author;
   String isbn;
boolean isBorrowed;


 static{
    totalnoofBooks=0;
 }
 {
    totalnoofBooks++;
 }
 bookClass(String isbn,String author, String title){
    this.isbn=isbn;
    this.author=author;
    this.title=title;
 }
 bookClass(String isbn){
    this(isbn,"unknown","unknown");
 }
 static int getTotalnoofBooks(){
    return totalnoofBooks;
 }
 void borrowBook(){
    if(isBorrowed){
        System.out.println("Book is already booked");

    }
    else{
        this.isBorrowed=true;
        System.out.println("enjoy kro book ko "+ this.title);
    }
 }
 void returnBook(){
    if(isBorrowed){
        this.isBorrowed=false;
        System.out.println("hope u enjoy the book");
    }
    else{
System.out.println("this book is already in  library");
    }
 }
 public static void main(String[] args) {
    bookClass designofthings=new bookClass("1","sumit","dieto live");
    bookClass organizemind=new bookClass("2");
    System.out.println(bookClass.getTotalnoofBooks());
designofthings.borrowBook();
organizemind.borrowBook();
organizemind.borrowBook();
designofthings.borrowBook();

designofthings.returnBook();
designofthings.borrowBook();
organizemind.returnBook();
organizemind.returnBook();
organizemind.returnBook();
organizemind.borrowBook();


 }
}
