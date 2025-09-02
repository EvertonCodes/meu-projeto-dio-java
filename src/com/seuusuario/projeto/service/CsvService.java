package com.seuusuario.projeto.service;

import com.seuusuario.projeto.exception.PedidoException;
import com.seuusuario.projeto.model.Pedido;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvService {

    public List<Pedido> lerPedidosCSV(String caminhoArquivo) throws PedidoException {
        List<Pedido> pedidos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pula cabeçalho

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length < 4) {
                    throw new PedidoException("Formato inválido no CSV");
                }

                int pedidoId = Integer.parseInt(partes[0].trim());
                String cliente = partes[1].trim();
                double valor = Double.parseDouble(partes[2].trim());
                String data = partes[3].trim();

                pedidos.add(new Pedido(pedidoId, cliente, valor, data));
            }
        } catch (IOException | NumberFormatException e) {
            throw new PedidoException("Erro ao ler CSV: " + e.getMessage());
        }

        return pedidos;
    }

    public void salvarResultadoCSV(String caminhoArquivo, List<String[]> dados) throws PedidoException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (String[] linha : dados) {
                bw.write(String.join(",", linha));
                bw.newLine();
            }
        } catch (IOException e) {
            throw new PedidoException("Erro ao salvar CSV: " + e.getMessage());
        }
    }
}