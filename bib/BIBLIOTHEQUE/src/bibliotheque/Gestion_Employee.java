/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

import static bibliotheque.Gestion_Employee.getConnection;
import java.sql.*;
import com.mysql.cj.jdbc.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.time.*;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Myriam
 */
public class Gestion_Employee {
    
    
    public static final String URL = "jdbc:mysql://localhost:3306/bibliotheque"; 
public static final String USER= "root";
public static final String PASS= "";  
        FileInputStream is;


public static Connection getConnection(){
try {
Connection con=DriverManager.getConnection(URL, USER, PASS);
return con;
} catch (SQLException ex) {
throw new RuntimeException("Error connecting to the database", ex);
}
}



/*Rh*/
public void ajout_employee(Employee employee,String path){
 Connection connection = getConnection();
 
 LocalDate date1=employee.getDate_naiss();
  LocalDate date2=employee.getDate_emb();

           java.sql.Date Date_naiss = java.sql.Date.valueOf(date1);
           java.sql.Date Date_emb = java.sql.Date.valueOf(date2);

  String sql="INSERT INTO Employee VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

try {
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1, employee.getCin());
    preparedStatement.setString(2, employee.getNom());
    preparedStatement.setString(3, employee.getPrenom());
    preparedStatement.setString(4, employee.getEmail());
    preparedStatement.setString(5, "adresse");
    preparedStatement.setInt(6, employee.getNum_tlfn());
    preparedStatement.setString(7, employee.getPassword());
    preparedStatement.setDate(8, Date_naiss);
    preparedStatement.setDate(9, Date_emb);
    preparedStatement.setString(10, employee.getDep());
    preparedStatement.setInt(11, employee.getSalaire());
    try {
        is = new FileInputStream(new File(path));
        preparedStatement.setBlob(12, is);
    } catch (Exception ex) {
    }

    int rowCount = preparedStatement.executeUpdate();

} catch (SQLException e1) {
    System.out.println(e1);
}

  }
   

   
   
   
   
   
   
public void suprimer_employee(int cin){
Connection connection = getConnection();

    String sql = "DELETE FROM Employee WHERE cin=?";

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, cin);

        int rowCount = preparedStatement.executeUpdate();

        if (rowCount > 0) {
            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("No employee found with the provided cin.");
        }

    } catch (SQLException e1) {
        e1.printStackTrace();
    } finally {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
      
      
      
      
      
      
public void modifier_employee(String adresse, int num_tlfn, String dep, int salaire, int cin) {
    Connection connection = getConnection();

    String sql = "UPDATE `employee` SET `adresse` = ?, `num_tlfn` = ?, `dep` = ?, `salaire` = ? WHERE `employee`.`Cin` = ?";

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, adresse);
        preparedStatement.setInt(2, num_tlfn);
        preparedStatement.setString(3, dep);
        preparedStatement.setInt(4, salaire);
        preparedStatement.setInt(5, cin);

        int rowCount = preparedStatement.executeUpdate();
    } catch (SQLException e1) {
        e1.printStackTrace();
    }
}


