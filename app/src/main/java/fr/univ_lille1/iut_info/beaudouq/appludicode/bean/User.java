package fr.univ_lille1.iut_info.beaudouq.appludicode.bean;

/**
 * Created by quentin on 27/03/17.
 */

public class User {
    String name;
    String password;
    public User(){
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
