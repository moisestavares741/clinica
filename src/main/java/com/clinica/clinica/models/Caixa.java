package com.clinica.clinica.models;

import com.clinica.clinica.controllers.PacienteControl;

public class Caixa {
    //Atributos

    private double saldo;
    private double valorConsulta;
    
    
    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getValorConsulta() {
        return valorConsulta;
    }


    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }


    public Caixa(double saldo, double valorConsulta, String string) {
        this.saldo = saldo;
        this.valorConsulta = valorConsulta;
    }
 public static Caixa c = new Caixa(0, 0, Paciente.p.getNome());

}
