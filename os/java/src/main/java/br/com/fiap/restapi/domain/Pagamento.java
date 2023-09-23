package br.com.fiap.restapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
    @Id
    private Integer idPagmaneto;
    @Column(nullable = false)
    private Boolean statuscompra;
    @Column(nullable = false)
    private String metodopagamento;

    public Pagamento(){

    }
    public Pagamento(Integer idPagmaneto, Boolean statuscompra, String metodopagamento) {
        this.idPagmaneto = idPagmaneto;
        this.statuscompra = statuscompra;
        this.metodopagamento = metodopagamento;
    }

    public Integer getIdPagmaneto() {
        return idPagmaneto;
    }

    public void setIdPagmaneto(Integer idPagmaneto) {
        this.idPagmaneto = idPagmaneto;
    }

    public Boolean getStatuscompra() {
        return statuscompra;
    }

    public void setStatuscompra(Boolean statuscompra) {
        this.statuscompra = statuscompra;
    }

    public String getMetodopagamento() {
        return metodopagamento;
    }

    public void setMetodopagamento(String metodopagamento) {
        this.metodopagamento = metodopagamento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "idPagmaneto=" + idPagmaneto +
                ", statuscompra=" + statuscompra +
                ", metodopagamento='" + metodopagamento + '\'' +
                '}';
    }
}
