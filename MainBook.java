/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum23042026;

/**
 *
 * @author asus-
 */
public class MainBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author Rin = new Author("Rinaldi Munir","rinaldi@gmail.com",'m');
        System.out.print(Rin);
        
        Book dummybook = new Book("Algoritma dan Pemograman",Rin,98000,99);
        System.out.println(dummybook);
        dummybook.setprice(120000);
        dummybook.setqty(88);
        System.out.println("Nama : "+dummybook.getname());
        System.out.println("Price : "+dummybook.getprice());
        System.out.println("Qty : "+dummybook.getqty());
        System.out.println("Author : "+dummybook.getauthor());
        System.out.println("Author name : "+dummybook.getauthor().getName());
        System.out.println("Author email : "+dummybook.getauthor().getEmail());
        System.out.println("Authir gender : "+dummybook.getauthor().getGender());
        
        Book newDummybook = new Book("Java for Dummies", new Author("Peter Lee","peter@gmail.com",'m'),19.99,8);
        System.out.println(newDummybook);
    }
    
}
