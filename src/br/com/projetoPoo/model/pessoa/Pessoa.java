/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.model.pessoa;

/**
 *
 * @author Leonardo Maia
 */
    public abstract class Pessoa {

        protected String nome;
        protected String sobrenome;
        protected String cpf;
        protected String dataNascimento;

        public String getNome() {
            return nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        public String getCpf() {
            return cpf;
        }

        public String getDataNascimento() {
            return dataNascimento;
        }

        @Override
        public String toString() {
            return String.format("%s,%s,%s,%s", getNome(), getSobrenome(),
                    getCpf(), getDataNascimento());

        }
    }
