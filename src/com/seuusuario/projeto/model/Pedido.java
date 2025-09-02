package com.seuusuario.projeto.model;

public class Pedido {
    private int pedidoId;
    private String cliente;
    private double valor;
    private String data;

    public Pedido(int pedidoId, String cliente, double valor, String data) {
        this.pedidoId = pedidoId;
        this.cliente = cliente;
        this.valor = valor;
        this.data = data;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }
}