
package books;


public class Book {
     String title;
     int  quantity;
     int id;
     String genre;
     String loanDate;
     String returnDate;
     boolean avaliable;
     
     public Book(String title, int quantity, int id, String genre) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        this.avaliable = true;

    }
     
     
     public void lendBook (){
     this.avaliable = false;    
     }
     
     public void returnBook (){
       this.avaliable = true;  
     }

    public boolean isAvaliable() {
        return avaliable;
    }
     

    
}
