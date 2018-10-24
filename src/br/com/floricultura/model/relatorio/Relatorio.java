
package br.com.floricultura.model.relatorio;

import java.util.Date;



public class Relatorio {
    
      private Date periodoInicial = new Date(); 
      private Date periodoFinal = new Date();

    
    public Date getPeriodoInicial() {
        return periodoInicial;
    }

   
    public void setPeriodoInicial(Date periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    
    public Date getPeriodoFinal() {
        return periodoFinal;
    }

   
    public void setPeriodoFinal(Date periodoFinal) {
        this.periodoFinal = periodoFinal;
    }      
       
    
}
