# 📦 Projeto Java: Leitura e Processamento de Pedidos CSV

- Estruturação de pacotes
- Leitura de arquivos CSV
- Processamento de dados
- Tratamento de exceções personalizadas
- Escrita de saída em CSV

---

## 📚 Descrição do Projeto

A aplicação simula o processamento de pedidos, onde os dados de entrada estão em um arquivo `.csv` contendo informações como:

- Nome do cliente
- Produto
- Quantidade
- Preço unitário

O sistema realiza a leitura dos pedidos, trata dados inválidos utilizando uma **exceção personalizada (`PedidoException`)**, processa os pedidos válidos e gera um novo arquivo CSV com os resultados processados.

---

## 📁 Estrutura do Projeto

meu-projeto-dio-java/
│
├── src/
│ └── com.seuusuario.projeto/
│ ├── model/
│ │ └── Pedido.java
│ ├── service/
│ │ ├── CsvService.java
│ │ └── PedidoService.java
│ ├── exception/
│ │ └── PedidoException.java
│ └── Main.java
│
├── modelo-relatorio.md
├── README.md

yaml
Copiar código

---

## 🚀 Como Executar o Projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/EvertpnCodes/meu-projeto-dio-java.git
cd meu-projeto-dio-java