Employee afficher_employee(int cin,String mdp,String dep){
          Connection connection = getConnection();
        PreparedStatement preparedStatement;
Employee emp1;
try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM Employee WHERE cin=? and password =?  and dep=?");
    preparedStatement.setInt(1, cin);
    preparedStatement.setString(2, mdp);
    preparedStatement.setString(3,dep);


   ResultSet rs = preparedStatement.executeQuery();
        // Process the result set if needed
    while(rs.next()){
    emp1= new Employee(rs.getInt("cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getDate("date_naiss"),rs.getInt("num_tlfn"),rs.getString("password"),rs.getString("dep"),rs.getInt("salaire"),rs.getDate("date_emb"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));
    return emp1;
    }
    
} catch (SQLException ex) {
ex.printStackTrace();

}return null;

}

Employee afficher_employee(int cin){
          Connection connection = getConnection();
        PreparedStatement preparedStatement;
Employee emp1;
try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM Employee WHERE cin=? ");
    preparedStatement.setInt(1, cin);
      ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
    emp1= new Employee(rs.getInt("cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getDate("date_naiss"),rs.getInt("num_tlfn"),rs.getString("password"),rs.getString("dep"),rs.getInt("salaire"),rs.getDate("date_emb"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));
    return emp1;
    }
    
} catch (SQLException ex) {
ex.printStackTrace();

}return null;

}
 


 
 
 
public Vector<Employee> affichier_recherche_avancee(String colonne,String value) throws SQLException{
 
Vector<Employee> list = new Vector<>();

              Connection connection = getConnection();
        PreparedStatement preparedStatement;
Employee emp1;
try { 
    
    preparedStatement = connection.prepareStatement("SELECT * FROM Employee WHERE "+colonne+" = ? ");

    if (!colonne.equals("num_tlfn") && !colonne.equals("Cin")){
        preparedStatement.setString(1, value);}
    else{
        preparedStatement.setInt(1, Integer.parseInt(value));
    }
   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
    emp1= new Employee(rs.getInt("cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getDate("date_naiss"),rs.getInt("num_tlfn"),rs.getString("password"),rs.getString("dep"),rs.getInt("salaire"),rs.getDate("date_emb"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));
list.add(emp1);
    }
        return list;

} catch (SQLException ex) {   

ex.printStackTrace();
return null;
} 


 }
 
public Vector<Employee> affichier_employee_tous_trié(){
 
Vector<Employee> list = new Vector<>();

           Connection connection = getConnection();
        Statement statement;
    try {
        statement = connection.createStatement();
    
    String sql="SELECT * FROM Employee order by salary;";


ResultSet rs = statement.executeQuery(sql);  
    while(rs.next()){
   Employee emp=new Employee(rs.getInt("cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getDate("date_naiss"),rs.getInt("num_tlfn"),rs.getString("password"),rs.getString("dep"),rs.getInt("salaire"),rs.getDate("date_emb"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));

    list.add(emp);
    }
    return list;
} catch (SQLException ex) {
}
   return null;
 }       

 
 
 
/*Administration*/


public void ajout_client(Client client,String path){
 Connection connection = getConnection();
 LocalDate date1=client.getDate_naiss();
  LocalDate date2=client.getDate_inscription();

           java.sql.Date Date_naiss = java.sql.Date.valueOf(date1);
           java.sql.Date Date_inscription = java.sql.Date.valueOf(date2);

           String sql="INSERT INTO client VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

try {
PreparedStatement preparedStatement = connection.prepareStatement(sql);
preparedStatement.setInt(1, client.getCin());
preparedStatement.setString(2, client.getNom());
preparedStatement.setString(3, client.getPrenom());
preparedStatement.setString(4, client.getEmail());
preparedStatement.setString(5, "tunis");
preparedStatement.setInt(6, client.getNum_tlfn());
preparedStatement.setString(7, client.getPassword());
preparedStatement.setDate(8, Date_naiss);
preparedStatement.setDate(9, Date_inscription);
preparedStatement.setInt(10, client.getNbr_livre_effectuee());
preparedStatement.setInt(11, client.getNbr_livre_depassee());
preparedStatement.setInt(12, client.getNbr_livre_en_cours());
try {
    FileInputStream is = new FileInputStream(new File(path));
    preparedStatement.setBlob(13, is);
} catch (Exception ex) {
    ex.printStackTrace();
}
int rowCount = preparedStatement.executeUpdate();

}catch (SQLException e1) {

e1.printStackTrace();

}
  
   }
   
   
public Vector<Client> affichier_recherche_avancee_client(String colonne,String value) throws SQLException{
 
Vector<Client> list = new Vector<>();

              Connection connection = getConnection();
        PreparedStatement preparedStatement;
Employee emp1;
try { 
    
    preparedStatement = connection.prepareStatement("SELECT * FROM client WHERE "+colonne+" = ? ");

    if (!colonne.equals("num_tlfn") && !colonne.equals("Cin")){
        preparedStatement.setString(1, value);}
    else{
        preparedStatement.setInt(1, Integer.parseInt(value));
    }
   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
   Client client=new Client(rs.getInt("Cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("Email"),rs.getDate("date_naiss"),rs.getInt("num_tlfn"),rs.getString("password"),rs.getDate("date_inscription"),rs.getInt("nbr_livre_effectué"),rs.getInt("nbr_livre_depassé"),rs.getInt("nbr_livre_encours"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));
list.add(client);
    }
        return list;

} catch (SQLException ex) {   

ex.printStackTrace();
return null;
} 


 }
   
   public void suprimer_client(int cin){
         Connection connection = getConnection();
           
           String sql="delete from client  where cin=?";

try {
    PreparedStatement preparedStatement = connection.prepareStatement(sql);

preparedStatement.setInt(1, cin);



int rowCount =preparedStatement.executeUpdate(sql);

}

catch (SQLException e1) {
e1.printStackTrace();
}
      }
      
      
      
      
      
      
public void modifier_client(String adresse,int num_tlfn ,int cin){
    Connection connection = getConnection();
    String sql = "UPDATE Client SET Adresse=?, Num_tlfn=? WHERE Cin=?";

    try {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, adresse);
        preparedStatement.setInt(2, num_tlfn);
        preparedStatement.setInt(3, cin);

        // No need to pass the SQL query string to executeUpdate() method
        int rowCount = preparedStatement.executeUpdate(); 

        // Check if any rows were affected
        if (rowCount > 0) {
            System.out.println("Client information updated successfully.");
        } else {
            System.out.println("No client found with the given ID.");
        }
    } catch (SQLException e1) {
        e1.printStackTrace();
    }
}

   
   
   
   
   
public Client afficher_client(int cin){
          Connection connection = getConnection();
        PreparedStatement preparedStatement;

try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM client WHERE Cin= ?");
    preparedStatement.setInt(1, cin);

   ResultSet rs = preparedStatement.executeQuery();
        // Process the result set if needed
    while(rs.next()){

   Client client=new Client(rs.getInt("Cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("Email"),rs.getDate("Date_naiss"),rs.getInt("Num_tlfn"),rs.getString("Password"),rs.getDate("Date_inscription"),rs.getInt("Nbr_livre_effectué"),rs.getInt("Nbr_livre_depassé"),rs.getInt("Nbr_livre_encours"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));

   return client;
    }
} catch (SQLException ex) {
                          JOptionPane.showMessageDialog(null,ex);

}
return null;

 }
public Client afficher_client(int cin,String pwd){
          Connection connection = getConnection();
        PreparedStatement preparedStatement;

try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM client WHERE Cin= ? and Password=?");
    preparedStatement.setInt(1, cin);
        preparedStatement.setString(2, pwd);


   ResultSet rs = preparedStatement.executeQuery();
        // Process the result set if needed
    while(rs.next()){

   Client client=new Client(rs.getInt("Cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("Email"),rs.getDate("Date_naiss"),rs.getInt("Num_tlfn"),rs.getString("Password"),rs.getDate("Date_inscription"),rs.getInt("Nbr_livre_effectué"),rs.getInt("Nbr_livre_depassé"),rs.getInt("Nbr_livre_encours"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));

   return client;
    }
} catch (SQLException ex) {
                          JOptionPane.showMessageDialog(null,ex);

}
return null;
 }
 
 
 
 
public Vector<Client> affichier_client_tous(){
 
Vector<Client> list = new Vector<>();

           Connection connection = getConnection();
        Statement statement;
    try {
        statement = connection.createStatement();
    
    String sql="SELECT * FROM client";


ResultSet rs = statement.executeQuery(sql);  
    while(rs.next()){
   Client client=new Client(rs.getInt("cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getDate("date_naiss"),rs.getInt("num_tlfn"),rs.getString("password"),rs.getDate("date_insription"),rs.getInt("nbr_livre_effectuee"),rs.getInt("nbr_livre_depassee"),rs.getInt("nbr_livre_en_cours"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));

    list.add(client);
    }
    return list;
} catch (SQLException ex) {
}
   return null;
 }
 
public Vector<Client> affichier_client_tous_trié(){
          Connection connection = getConnection();
        PreparedStatement preparedStatement;
Vector<Client> list = new Vector<>();

        try { 
    
  preparedStatement = connection.prepareStatement("SELECT * FROM client ORDER BY nom;");


   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
   Client client=new Client(rs.getInt("Cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("Email"),rs.getDate("date_naiss"),rs.getInt("num_tlfn"),rs.getString("password"),rs.getDate("date_inscription"),rs.getInt("nbr_livre_effectué"),rs.getInt("nbr_livre_depassé"),rs.getInt("nbr_livre_encours"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));
list.add(client);
    }
        return list;

} catch (SQLException ex) {   

ex.printStackTrace();
return null;
}
} 
 
 
 
         
public void creer_emprunt(Emprunt emprunt){
   Connection connection = getConnection();

// Assuming emprunt is an instance of the Emprunt class
LocalDate date1 = emprunt.getDate_emprunt();
LocalDate date2 = emprunt.getDate_limite();

java.sql.Date Date_emprunt = java.sql.Date.valueOf(date1);
java.sql.Date Date_limite = java.sql.Date.valueOf(date2);

String sql = "INSERT INTO Emprunt (Date_emprunt, Date_limite, Livre, Client, Done, photo_livre, photo_client) VALUES (?, ?, ?, ?, ?, ?, ?)";

try {
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setDate(1, Date_emprunt);
    preparedStatement.setDate(2, Date_limite);
    preparedStatement.setInt(3, emprunt.getLivre().getCode());
    preparedStatement.setInt(4, emprunt.getClient().getCin());
    preparedStatement.setInt(5, 0);
    preparedStatement.setBlob(6, emprunt.getLivre().getPhoto());
    preparedStatement.setBlob(7, emprunt.getClient().getPhoto());

    // Execute the update
    int rowCount = preparedStatement.executeUpdate();
    System.out.println(rowCount + " rows affected");
} catch (Exception ex) {
    ex.printStackTrace();
}

}
         
         
         
public Emprunt afficher_emprunt(int code_livre,int cin){
          Connection connection = getConnection();
        PreparedStatement preparedStatement;

try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM Emprunt WHERE Livre= ? and Client=?");
        preparedStatement.setInt(1, code_livre);
    preparedStatement.setInt(2, cin);

   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){

Emprunt emprunt=new Emprunt(rs.getInt("Code"),rs.getDate("Date_Emprunt").toLocalDate(),rs.getDate("Date_limite").toLocalDate(),afficher_Livre(code_livre),afficher_client(cin),false);
return emprunt;
    }
} catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);

}
return null;
 }      




         


   






public Vector<Emprunt> afficher_emprunt_tous(){
 
Vector<Emprunt> list = new Vector<>();

           Connection connection = getConnection();
        Statement statement;
    try {
        statement = connection.createStatement();
    
    String sql="SELECT * FROM Emprunt order by Code";


ResultSet rs = statement.executeQuery(sql);  
    while(rs.next()){
  Emprunt emprunt=new Emprunt(rs.getInt("code"),rs.getDate("date_emprunt").toLocalDate(),rs.getDate("date_limite").toLocalDate(),afficher_Livre(rs.getInt("livre")),afficher_client(rs.getInt("client")),rs.getBoolean("done"));

    list.add(emprunt);
    }
    return list;
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, ex);
}
   return null;
 }
    

public void emprunt_done(int code) {
    Connection connection = getConnection();
    PreparedStatement preparedStatement = null;
    try {
        String sql = "UPDATE Emprunt SET Done = 1 WHERE code = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, code);
        int rowsAffected = preparedStatement.executeUpdate();
      
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, ex.getMessage());
    } finally {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}




public Vector<Emprunt> afficher_tous_emprunt_en_cours(){
 
Vector<Emprunt> list = new Vector<>();

           Connection connection = getConnection();
         PreparedStatement preparedStatement;

try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM Emprunt WHERE date_limite>?");
    java.sql.Date DATE=java.sql.Date.valueOf(LocalDate.now());
    preparedStatement.setDate(1,DATE );

   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
  Emprunt emprunt=new Emprunt(rs.getInt("code"),rs.getDate("date_emprunt").toLocalDate(),rs.getDate("date_limite").toLocalDate(),afficher_Livre(rs.getInt("livre")),afficher_client(rs.getInt("client")),rs.getBoolean("done"));

    list.add(emprunt);
    }
    return list;
} catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);

}
   return null;
 }
         
