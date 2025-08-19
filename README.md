# 🧙‍♂️ RPG Fantasia em Java

Este projeto simula um universo de RPG com personagens jogáveis e inimigos diversos. Utiliza conceitos de **Programação Orientada a Objetos (POO)** como herança, encapsulamento e polimorfismo para representar entidades do jogo.

---

## 🎮 Visão Geral do Código

O arquivo `Main.java` é o ponto de entrada do programa. Nele, são instanciados personagens e inimigos, e seus atributos são exibidos no console.

### 🧑‍💼 Personagens

Cada classe representa um tipo de personagem com atributos e métodos específicos:

| Classe      | Atributos Principais        | Métodos de Exibição         |
|-------------|-----------------------------|------------------------------|
| `Elfo`      | Nome, Idade, Raça           | `exibir()`                   |
| `Arqueiro`  | Nome, Idade, Arma           | `exibirArqueiro()`           |
| `Mago`      | Nome, Idade, Arma           | `exibirMago()`               |
| `Ladino`    | Nome, Idade, Característica | `exibirLadino()`             |
| `Guerreiro` | Nome, Idade, Arma           | `exibirGuerreiro()`          |

### 👹 Inimigos

Os inimigos também são representados por classes com atributos únicos:

| Classe        | Atributos Principais        | Métodos de Exibição         |
|---------------|-----------------------------|------------------------------|
| `Mumias`      | Raça, Poder                 | `exibirMumia()`              |
| `Gnolls`      | Raça, Poder                 | `exibirGnolls()`             |
| `Orcs`        | Raça, Característica        | `exibirOrcs()`               |
| `Espectros`   | Raça, Característica        | `exibirEspectro()`           |
| `Hobgoblis`   | Raça, Característica        | `exibirHobGoblin()`          |

---

## 🛠️ Requisitos
Java JDK 8 ou superior

IDE Java (IntelliJ, Eclipse, VS Code com extensão Java)

Estrutura de pacotes conforme o exemplo acima

---
