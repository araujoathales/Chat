/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.domain;

/**
 *
 * @author Thales
 */
public class User {
    private int idUser;
    private String userName;
    private int idSala;

    public User(int idUser, String userName, int idSala) {
        this.idUser = idUser;
        this.userName = userName;
        this.idSala = idSala;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    
    
}
