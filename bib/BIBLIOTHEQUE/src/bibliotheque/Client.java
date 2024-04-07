/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;
import com.mysql.cj.jdbc.*;
import java.time.*;
import java.util.*;
import com.mysql.cj.jdbc.*;
import java.io.FileInputStream;
import java.util.*;
import java.time.*;
import java.time.LocalDate;
import java.sql.Date;
/**
 *
 * @author Myriam
 */
public class Client extends Personne {
    
    private LocalDate date_inscription;
    private int nbr_livre_effectuee=0;
    private int nbr_livre_depassee=0; 
    private int nbr_livre_en_cours=0;
    
    
    
    
    public Client(int cin,String nom,String prenom,String email,Date date_naiss,int num_tlfn,String password,Date date_insription,Blob photo){
    
     this.cin=cin;
     this.nom=nom;
     this.prenom=prenom;
     this.email=email;
     this.date_naiss = date_naiss.toLocalDate();
     this.num_tlfn=num_tlfn;
     this.password=password;
     this.photo=photo;
         this.date_inscription = date_insription.toLocalDate();
    }
    
    
    public Client(int cin,String nom,String prenom,String email,Date date_naiss,int num_tlfn,String password,Date date_insription,int nbr_livre_effectuee,int nbr_livre_depassee,int nbr_livre_en_cours,Blob photo){
    
     this.cin=cin;
     this.nom=nom;
     this.prenom=prenom;
     this.email=email;
     this.date_naiss = date_naiss.toLocalDate();
     this.num_tlfn=num_tlfn;
     this.password=password;
     this.photo=photo;
         this.date_inscription = date_insription.toLocalDate();
     this.nbr_livre_depassee=nbr_livre_depassee;
     this.nbr_livre_effectuee=nbr_livre_effectuee;
     this.nbr_livre_en_cours=nbr_livre_en_cours;
   
     
  
    }
    protected String ToString(){
    return "nom: "+this.nom+"\nprenom: "+this.prenom+"\nemail: "+this.email+"\nadresse: "+this.adresse+"\nnumero de telephone: "+this.num_tlfn+"\ndate de naissance: "+this.date_naiss+"\n date d'inscription: "+this.date_inscription+"\n nombre des livres effectuée: "+this.nbr_livre_effectuee+"\n nombre des livres effectuée: "+this.nbr_livre_depassee+"\n nombre des livres en cours: "+this.nbr_livre_en_cours;
    }

    /**
     * @return the date_inscription
     */
    public LocalDate getDate_inscription() {
        return date_inscription;
    }

    /**
     * @param date_inscription the date_inscription to set
     */
    public void setDate_inscription(LocalDate date_inscription) {
        this.date_inscription = date_inscription;
    }

    /**
     * @return the nbr_livre_effectuee
     */
    public int getNbr_livre_effectuee() {
        return nbr_livre_effectuee;
    }

    /**
     * @param nbr_livre_effectuee the nbr_livre_effectuee to set
     */
    public void setNbr_livre_effectuee(int nbr_livre_effectuee) {
        this.nbr_livre_effectuee = nbr_livre_effectuee;
    }

    /**
     * @return the nbr_livre_depassee
     */
    public int getNbr_livre_depassee() {
        return nbr_livre_depassee;
    }

    /**
     * @param nbr_livre_depassee the nbr_livre_depassee to set
     */
    public void setNbr_livre_depassee(int nbr_livre_depassee) {
        this.nbr_livre_depassee = nbr_livre_depassee;
    }

    /**
     * @return the nbr_livre_en_cours
     */
    public int getNbr_livre_en_cours() {
        return nbr_livre_en_cours;
    }

    /**
     * @param nbr_livre_en_cours the nbr_livre_en_cours to set
     */
    public void setNbr_livre_en_cours(int nbr_livre_en_cours) {
        this.nbr_livre_en_cours = nbr_livre_en_cours;
    }
}
