

package com.mycompany.problemas;

import books.Book;

public class Problemas {

    public static void main(String[] args) {
       Book book1 = new Book("Asesino de Brujas",7,46,"fantasia"); 
       Book book2 = new Book("Harry Potter",3,35,"fantasia"); 
       
       //presto el libro
       book1.lendBook();
       
        System.out.println(book1.isAvaliable());
        System.out.println(book2.isAvaliable());
    }
    
}
