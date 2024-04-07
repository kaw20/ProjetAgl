/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Myriam
 */
public class gest_photo {
    
    public String path;

    
  ImageIcon  upload_photo(){
     JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
         this.path=  f.getAbsolutePath();
        try{
            BufferedImage bi=ImageIO.read(new File(path));
            Image img=bi.getScaledInstance(126, 111, Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(img);
        return icon;
        }catch(IOException ex){
          JOptionPane.showMessageDialog(null,ex);
        }
        return null;
  }
  
  ImageIcon getIcon(Employee emp) {
       ImageIcon icon = null;
           this.path="C:\\Users\\Myriam\\Desktop\\images_bib\\"+emp.getCin()+".jpg";
            try{

           byte[] bytea=(emp.getPhoto()).getBytes(1,(int)(emp.getPhoto()).length());
               FileOutputStream fos=new FileOutputStream(path);
               fos.write(bytea);
               icon=new ImageIcon(bytea);
                              return icon;

           }catch(Exception e){
                          JOptionPane.showMessageDialog(null,e);
               }      
                return null;
            }
  }
  
  

