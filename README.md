# 💡 Minha Conta

Este projeto foi desenvolvido como parte do curso de Java da [Trybe](https://www.betrybe.com/). A proposta foi implementar uma ferramenta para gestão do consumo de energia, aplicando os conceitos iniciais da linguagem e praticando o uso de diferentes tipos de variáveis.

---

## 🛠 Tecnologias utilizadas

- Java
- Maven

---

## 🚀 Como executar o projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/minha-conta.git
   cd minha-conta

2. Instale as dependências:
   ```bash
   mvn dependency:resolve
   
3. Para realizar o processo completo (instalação de dependências, compilação, testes, empacotamento e instalação no repositório local), execute:
    ```bash
    mvn install
   
---

## ⚙️ Funcionalidades implementadas

### 📂 Classe `EnergyBill` (`src/main/java/com/betrybe/minhaconta/business/EnergyBill.java`)

- **Atributos e construtor**  
  Implementação dos atributos necessários e do construtor da classe `EnergyBill`.

- **Método `adjustedTariff()`**  
  Calcula a tarifa emitindo um acréscimo de 10% sobre a conta de luz quando o endereço não estiver associado a um plano residencial.
- **Método `calculateTotalUsage()`**  
  Soma o consumo total de energia com base nas leituras informadas.

---

### 📂 Classe `Application` (`src/main/java/com/betrybe/minhaconta/presentation/Application.java`)

- **Método `run()`**  
  Inicia o fluxo principal da aplicação, controlando o menu e a interação com o usuário.

- **Método `runOptionAction()`**  
  Executa a ação correspondente à opção selecionada pelo usuário no menu.
  
---

## 👩‍💻 Créditos
Este projeto foi proposto pela [Trybe](https://www.betrybe.com/)

---

<p align="center">Desenvolvido com 💚 por <a href="https://github.com/marcelaadriany" target="_blank">Marcela Andrade</a></p>
