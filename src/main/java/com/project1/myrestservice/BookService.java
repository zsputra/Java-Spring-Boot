package com.project1.myrestservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService{
    
    private static List<Books> books = new ArrayList<>();
    static{
        books.add(new Books("1", "Harry Potter", "Baru keluar tahun ini", "J Rowling", "1997"));
        books.add(new Books("2", "Game of Thrones", "Bukunya bagus", "you know who", "1998"));
        books.add(new Books("3", "The Avenger", "Buku super hero, ada banyak heros disini", "kurang tau juga bro", "1999"));
    }

    public List<Books> retrieveAllBooks(){
        List<Books> book = books;
        return book;
    }

    int countBook = 3;

    public List<Books> createBook(Books book){
        book.setId(Integer.toString(++countBook));
        books.add(book);
        return books;
    }

    public Books retrieveDetailBook(String id){
        for (Books buku : books) {
            if(buku.getId().equals(id)){
                return buku;
            }
        }
        return null;
    }

   public List<Books> updateBook(Books book){
        books.set(Integer.parseInt(book.getId())-1, book);
        return books;
    }

    public List<Books> deleteBook(String id){
        books.remove(Integer.parseInt(id)-1);
        return books;
    }
 


}