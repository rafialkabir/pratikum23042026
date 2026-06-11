/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum23042026;

/**
 *
 * @author asus-
 */
public class MainAuthor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author Rin = new Author("Rinaldi Munir", "rimunir@gmail.com", 'm');
        System.out.println(Rin);
        
        Rin.setEmail("rinaldi@gmail.com");
        System.out.println("name isi :" +Rin.getName());
        
        System.out.println("gender :" +Rin.getGender());
        
        System.out.println("email :" +Rin.getEmail());
    }
    
}
