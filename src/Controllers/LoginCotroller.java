/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import javax.swing.JOptionPane;

/**
 *
 * @author zandry_kely
 */
public class LoginCotroller {
    public String email;
    public String pass;
    public boolean required(){
        if(this.email.equals("") || this.pass.equals("")){
            JOptionPane.showMessageDialog(null, "Email ou mots de passe ne peut pas être vide!", "Champ requis",JOptionPane.WARNING_MESSAGE);
            return false;
        }else if(!this.email.contains("@")){
             JOptionPane.showMessageDialog(null, "Email invalide!", "Champ requis",JOptionPane.WARNING_MESSAGE);
             return false;
        } else if(this.pass.length() < 4){
             JOptionPane.showMessageDialog(null, "Mots de passe trop courte", "Valeur incorecte",JOptionPane.WARNING_MESSAGE);
             return false;
        }else{
            return true;
        }
        
    }
    
    public boolean auth(){
        
        if(this.required()){
            if(!this.email.equals("jssi@gmail.com") && !this.pass.equals("1234")){
                 JOptionPane.showMessageDialog(null, "Email ou mots de passe incorrect!", "Erreur d'authentification",JOptionPane.WARNING_MESSAGE);
                 return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
        
    }
}
