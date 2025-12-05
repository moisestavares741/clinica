package com.clinica.clinica.models;

public class Recepcionista extends Pessoa {
    

    //Atributos
   private double salario;
   private String turno;
   
   
   public double getSalario() {
    return salario;
}


   public void setSalario(double salario) {
    this.salario = salario;
   }


   public String getTurno() {
    return turno;
   }


   public void setTurno(String turno) {
    this.turno = turno;
   }


   public Recepcionista(String nome, String dtNasc, String cpf, String telefone, String endereco, String email,
        double salario, String turno) {
    super(nome, dtNasc, cpf, telefone, endereco, email);
    this.salario = salario;
    this.turno = turno;
   } 

    public static Recepcionista r1 = new Recepcionista("Maria da Silva", "1977-05-08", "09809876544", "1209876655", "Rua das Recepcionista n10", "recepcionistanota10@gmail.com", 2300, "Tarde");
}