public Vector<Emprunt> afficher_tous_emprunt_effectuee(){

        Vector<Emprunt> list = new Vector<>();

           Connection connection = getConnection();
        Statement statement;
    try {
        statement = connection.createStatement();
    
    String sql="SELECT * FROM Emprunt where done=1";


ResultSet rs = statement.executeQuery(sql);  
    while(rs.next()){
  Emprunt emprunt=new Emprunt(rs.getInt("code"),rs.getDate("date_emprunt").toLocalDate(),rs.getDate("date_limite").toLocalDate(),afficher_Livre(rs.getInt("livre")),afficher_client(rs.getInt("client")),rs.getBoolean("done"));

    list.add(emprunt);
    }
    return list;
} catch (SQLException ex) {
}
   return null;
 }

 
  Vector<Emprunt>  afficher_tous_emprunt_depassee(){
         Vector<Emprunt> list = new Vector<>();

           Connection connection = getConnection();
         PreparedStatement preparedStatement;
 
try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM Emprunt WHERE date_limite>=? and done=0 ");
    java.sql.Date DATE=java.sql.Date.valueOf(LocalDate.now());
    preparedStatement.setDate(1,DATE );

   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
  Emprunt emprunt=new Emprunt(rs.getInt("code"),rs.getDate("date_emprunt").toLocalDate(),rs.getDate("date_limite").toLocalDate(),afficher_Livre(rs.getInt("livre")),afficher_client(rs.getInt("client")),rs.getBoolean("done"));
    list.add(emprunt);
    }
    return list;
} catch (SQLException ex) {
}
   return null;
         }



         
         
         

  
  /* Bibliothecaire*/
  
