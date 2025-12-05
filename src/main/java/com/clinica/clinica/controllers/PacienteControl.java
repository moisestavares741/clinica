package com.clinica.clinica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.clinica.models.Paciente;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping

public class PacienteControl {

  public static Paciente p1 = new Paciente("Moises", "1994-09-17", 
 "123456789098", "11912345622", "Rua da Silva n01", 
 "moises@hotmail.com", true, "ConvenioMed", 
  "Exames de Rotina");



  @GetMapping("/pacientes/cadastro")

  public Map<String,String> cadastrarDados(@RequestParam String nome, String dtNasc, String cpf, String telefone, String endereco, String email,
            boolean convenio, String qualConvenio, String tratamento){

    Paciente.p.setNome(nome);
    Paciente.p.setDtNasc(dtNasc);
    Paciente.p.setCpf(cpf);
    Paciente.p.setTelefone(telefone);
    Paciente.p.setEndereco(endereco);
    Paciente.p.setEmail(email);
    Paciente.p.setConvenio(convenio);
    Paciente.p.setQualConvenio(qualConvenio);
    Paciente.p.setTratamento(tratamento);

    return(Map.of("Status","Dados "+ Paciente.p.getNome()+ " Cadastrados com sucesso!"));
  }



  @GetMapping("/pacientes/dados")


public Map<String,String> exibirDados() {
	
		
return Map.of("nome", Paciente.p.getNome(),
              "DtNasc",Paciente.p.getDtNasc(),
              "cpf",Paciente.p.getCpf(),
              "telefone",Paciente.p.getTelefone(),
              "endereco",Paciente.p.getEndereco(),
              "email",Paciente.p.getEmail(),
              "convenio",Paciente.p.getQualConvenio(),
              "tratamento",Paciente.p.getTratamento());
}



    
}
