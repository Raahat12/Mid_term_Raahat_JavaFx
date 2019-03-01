/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_raahat;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 *
 * @author STUDENTS
 */
public class FXMLDocumentController implements Initializable {
    
  @FXML
  
 GridPane gridPane; 
          
  String Days[] =  new String[]{"Monday", "Tuesday", "Wednesday","Thursday","Friday"};
  String Time[]= new String []{"11:00-8:30","4:00","-","8:30-10:30","8:30-1:00"};
  
  @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        gridPane.add(new Label(Days[0]),0,0);
        gridPane.add(new Label(Time[0]),1,0);
        
        for (int col = 0; col <Days.length; col++){
        for (int row = 1; row < 4; row++){
            
        gridPane.add(new Label(Days[row]),col,row);
        
        }
        // Fin 
        
        }
    
    }    
    


}