void ajout_livre(Livre livre,String path){
      Connection connection = getConnection();
           String sql="INSERT INTO livre (Titre,auteur,rating,nbr_copies,Genre,Disponible,Description,photo)VALUES(?,?,?,?,?,?,?)";

try {
PreparedStatement preparedStatement = connection.prepareStatement(sql);
preparedStatement.setString(1, livre.getTitre());
preparedStatement.setString(2, livre.getAuteur());
preparedStatement.setInt(3, livre.getRating());
preparedStatement.setInt(4, livre.getNbr_copies());
preparedStatement.setString(5, livre.getGenre());
preparedStatement.setString(6, livre.getDescription());
preparedStatement.setInt(7, livre.isDispo());
try {
    FileInputStream is = new FileInputStream(new File(path));
    preparedStatement.setBlob(7, is);
} catch (Exception ex) {
    ex.printStackTrace();
}
int rowCount = preparedStatement.executeUpdate();

}catch (SQLException e1) {


e1.printStackTrace();

}
      }
  
      
public void suprimer_livre(int code){
      Connection connection = getConnection();
           
           String sql="delete from Livre  where code=?";

try {
    PreparedStatement preparedStatement = connection.prepareStatement(sql);

preparedStatement.setInt(1, code);



int rowCount =preparedStatement.executeUpdate(sql);

}

catch (SQLException e1) {
e1.printStackTrace();
}
      
      }
      
      
