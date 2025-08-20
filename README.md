# 🌟 Conceitos Básicos de Programação Orientada a Objetos (POO) 🌐

A Programação Orientada a Objetos (POO) é um paradigma de programação que utiliza "objetos" para representar dados e métodos. Abaixo estão os conceitos básicos da POO.

## 🧠 Para que serve este repositório?

Este repositório tem a finalidade de:

- ✅ Projetos iniciais;
- ✅ Anotações;
- ✅ Gerar conhecimentos e aprendizados.

## 1. 🧩 Classe

Uma classe é um modelo ou um "blueprint" que define as propriedades (atributos) e comportamentos (métodos) que os objetos criados a partir dela terão.

```java
public class Carro {
    // Atributos
    String modelo;
    String cor;
    int ano;

    // Métodos
    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
````
## 2. 🧩 Objeto
Um objeto é uma instância de uma classe. Ele possui estado (valores dos atributos) e comportamento (métodos).
````Java

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // Criando um objeto da classe Carro
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "azul";
        meuCarro.ano = 1970;
        meuCarro.acelerar(); // Chamando o método
    }
}

````

## 3. 🧩 Encapsulamento
Encapsulamento é o princípio de ocultar os detalhes internos de uma classe e expor apenas o que é necessário. Isso é feito usando modificadores de acesso (como private, public) e métodos getters e setters.

````Java
public class Pessoa {
    private String nome; // Atributo privado

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
}
````

## 4. 🧩 Herança
Herança é um mecanismo que permite que uma classe herde atributos e métodos de outra classe. A classe que herda é chamada de subclasse, e a classe da qual herda é chamada de superclasse.

````Java
public class Veiculo {
    void mover() {
        System.out.println("O veículo está se movendo.");
    }
}

public class Carro extends Veiculo {
    void buzinar() {
        System.out.println("O carro está buzinando.");
    }
}

````

## 5.  🧩 Polimorfismo
Polimorfismo é a capacidade de um objeto assumir muitas formas. Em POO, isso geralmente se refere à capacidade de um método ter diferentes implementações, dependendo do objeto que o chama.

````Java

public class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

public class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

public class Gato extends Animal {
    void fazerSom() {
        System.out.println("O gato mia.");
    }
}

````

## 6. 🧩 Abstração
Abstração é o princípio de ocultar os detalhes complexos e mostrar apenas as características essenciais de um objeto. Isso pode ser feito usando classes abstratas e interfaces.

````Java

abstract class Forma {
    abstract void desenhar(); // Método abstrato
}

class Circulo extends Forma {
    void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}

````

## ✨ Resumo dos Conceitos
- Classe: Modelo que define atributos e métodos.

- Objeto: Instância de uma classe.

- Encapsulamento: Ocultação de detalhes internos e exposição de uma interface pública.

- Herança: Mecanismo que permite que uma classe herde de outra.

- Polimorfismo: Capacidade de um método ter diferentes implementações.

- Abstração: Ocultação de complexidade, mostrando apenas o que é necessário.



