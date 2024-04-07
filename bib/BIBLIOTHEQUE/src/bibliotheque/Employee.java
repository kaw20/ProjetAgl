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
import java.io.FileInputStream;
import java.util.*;
import java.time.*;
import java.time.LocalDate;
import java.sql.Date;

public class Employee extends Personne{
    private LocalDate date_emb;
    private String dep;
    private int salaire;
    
    
    public Employee (int cin,String nom,String prenom,String email,Date date_naiss,int num_tlfn,String password,String dep,int salaire,java.sql.Date date_emb,Blob photo){
     
     this.cin=cin;
     this.nom=nom;
     this.prenom=prenom;
     this.email=email;
     this.date_naiss = date_naiss.toLocalDate();
     this.num_tlfn=num_tlfn;
     this.password=password;
     this.photo=photo;
     this.dep=dep;
     this.salaire=salaire;
     this.date_emb = date_emb.toLocalDate();
    }

   

  
   
    
    protected String ToString(){
    return "nom: "+this.nom+"\nprenom: "+this.prenom+"\nemail: "+this.email+"\nadresse: "+this.adresse+"\nnumero de telephone: "+this.num_tlfn+"\ndate de naissance: "+this.date_naiss+"\n date d'embauche"+this.date_emb+"\nSalaire"+this.getSalaire()+"\nDepartement"+this.getDep();
    }

    /**
     * @return the date_emb
     */
    public LocalDate getDate_emb() {
        return date_emb;
    }

    /**
     * @param date_emb the date_emb to set
     */
    public void setDate_emb(LocalDate date_emb) {
        this.date_emb = date_emb;
    }

    /**
     * @return the dep
     */
    public String getDep() {
        return dep;
    }

    /**
     * @param dep the dep to set
     */
    public void setDep(String dep) {
        this.dep = dep;
    }

    /**
     * @return the salaire
     */
    public int getSalaire() {
        return salaire;
    }

    /**
     * @param salaire the salaire to set
     */
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    
    
    
    
}
