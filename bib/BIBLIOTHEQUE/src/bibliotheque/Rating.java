/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

/**
 *
 * @author Myriam
 */
public class Rating {
    private int cin_client;
    private int code_livre;
    private int rating;
    
    public Rating(int cin,int code,int rating){
    this.cin_client=cin;
    this.code_livre=code;
    this.rating=rating;

    }

    /**
     * @return the cin_client
     */
    public int getCin_client() {
        return cin_client;
    }

    /**
     * @param cin_client the cin_client to set
     */
    public void setCin_client(int cin_client) {
        this.cin_client = cin_client;
    }

    /**
     * @return the code_livre
     */
    public int getCode_livre() {
        return code_livre;
    }

    /**
     * @param code_livre the code_livre to set
     */
    public void setCode_livre(int code_livre) {
        this.code_livre = code_livre;
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
    
    
}
