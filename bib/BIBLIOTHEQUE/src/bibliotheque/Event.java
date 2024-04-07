/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import com.mysql.cj.jdbc.Blob;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Myriam
 */
public class Event {
    private String titre;
    private String description;
    private LocalDateTime date_event;
    private Blob photo;
    
    
    public Event(String titre,String description,LocalDateTime date_event,Blob photo ){
    this.titre=titre;
    this.description=description;
    this.date_event=date_event;
    this.photo=photo;
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
     * @return the date_event
     */
    public LocalDateTime getDate_event() {
        return date_event;
    }

    /**
     * @param date_event the date_event to set
     */
    public void setDate_event(LocalDateTime date_event) {
        this.date_event = date_event;
    }

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
