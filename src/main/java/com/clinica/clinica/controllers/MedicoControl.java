package com.clinica.clinica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.clinica.models.Medico;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping

public class MedicoControl {
   
    public static  Medico m1 = new Medico("Moises", "1994-08-01", "12312312333", "11987665544", "Avenida da Medicina n10", "moises@medicos.com", "12345", "Ortopedia", 12344);
    
    @GetMapping("/medico/dados")
    public Map<String,String> exibirDados() {

        
   return(Map.of("Nome",m1.getNome(),
                      "dtNasc",m1.getDtNasc(),
                      "cpf",m1.getCpf(),
                      "telefone", m1.getTelefone(),
                       "endereco",m1.getEndereco(),
                       "email",m1.getEmail(),
                       "crm",m1.getCrm(),
                       "especialidade",m1.getEspecialidade(),
                       "salario",String.valueOf(m1.getSalario()))
                       );

                       }
    
    
}
