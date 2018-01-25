/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrellibres;

/**
 *
 * @author Alexis
 */
public class Autor {

    private String name;
    private String email;
    private char gender;

    public Autor(String name, String email, char gender) {
        this.setname(name);
        this.setemail(email);
        this.setgender(gender);
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getemail() {
        return this.email;
    }

    public void setgender(char gender) {
        this.gender = gender;
    }

    public char getgender() {
        return this.gender;
    }
    
    @Override
    public String toString() {
        return " el autor es " + this.getname() + " y es del género " + this.getgender() + ".";
    }

}
