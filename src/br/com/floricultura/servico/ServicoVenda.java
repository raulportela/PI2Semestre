/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.servico;

import br.com.floricultura.db.dao.DaoVenda;
import br.com.floricultura.model.validador.ValidadorVenda;
import br.com.floricultura.model.venda.Venda;

/**
 *
 * @author raul.pportela
 */
public class ServicoVenda {

    public static String venda(Venda venda) throws Exception {
        String resposta;
        System.out.println("Chega no serviço pra vender ?");
        resposta = ValidadorVenda.validar(venda);
        System.out.println("Passa do validador ?");
        if (resposta == null) {
            try {
                System.out.println("entrou no if pra chamar o Dao");
                DaoVenda.inserir(venda);
            } catch (Exception e) {
                e.printStackTrace();
                resposta = "Erro na fonte de dados.";
            }
        } else {
            return resposta;
        }

        return resposta;
    }

}
