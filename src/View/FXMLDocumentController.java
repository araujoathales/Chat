/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Thales
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button botaoEnviar;
    private TextArea txtareaMensagem;
    private TextArea txtareaConversa;
    
    @FXML
    private void enviarMesagem(ActionEvent event) {
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
