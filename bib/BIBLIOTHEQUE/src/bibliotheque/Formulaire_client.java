/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotheque;

/**
 *
 * @author Myriam
 */
public class Formulaire_client {
    
    private int cin_client;
    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;
    
    public Formulaire_client(int cin,String question1,String question2,String question3,String question4,String question5){
    this.cin_client=cin;
    this.question1=question1;
    this.question2=question2;
    this.question3=question3;
    this.question4=question4;
    this.question5=question5;
    
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
     * @return the question1
     */
    public String getQuestion1() {
        return question1;
    }

    /**
     * @param question1 the question1 to set
     */
    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    /**
     * @return the question2
     */
    public String getQuestion2() {
        return question2;
    }

    /**
     * @param question2 the question2 to set
     */
    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    /**
     * @return the question3
     */
    public String getQuestion3() {
        return question3;
    }

    /**
     * @param question3 the question3 to set
     */
    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    /**
     * @return the question4
     */
    public String getQuestion4() {
        return question4;
    }

    /**
     * @param question4 the question4 to set
     */
    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    /**
     * @return the question5
     */
    public String getQuestion5() {
        return question5;
    }

    /**
     * @param question5 the question5 to set
     */
    public void setQuestion5(String question5) {
        this.question5 = question5;
    }
    
    

    
    
}
