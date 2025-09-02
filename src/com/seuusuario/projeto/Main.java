package com.seuusuario.projeto;

import com.seuusuario.projeto.exception.PedidoException;
import com.seuusuario.projeto.model.Pedido;
import com.seuusuario.projeto.service.CsvService;
import com.seuusuario.projeto.service.PedidoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    private static final String ARQUIVO_ENTRADA = "dados/pedidos.csv";
    private static final String ARQUIVO_SAIDA = "dados/resultado.csv";

    public static void main(String[] args) {
        CsvService csvService = new CsvService();
        PedidoService pedidoService = new PedidoService();

        try {
            System.out.println("Lendo pedidos...");
            List<Pedido> pedidos = csvService.lerPedidosCSV(ARQUIVO_ENTRADA);

            System.out.println("Calculando total por cliente...");
            Map<String, Double> totais = pedidoService.calcularTotalPorCliente(pedidos);

            List<String[]> dadosParaSalvar = new ArrayList<>();
            dadosParaSalvar.add(new String[]{"cliente", "total_pedidos"});

            for (Map.Entry<String, Double> entry : totais.entrySet()) {
                dadosParaSalvar.add(new String[]{entry.getKey(), String.format("%.2f", entry.getValue())});
            }

            System.out.println("Salvando resultado...");
            csvService.salvarResultadoCSV(ARQUIVO_SAIDA, dadosParaSalvar);

            System.out.println("Finalizado! Resultado salvo em: " + ARQUIVO_SAIDA);
        } catch (PedidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}