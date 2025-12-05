package com.clinica.clinica.models;

import java.util.Map;

//Suberclasse, abstrata(genécica)
abstract class Pessoa {

    //Atributos

    private String nome;
    private String dtNasc;
    private String  cpf;
    private String telefone;
    private String endereco;
    private String email;

    //metodos
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoa(String nome, String dtNasc, String cpf, String telefone, String endereco, String email) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
    }

    public void QuemSou(){

        System.out.println("Olá, eu sou" + nome);
    }

   
    
}
