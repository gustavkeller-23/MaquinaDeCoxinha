package com.mycompany.maquinacoxinha;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    private MaquinaCoxinha maquina;
    
    @FXML
    private TextField qtdTotalCoxinhas;
    @FXML
    private TextField qtdCoxinhasVendidas;
    @FXML
    private TextField qtdCoxinhasAbastecidas;
    @FXML
    private TextField qtdCoxinhasVendidasUNID;
    @FXML
    private TextField qtdCoxinhasAbastecidasUNID;
    
    @FXML
    private void initialize(){
        maquina = new MaquinaCoxinha();
        qtdTotalCoxinhas.setText(String.valueOf(maquina.getMaquina()));
    }
    
    @FXML
    private void abastecer(){
        Integer CoxinhasAbastecidas = Integer.parseInt(qtdCoxinhasAbastecidas.getText());
        qtdCoxinhasAbastecidas.setText("");
        maquina.abastecer(CoxinhasAbastecidas);
        qtdTotalCoxinhas.setText(String.valueOf(maquina.getMaquina()));
    }
    
    @FXML
    private void vender(){
        Integer CoxinhasVendidas = Integer.parseInt(qtdCoxinhasVendidas.getText());
        qtdCoxinhasVendidas.setText("");
        
        if(Integer.parseInt(qtdTotalCoxinhas.getText()) - CoxinhasVendidas >= 0){
            maquina.vender(CoxinhasVendidas);
            qtdTotalCoxinhas.setText(String.valueOf(maquina.getMaquina()));
        }
    }
    
    @FXML
    private void abastecerUNID(){
        maquina.abastecer(1);
        qtdTotalCoxinhas.setText(String.valueOf(maquina.getMaquina()));
    }
    
    @FXML
    private void venderUNID(){
        if(Integer.parseInt(qtdTotalCoxinhas.getText()) - 1 >= 0){
            maquina.vender();
            qtdTotalCoxinhas.setText(String.valueOf(maquina.getMaquina()));
        }
    }
    
    @FXML
    private void zerarMaquina(){
        maquina.zerar();
        qtdTotalCoxinhas.setText(String.valueOf(maquina.getMaquina()));
    }
    
    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }
}
