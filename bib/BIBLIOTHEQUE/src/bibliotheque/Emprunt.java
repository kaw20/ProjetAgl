/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import java.time.*;
import java.util.*;
import java.time.LocalDate;
import java.sql.Date;

/**
 *
 * @author Myriam
 */
public class Emprunt {
    private int code;
    private LocalDate date_emprunt;
    private LocalDate date_limite;
    private boolean done=false;
    private Livre livre;
    private Client client;
    


public Emprunt(int code,LocalDate date_emprunt,LocalDate date_limite,Livre livre,Client client,Boolean done){
    this.code=code;
    this.date_emprunt=date_emprunt;
    this.date_limite=date_limite;
    this.livre=livre;
    this.client=client;
    this.done=done;
    
    }
    /*
     * @return the code
     */
    
    
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the date_emprunt
     */
    public LocalDate getDate_emprunt() {
        return date_emprunt;
    }

    /**
     * @param date_emprunt the date_emprunt to set
     */
    public void setDate_emprunt(LocalDate date_emprunt) {
        this.date_emprunt = date_emprunt;
    }

    /**
     * @return the date_limite
     */
    public LocalDate getDate_limite() {
        return date_limite;
    }

    /**
     * @param date_limite the date_limite to set
     */
    public void setDate_limite(LocalDate date_limite) {
        this.date_limite = date_limite;
    }

    /**
     * @return the livre
     */
    public Livre getLivre() {
        return livre;
    }

    /**
     * @param livre the livre to set
     */
    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the done
     */
    public boolean isDone() {
        return done;
    }

    /**
     * @param done the done to set
     */
    public void setDone(boolean done) {
        this.done = done;
    }
    



}
