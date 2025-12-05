package com.clinica.clinica.controllers;

import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.clinica.models.Agenda;
import com.clinica.clinica.models.Caixa;
import com.clinica.clinica.models.Medico;
import com.clinica.clinica.models.Paciente;
import com.clinica.clinica.models.Recepcionista;


@RestController
@RequestMapping

public class RecepcionistaControl {

   

   
    
  

   

    

@GetMapping("/recepcionista/dados")
public Map<String,String> exibirDados() {
   
	
		

return Map.of("nome", Recepcionista.r1.getNome(),
              "DtNasc",Recepcionista.r1.getDtNasc(),
              "cpf",Recepcionista.r1.getCpf(),
              "telefone",Recepcionista.r1.getTelefone(),
              "endereco",Recepcionista.r1.getEndereco(),
              "email",Recepcionista.r1.getEmail(),
              "salario",String.valueOf(Recepcionista.r1.getSalario()),
              "turno",Recepcionista.r1.getTurno());
}
    @GetMapping("/recepcionista/agendamento")
    public Map<String,String> agendar() {

    Paciente.p.setNome(Paciente.p.getNome());
    Paciente.p.setTratamento(Paciente.p.getTratamento());

    Agenda.a.setDataAgendamento("2025-11-05");
    Agenda.a.setHoraAgendamento("06h:00");
    Agenda.a.setMedico(MedicoControl.m1.getNome());
    Agenda.a.setStatus("Cancelado");
    Caixa.c.setValorConsulta(700);
       
    

    return Map.of("status",Agenda.a.getStatus(),
                "data",Agenda.a.getDataAgendamento(),
                "horario",Agenda.a.getHoraAgendamento(),
                "medico", Agenda.a.getMedico(),
                "tratamento",Paciente.p.getTratamento(),
                "paciente",Paciente.p.getNome(),
                "pagamento",String.valueOf(Caixa.c.getValorConsulta()));
        
    
    }

    @GetMapping("/recepcionista/cancelar-agendamento")
    public Map<String,String> cancelar() {
        Agenda.a.setStatus("cancelado");
        return Map.of(
                "data",Agenda.a.getDataAgendamento(),
                "horario",Agenda.a.getHoraAgendamento(),
                "medico", Agenda.a.getMedico(),
                "paciente",Paciente.p.getNome(),
                "tratamento",Paciente.p.getTratamento(),
                "pagamento",String.valueOf(Caixa.c.getValorConsulta()));

    }
               
    

    @GetMapping("/recepcionista/pagar-consulta")
    public void pagarConsulta(@RequestParam double valor) {
       
        CaixaControl.operacao(1, 120.00, "Consulta do Dr." + Medico.medico.getNome());
        
       // return "redirect:/caixa/consulta-saldo";
    }


    @GetMapping("/recepcionista/pagar-medico")
    
    
    public Map<String,String> pagarMedico(@RequestParam String medico,double valor) {
        
        String descricao = "Pgto do Salario do medico "+ Medico.medico.getNome();
       
        
        CaixaControl.operacao(0, Medico.medico.getSalario(), "Pgto do Salario do medico "+ Medico.medico.getNome());
       
        
       return Map.of("status","Operacao Realizada com Sucesso!",
                        "Operação","0",
                        "Valor",String.valueOf(valor),
                        "Descrição",descricao);
    }

    @GetMapping("recepcionista/salario-atendente")

    public Map<String,String> pagarAtendente(){
        double salario = Recepcionista.r1.getSalario();
        CaixaControl.operacao(0,salario,"Pagamento Salario Atentente"+ Recepcionista.r1.getNome());

        return Map.of("status","Operacao Realizada com Sucesso!",
                        "Operação","0",
                        "Valor",String.valueOf(salario),
                        "Descrição","Pagamento Salario Atentente"+ Recepcionista.r1.getNome());
    }

    @GetMapping("/recepcionista/pagar-contas")

    public Map<String,String> pagarContas(@RequestParam double valor, String descricao){
        CaixaControl.operacao(0,1000.00,"");


        return Map.of("Status","Operação Paga Com Sucesso",
                        "valor",String.valueOf(1000),
                        "Descricao","Pagamento de Imposos"
        );
    }
   
}
