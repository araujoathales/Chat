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
public class Mensagem {
    private int idUser;
    private int idSala;
    private String txtMensagem;

    public Mensagem(int idUser, int idSala, String txtMensagem) {
        this.idUser = idUser;
        this.idSala = idSala;
        this.txtMensagem = txtMensagem;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getTxtMensagem() {
        return txtMensagem;
    }

    public void setTxtMensagem(String txtMensagem) {
        this.txtMensagem = txtMensagem;
    }
    
    
}