public void modifier_livre(int code,int dispo){
       Connection connection = getConnection();
           
           String sql="Update Livre set  dispo= ? where code=?";

try {
PreparedStatement preparedStatement = connection.prepareStatement(sql);
preparedStatement.setInt(1, dispo);
preparedStatement.setInt(1, code);

int rowCount =preparedStatement.executeUpdate(sql);

}

catch (SQLException e1) {
e1.printStackTrace();
      }

}


public Vector<Livre> affichier_livre_tous(){
 
Vector<Livre> list = new Vector<>();

           Connection connection = getConnection();
        Statement statement;
    try {
        statement = connection.createStatement();
    
    String sql="SELECT * FROM Livre";


ResultSet rs = statement.executeQuery(sql);  
    while(rs.next()){

  Livre livre=new Livre(rs.getInt("Code"),rs.getString("Titre"),rs.getString("auteur"),rs.getString("genre"),rs.getInt("rating"),rs.getInt("nbr_copies"),rs.getInt("Disponible"),rs.getString("Description"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));

    list.add(livre);
    }
    return list;
} catch (SQLException ex) {
}
   return null;
 }

public Livre afficher_Livre(String titre){
          Connection connection = getConnection();
        PreparedStatement preparedStatement;

try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM Livre WHERE titre= ?");
    preparedStatement.setString(1, titre);

   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
  Livre livre=new Livre(rs.getInt("Code"),rs.getString("Titre"),rs.getString("auteur"),rs.getString("genre"),rs.getInt("rating"),rs.getInt("nbr_copies"),rs.getInt("Disponible"),rs.getString("Description"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));
  return livre;
    }
} catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);

}return null;
 }
    
