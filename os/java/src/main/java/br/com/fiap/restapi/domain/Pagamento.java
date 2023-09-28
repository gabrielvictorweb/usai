package br.com.fiap.restapi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
    @Id
    private Integer idPagamento;
    @Column(nullable = false)
    private Boolean statusCompra;
    @Column(nullable = false)
    private String metodoPagamento;

    public Pagamento(){

    }
    public Pagamento(Integer idPagamento, Boolean statusCompra, String metodoPagamento) {
        this.idPagamento = idPagamento;
        this.statusCompra = statusCompra;
        this.metodoPagamento = metodoPagamento;
    }

    public Integer getidPagamento() {
        return idPagamento;
    }

    public void setidPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Boolean getstatusCompra() {
        return statusCompra;
    }

    public void setstatusCompra(Boolean statusCompra) {
        this.statusCompra = statusCompra;
    }

    public String getmetodoPagamento() {
        return metodoPagamento;
    }

    public void setmetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "idPagamento=" + idPagamento +
                ", statusCompra=" + statusCompra +
                ", metodoPagamento='" + metodoPagamento + '\'' +
                '}';
    }
}
