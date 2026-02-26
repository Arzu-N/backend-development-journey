public class Library {
    Author[]author;
    Book[]book;
    public Library(Author[] author, Book[] book) {
        this.author = author;
        this.book = book;
    }

    void print(){
        for(int i=0;i<author.length;i++){
        System.out.println("Book "+book[i].getName()+" "+book[i].getAuthor());
    }
}}
