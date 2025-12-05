package com.clinica.clinica.models;



import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
//@Entity
//@Table(name="PACIENTES")


public class Paciente extends Pessoa {
    
    //atributos

    
    private boolean convenio;
    private String qualConvenio;
    private String tratamento;
    
    
    public boolean isConvenio() {
        return convenio;
    }


    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }


    public String getQualConvenio() {
        return qualConvenio;
    }


    public void setQualConvenio(String qualConvenio) {
        this.qualConvenio = qualConvenio;
    }


    public String getTratamento() {
        return tratamento;
    }


    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }


    public Paciente(String nome, String dtNasc, String cpf, String telefone, String endereco, String email,
            boolean convenio, String qualConvenio, String tratamento) {
        super(nome, dtNasc, cpf, telefone, endereco, email);
        this.convenio = convenio;
        this.qualConvenio = qualConvenio;
        this.tratamento = tratamento;
    }
    
    public static Paciente p = new Paciente(null, null, null, null, null, null, false, null, null);
}
