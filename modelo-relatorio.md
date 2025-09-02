# Relatório do Projeto: Processamento de Pedidos com Java Puro

## 1. Objetivo

O objetivo deste projeto é desenvolver uma aplicação em Java que lê dados de pedidos de um arquivo CSV, processa as informações para calcular o total gasto por cliente e salva os resultados em um novo arquivo CSV. O foco é aplicar conceitos básicos de manipulação de arquivos, tratamento de exceções e programação orientada a objetos, tudo isso sem o uso de frameworks ou ferramentas de build, como Maven.

---

## 2. Tecnologias Utilizadas

- Linguagem: Java 11 (Java puro, sem frameworks)
- Ferramentas: JDK, editor de código (IDE ou terminal)
- Controle de versão: Git e GitHub para versionamento e portfólio

---

## 3. Descrição das Funcionalidades

- **Leitura do CSV**: O `CsvService` realiza a leitura do arquivo CSV, convertendo cada linha em um objeto `Pedido`.
- **Processamento dos dados**: O `PedidoService` calcula o total gasto por cada cliente somando os valores dos seus pedidos.
- **Escrita do CSV**: Após o processamento, o resultado é salvo em um novo arquivo CSV, com o total por cliente.
- **Tratamento de exceções**: Foram implementadas exceções customizadas para lidar com erros na leitura/escrita dos arquivos e no formato dos dados.

---

## 4. Como Executar

### Pré-requisitos

- Java JDK 11+ instalado e configurado no PATH
- Editor de texto ou IDE para edição do código
- Terminal ou prompt de comando para compilar e executar

### Passos

1. Clone ou faça o download do repositório.
2. Navegue até a pasta raiz do projeto.