public Livre afficher_Livre(int code){
          Connection connection = getConnection();
        PreparedStatement preparedStatement;

try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM Livre WHERE code= ?");
    preparedStatement.setInt(1, code);

   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
  Livre livre=new Livre(rs.getInt("Code"),rs.getString("Titre"),rs.getString("auteur"),rs.getString("genre"),rs.getInt("rating"),rs.getInt("nbr_copies"),rs.getInt("Disponible"),rs.getString("Description"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));
  return livre;
    }
} catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);

}return null;
 }
      


public Vector<Livre> affichier_recherche_avancee_livre(String colonne,String value) {
 
Vector<Livre> list = new Vector<>();
Livre livre;
              Connection connection = getConnection();
        PreparedStatement preparedStatement;
Employee emp1;
try { 
    
    preparedStatement = connection.prepareStatement("SELECT * FROM livre WHERE "+colonne+" = ? ");

    if (colonne.equals("Code")){
        preparedStatement.setInt(1,Integer.parseInt( value));}
    else{
        preparedStatement.setString(1,value);
    }
   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
           livre=new Livre(rs.getInt("Code"),rs.getString("Titre"),rs.getString("auteur"),rs.getString("genre"),rs.getInt("rating"),rs.getInt("nbr_copies"),rs.getInt("Disponible"),rs.getString("Description"),(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));

    
list.add(livre);
    }
        return list;

} catch (SQLException ex) {   

ex.printStackTrace();
return null;
}

}

public Event afficher_event(){

              Connection connection = getConnection();
        PreparedStatement preparedStatement;

try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM Event WHERE date >= DATE_SUB(CURRENT_DATE(), INTERVAL 1 WEEK);");

   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
Timestamp timestamp = rs.getTimestamp("Date");
LocalDateTime localDateTime = timestamp.toLocalDateTime();

Event event = new Event(rs.getString("Titre"), rs.getString("Description"), localDateTime,(com.mysql.cj.jdbc.Blob)rs.getBlob("photo"));
  return event;
    }
} catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex);
}return null;
    
}


