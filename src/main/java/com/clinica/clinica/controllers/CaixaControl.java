package com.clinica.clinica.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.clinica.models.Caixa;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping
public class CaixaControl {

    @GetMapping("/caixa/operacao")
    public static Map<String,String> operacao(@RequestParam Integer op, Double valor, String desc) {
       
        String  msg  = "Operação nao realizada";

        if (op==1) //acresentando dinheiro no caixa
        {
           Caixa.c.setSaldo(Caixa.c.getSaldo()+ valor); 
           msg  = "Operação relizada com sucesso";
        }

        if (op==0) //acresentando dinheiro no caixa
        {
           Caixa.c.setSaldo(Caixa.c.getSaldo()- valor); 
           msg  = "Operação relizada com sucesso";
        }

        return(Map.of("msg", msg,
            "Operacao: ", String.valueOf(op),
                "Saldo Atual",String.valueOf(Caixa.c.getSaldo()),
                "Descricao",desc
                )
            );
    }
    
    @GetMapping("/caixa/consulta-saldo")
    public static Map <String,String> consultaSaldo() {
        
       Double valor= Caixa.c.getSaldo();
       
        return(Map.of("SaldoAtual",String.valueOf(Caixa.c.getSaldo()),
        "valor",String.valueOf(valor) ));
    }
    
    
}
