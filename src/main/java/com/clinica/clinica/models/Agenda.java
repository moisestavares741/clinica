package com.clinica.clinica.models;

import com.clinica.clinica.controllers.MedicoControl;

public class Agenda {
    private String dataAgendamento;
    private String horaAgendamento;
    private String medico;
    private String status; //Agendado ou Cancelado
    
    
    public Agenda(String dataAgendamento, String horaAgendamento, String medico, String status) {
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
        this.medico = medico;
        this.status = status;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public String getDataAgendamento() {
        return dataAgendamento;
    }


    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }


    public String getHoraAgendamento() {
        return horaAgendamento;
    }


    public void setHoraAgendamento(String horaAgendamento) {
        this.horaAgendamento = horaAgendamento;
    }


    public String getMedico() {
        return medico;
    }


    public void setMedico(String medico) {
        this.medico = medico;
    }


 public static Agenda a = new Agenda("", "", MedicoControl.m1.getNome(),"");
    
}
