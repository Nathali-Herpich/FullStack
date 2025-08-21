# 👑 Herança em Java

A **herança** é um dos quatro pilares da **Programação Orientada a Objetos (POO)** e está presente de forma robusta na linguagem **Java**. Com ela, podemos **reutilizar código**, **especializar comportamentos** e **organizar melhor** nossa arquitetura de software.

---

## 🧠 O que é Herança?

> Herança é o mecanismo pelo qual uma **classe filha (subclasse)** herda os **atributos** e **métodos** de uma **classe pai (superclasse)**.

Ela permite criar novas classes baseadas em classes já existentes, promovendo a **reutilização de funcionalidades** e a **redução de redundância**.

---

## 🔤 Sintaxe Básica

Em Java, utilizamos a palavra-chave `extends` para indicar que uma classe herda de outra.

---

## 🌳 Tipos de Herança (em Java)

| Tipo                | Suporte em Java | Descrição                                                                 |
|---------------------|------------------|---------------------------------------------------------------------------|
| 🧍‍♂️ Herança Simples  | ✅ Suportado       | Uma subclasse herda de uma única superclasse.                             |
| 🌿 Herança Multinível | ✅ Suportado       | Uma subclasse herda de outra subclasse que já herdou de outra.            |
| 👪 Herança Múltipla   | ❌ Não suportado diretamente | Java não permite herança múltipla de **classes** (mas permite com **interfaces**). |

---

## 🔁 Sobrescrita de Métodos

A subclasse pode **reescrever (override)** métodos da superclasse para alterar ou especializar comportamentos.  
Java usa a anotação `@Override` para deixar isso explícito.

---

## 🧱 Acesso a membros herdados

A subclasse tem acesso a todos os **métodos e atributos públicos e protegidos** (`public`, `protected`) da superclasse.  
Membros `private` **não são herdados diretamente**, mas podem ser acessados por meio de métodos públicos ou protegidos.

---

## 📦 Palavra-chave `super`

Java fornece a palavra-chave `super` para:

- Acessar métodos ou atributos da superclasse.
- Chamar o construtor da superclasse dentro do construtor da subclasse.

---

## ✅ Vantagens da Herança

- **Reutilização de código**
- **Facilidade de manutenção**
- **Melhor organização e estruturação**
- **Facilidade na implementação de hierarquias lógicas**

---



## 🧩 Herança x Interface

| Aspecto           | Classe (`extends`) | Interface (`implements`) |
|-------------------|---------------------|---------------------------|
| Múltiplas heranças | ❌ Não suportado     | ✅ Suportado               |
| Métodos concretos  | ✅ Sim               | 🔄 A partir do Java 8 (default methods) |
| Uso principal      | Reutilização        | Contrato/comportamento    |

---

## 🚀 Conclusão

A herança em Java é uma ferramenta poderosa para **reaproveitamento de código** e **modelagem de relacionamentos lógicos** entre classes.  
Quando usada com critério e boas práticas, ela ajuda a criar sistemas mais **limpos**, **modulares** e **flexíveis**. ✨

---
