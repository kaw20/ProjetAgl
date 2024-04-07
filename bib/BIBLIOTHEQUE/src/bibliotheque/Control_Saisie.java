/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

/**
 *
 * @author Myriam
 */
public class Control_Saisie {
    
    public boolean verif_lettre(String chaine){
    
        String letterRegex = "[a-zA-Z]+";
        if (chaine.matches(letterRegex)){
        return true;
    }else{
            return false;
        }
    
    }
    
    public boolean verif_Number(String number){
    
        String NumRegex = "^[0-9]+$";
        if (number.matches(NumRegex)){
        return true;
    }else{
            return false;
        }
    
    }
    
    public boolean verif_Email(String email) {
    String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    if (email.matches(emailRegex)) {
        return true;
    } else {
        return false;
}
    }

   

}    
    
   
    

