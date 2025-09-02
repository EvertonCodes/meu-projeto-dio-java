package com.seuusuario.projeto.service;

import com.seuusuario.projeto.model.Pedido;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PedidoService {

    public Map<String, Double> calcularTotalPorCliente(List<Pedido> pedidos) {
        Map<String, Double> totalPorCliente = new HashMap<>();

        for (Pedido pedido : pedidos) {
            totalPorCliente.put(
                pedido.getCliente(),
                totalPorCliente.getOrDefault(pedido.getCliente(), 0.0) + pedido.getValor()
            );
        }

        return totalPorCliente;
    }
}