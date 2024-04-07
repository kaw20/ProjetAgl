/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

/**
 *
 * @author Myriam
 */
import com.mysql.cj.jdbc.*;

public class Livre {
    private int Code;
    private String titre;
    private String auteur;
    private String genre;
    private int rating;
    private int nbr_copies;
    private int dispo;
    private String description;
    private Blob photo;

    /**
     * @return the Code
     */
    
    
    public Livre(int code,String titre,String auteur,String genre,int rating,int nbr_copies,int dispo,String description,Blob photo){
    this.Code=code;
    this.auteur=auteur;
    this.titre=titre;
    this.genre=genre;
    this.rating=rating;
    this.nbr_copies=nbr_copies;
    this.dispo=dispo;
    this.description=description;
    this.photo=photo;
    }
    
    public int getCode() {
        return Code;
    }

    /**
     * @param Code the Code to set
     */
    public void setCode(int Code) {
        this.Code = Code;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the nbr_page
     */

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the nbr_copie
     */


    /**
     * @return the dispo
     */
    public int isDispo() {
        return dispo;
    }

    /**
     * @param dispo the dispo to set
     */
    public void setDispo(int dispo) {
        this.dispo = dispo;
    }



     public Blob getPhoto() {
        return photo;
    }

    /**
     * @param nbr_lecteur the nbr_lecteur to set
     */
    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    /**
     * @return the nbr_copies
     */
    public int getNbr_copies() {
        return nbr_copies;
    }

    /**
     * @param nbr_copies the nbr_copies to set
     */
    public void setNbr_copies(int nbr_copies) {
        this.nbr_copies = nbr_copies;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

  
    /**
     * @return the Code
     */
   
}

