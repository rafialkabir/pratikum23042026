/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum23042026;

/**
 *
 * @author asus-
 */
public class Book {
    private final String name;
    private final Author author;
    private double price;
    private int qty;
    
    public Book(String name,Author author,double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getname(){
        return name;
    }
    public Author getauthor(){
        return author;
    }
    public double getprice(){
        return price;
    }
    public void setprice(double price){
        this.price=price;
    }
    public int getqty(){
       return qty;
    }
    public void setqty(int qty){
        this.qty=qty;
    }
    
    public String toString(){
       return "Book[name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }
}
