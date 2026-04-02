Sistema de Cadastro de Produtos (Java POO)

📖 Sobre o Projeto

Este projeto foi desenvolvido utilizando **Java** para praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)**.

O sistema simula um simples **cadastro de produtos**, permitindo a criação de objetos e a exibição de suas informações, incluindo a quantidade total de produtos cadastrados por meio de um atributo estático.

---

Funcionalidades

* Criar produtos utilizando:
  * Construtor padrão
  * Construtor com parâmetros
* Exibir dados dos produtos (nome e preço)
* Controlar a quantidade total de produtos com variável estática
* Demonstrar sobrecarga de construtores

---

Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Construtores
* Sobrecarga de Construtores
* Atributos e Métodos Estáticos
* Reutilização de Código

---

Tecnologias Utilizadas

* Java
* Visual Studio Code (VS Code)

---

Estrutura do Projeto

```
CadastroProdutos/
 └── src/
      └── br/edu/produto/
           ├── Produto.java
           └── Principal.java
```

---

Exemplo de Código

Produto.java

```
public class Produto {

    String nome;
    double preco;
    static int quantidadeTotal = 0;

    public Produto() {
        quantidadeTotal++;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidadeTotal++;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("----------------------");
    }

    public static void exibirQuantidadeTotal() {
        System.out.println("Quantidade total de produtos: " + quantidadeTotal);
    }
}
```

---

Principal.java

````
public class Principal {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto("Notebook", 3500.00);
        Produto p3 = new Produto("Mouse", 150.00);
        Produto p4 = new Produto("Monitor", 560.00);

        p1.nome = "Teclado";
        p1.preco = 120.00;

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
        p4.exibirDados();

        Produto.exibirQuantidadeTotal();
    }
}
````

---

Como Executar

1. Abra o projeto no **VS Code**
2. Instale as extensões Java se necessário
3. Compile e execute o arquivo"Principal.java"
4. Veja o resultado no terminal

---

Saída Esperada

```
Nome: Teclado
Preço: R$ 120.0
----------------------
Nome: Notebook
Preço: R$ 3500.0
----------------------
Nome: Mouse
Preço: R$ 150.0
----------------------
Nome: Monitor
Preço: R$ 560.0
----------------------
Quantidade total de produtos: 4

---
````
Contexto Acadêmico

Este projeto foi desenvolvido como parte da disciplina de **Linguagem Orientada a Objetos** no curso de **Análise e Desenvolvimento de Sistemas (ADS).

---

Autor

Matheus Bertulino Dos Santos

---

Licença

Este projeto tem finalidade acadêmica.
