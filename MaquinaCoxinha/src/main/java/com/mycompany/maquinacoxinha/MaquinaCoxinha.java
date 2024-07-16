
package com.mycompany.maquinacoxinha;

public class MaquinaCoxinha {
    
    private Integer qtdCoxinhas;
    
    
    MaquinaCoxinha(){
        qtdCoxinhas = 0;
    }
    
    
    public void abastecer(Integer coxinhas){
        qtdCoxinhas += coxinhas;
    }
    
    public void vender(Integer coxinhas){
        if(qtdCoxinhas - coxinhas >=0)
            qtdCoxinhas -= coxinhas;
    }
    public void vender(){
        if(qtdCoxinhas - 1 >=0)
            qtdCoxinhas -= 1;
    }
    
    public void zerar(){
        qtdCoxinhas = 0;
    }
    
    public int getMaquina(){
        return qtdCoxinhas;
    }
}
