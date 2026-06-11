/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum23042026;

/**
 *
 * @author asus-
 */
public class Author {
    private final String Name;
    private String Email;
    private final char Gender;   //'a' atau 'f'
    /**constructor author**/
    public Author(String Name, String Email, char Gender){
       this.Name = Name;
       this.Email = Email;
       this.Gender = Gender;
        
    }
    public String getName(){
        return Name;
    }
    public String getEmail(){
        return Email;
        
    }
    public void setEmail(String Email){
        this.Email=Email;
        
    }
    public char getGender(){
        return Gender;
    }
     public String toString(){
     return "Author[name=" + Name + ",email=" + Email + ",gender=" + Gender + "]";
     }
     
}