public Vector<Emprunt> afficher_historique( int cin){
          Connection connection = getConnection();
        PreparedStatement preparedStatement;
        Vector<Emprunt> list = new Vector<>();
try{

    preparedStatement = connection.prepareStatement("SELECT * FROM Emprunt WHERE Client=?");
    preparedStatement.setInt(1, cin);

   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
boolean done;
switch(rs.getInt("done")){
    case 1:
        done=true;
        break;
    default:
        done=false;
}
        
 Emprunt emprunt=new Emprunt(rs.getInt("code"),rs.getDate("date_emprunt").toLocalDate(),rs.getDate("date_limite").toLocalDate(),afficher_Livre(rs.getInt("livre")),afficher_client(rs.getInt("client")),done);
    list.add(emprunt);
    }
    return list;
}catch(Exception ex){   
    
    JOptionPane.showMessageDialog(null, ex);
}
return null;
}

 


Emprunt client_warning(){

    
    return null;
}

Emprunt emprunt_depassée_client(int cin){


  Connection connection = getConnection();
         PreparedStatement preparedStatement;

try { 
    preparedStatement = connection.prepareStatement("SELECT * FROM Emprunt WHERE date_limite<? and done=0 and client=? ");
    java.sql.Date DATE=java.sql.Date.valueOf(LocalDate.now());
    preparedStatement.setDate(1,DATE );
    preparedStatement.setInt(2,cin );


   ResultSet rs = preparedStatement.executeQuery();
    while(rs.next()){
  Emprunt emprunt=new Emprunt(rs.getInt("code"),rs.getDate("date_emprunt").toLocalDate(),rs.getDate("date_limite").toLocalDate(),afficher_Livre(rs.getInt("livre")),afficher_client(rs.getInt("client")),rs.getBoolean("done"));
    
    return emprunt;}
} catch (SQLException ex) {
}
   return null;
         }

void formulaire(Formulaire_client form){


      Connection connection = getConnection();
   try {

      String sql="INSERT INTO formulaire VALUES(?,?,?,?,?,?)";

PreparedStatement preparedStatement = connection.prepareStatement(sql);
preparedStatement.setInt(1, form.getCin_client());
preparedStatement.setString(2,form.getQuestion1());
preparedStatement.setString(3,form.getQuestion2());
preparedStatement.setString(4,form.getQuestion3());
preparedStatement.setString(5,form.getQuestion4());
preparedStatement.setString(6,form.getQuestion5());
int rowCount = preparedStatement.executeUpdate();

}catch (SQLException e1) {

    JOptionPane.showMessageDialog(null, e1);
}
      }

void add_rating(Rating rate){
    
      Connection connection = getConnection();
   try {

      String sql="INSERT INTO rating VALUES(?,?,?)";

PreparedStatement preparedStatement = connection.prepareStatement(sql);
preparedStatement.setInt(1, rate.getCode_livre());
preparedStatement.setInt(2,rate.getCin_client());
preparedStatement.setInt(3,rate.getRating());

modif_rate_livre(rate.getCode_livre(),rate.getRating());

int rowCount = preparedStatement.executeUpdate();

}catch (SQLException e1) {

    JOptionPane.showMessageDialog(null, "h"+e1);
}

  
}
double rate(int code){
       Connection connection = getConnection();
        PreparedStatement preparedStatement;

try { 
    preparedStatement = connection.prepareStatement("SELECT avg(Rating) FROM Rating group by(code_livre) having code_livre= ?");
    preparedStatement.setInt(1, code);
    ResultSet rs = preparedStatement.executeQuery();
  if (rs.next()){
               JOptionPane.showMessageDialog(null, rs.getDouble("rating"));
               return( rs.getDouble("Rating"));
            }  
} catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
}return 0;
}

public void modif_rate_livre(int code,double rate){
       Connection connection = getConnection();
           String sql="UPDATE `livre` SET `rating` = ? WHERE `livre`.`Code` = ?;";
try {
PreparedStatement preparedStatement = connection.prepareStatement(sql);
preparedStatement.setInt(1, (int)rate);
preparedStatement.setInt(1, code);

int rowCount =preparedStatement.executeUpdate(sql);

}
catch (SQLException e1) {
        JOptionPane.showMessageDialog(null,e1);
      }

}

}
 


