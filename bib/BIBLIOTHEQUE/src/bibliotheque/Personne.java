/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

/**
 *
 * @author Myriam
 */
import com.mysql.cj.jdbc.Blob;
import java.util.*;
import java.time.*;
public abstract class Personne {
    
    int cin;
    String nom;
    String prenom;
    String email;
    String adresse;
    int num_tlfn;
    String password;
    LocalDate date_naiss;
    Blob photo;

    

    /**
     * @return the cin
     */
    public int getCin() {
        return cin;
    }

    /**
     * @param cin the cin to set
     */
    public void setCin(int cin) {
        this.cin = cin;
    }
    
    public int getNum_tlfn() {
        return num_tlfn;
    }
    
    public void getNum_tlfn(int num_tlfn) {
        this.num_tlfn = num_tlfn;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
      public String getEmail() {
        return email;
    }

    /**
     * @param nom the nom to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the date_naiss
     */
    public LocalDate getDate_naiss() {
        return date_naiss;
    }

    /**
     * @param date_naiss the date_naiss to set
     */
    public void setDate_naiss(LocalDate date_naiss) {
        this.date_naiss = date_naiss;
    }

    
   protected abstract String ToString(); 

    /**
     * @return the photo
     */
    public Blob getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(Blob photo) {
        this.photo = photo;
    }
    
}
