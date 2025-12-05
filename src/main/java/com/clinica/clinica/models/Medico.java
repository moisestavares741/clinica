package com.clinica.clinica.models;

import java.util.Map;

public class Medico extends Pessoa {

    //atributos

    private String crm;
    private String especialidade;
    private double salario;
   
   
    public String getCrm() {
        return crm;
    }


    public void setCrm(String crm) {
        this.crm = crm;
    }


    public String getEspecialidade() {
        return especialidade;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public Medico(String nome, String dtNasc, String cpf, String telefone, String endereco, String email, String crm,
            String especialidade, double salario) {
        super(nome, dtNasc, cpf, telefone, endereco, email);
        this.crm = crm;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Map <String, String> dadosMedico(){
        return(Map.of("'Nome'",getNome(),
                      "'dtNasc'","'"+getDtNasc()+"'",
                      "'cpf'", "'"+getCpf()+"'",
                      "'CRM'", "'"+getCrm()+"'",
                      "'telefone'", "'"+getTelefone()+"'",
                      "'endereco'", "'"+getEndereco()+"'",
                      "'especialidade'", "'"+getEspecialidade()+"'",
                      "'salario'", "'"+getSalario()+"'"


        
        ));
    }

    public static Medico medico = new Medico("Dr.Zé das Couves", "1977-12-12", 
    "123.123.123-11", "123456789", "Rua Dos Vegetais 12", 
    "zedascouves@uol.com", "12345", "Oftalmologista", 1000);
    
}
