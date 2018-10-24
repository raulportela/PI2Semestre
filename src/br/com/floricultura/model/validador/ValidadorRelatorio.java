
package br.com.floricultura.model.validador;

import br.com.floricultura.model.relatorio.Relatorio;


public class ValidadorRelatorio {
    
    public static String ValidadorRelatorio (Relatorio relatorio){
    
            String mensagemErroPadrao = "Favor informar os campos obrigatórios: ";
            
            if (relatorio == null){
                return mensagemErroPadrao = "Não foi informado dados de relatório. ";                
            }
        
            if(relatorio.getPeriodoInicial() == null || "".equals(relatorio.getPeriodoInicial())){
             mensagemErroPadrao += "\nPeriodo incial. ";             
            }
            if (relatorio.getPeriodoFinal() == null || "".equals(relatorio.getPeriodoFinal())){
                mensagemErroPadrao += "\nPeriodo final. ";                                
            }
            if (relatorio.getPeriodoInicial().after(relatorio.getPeriodoFinal())){
                mensagemErroPadrao += "\nData inicial deve ser menor ou igual a data final. ";
                
            }
        return null;
    }
    
   
    
}
