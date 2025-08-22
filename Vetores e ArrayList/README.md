# 📚 Vetores (Arrays) e ArrayList em Java
## 1. 🧮 Vetores (Arrays)

Um vetor é uma estrutura de dados que armazena uma quantidade fixa de elementos do mesmo tipo.

O tamanho é definido na criação e não pode ser alterado depois.

Como declarar e inicializar?
```Java
int[] numeros = new int[5]; // vetor de inteiros com 5 posições
String[] nomes = {"Ana", "Carlos", "Beatriz"}; // vetor de Strings inicializado

Acessando elementos:
numeros[0] = 10;          // atribui valor na posição 0
System.out.println(nomes[1]); // imprime "Carlos"
````

## Características:

📌 Tamanho fixo.

⚡ Acesso rápido a elementos pelo índice.

Pode armazenar tipos primitivos e objetos.

## Desvantagem:

❌ Não é possível aumentar ou diminuir o tamanho depois.


## 2. 📋 ArrayList
O que é?

ArrayList é uma lista dinâmica que pode crescer ou diminuir durante a execução.

Armazena apenas objetos (para tipos primitivos, usa wrappers como Integer para int).

Importante:
````Java
import java.util.ArrayList;
````

Como declarar e inicializar?
````Java
ArrayList<String> nomes = new ArrayList<>();
ArrayList<Integer> numeros = new ArrayList<>();
```` 
Adicionando elementos:
````Java
nomes.add("Ana");
nomes.add("Carlos");
numeros.add(10);
numeros.add(20);
````

Acessando elementos:
````Java 
String nome = nomes.get(0);
int numero = numeros.get(1);
````

Removendo elementos:
````Java 
nomes.remove("Ana");     
numeros.remove(0);      
````

## Características:

🎯 Tamanho dinâmico.

🛠️ Muitos métodos úteis: add(), remove(), contains(), size(), clear().

Mais flexível que arrays.


## 3. ⚔️ Diferenças principais
- Aspecto	Vetor (Array)	ArrayList;
- Tamanho	Fixo	Dinâmico; 
- Sintaxe
````
int[] arr = new int[5];	ArrayList<Integer> list = new ArrayList<>();
````
- Tipos armazenados	Primitivos e objetos	Apenas objetos (wrappers para primitivos);
- Métodos auxiliares	Nenhum	Muitos (add, remove, etc);
- Uso típico	Tamanho conhecido	Tamanho variável;

## 4. 💡 Exemplo rápido
````Java
// Vetor
int[] numeros = {10, 20, 30};
````
````Java
// ArrayList
ArrayList<Integer> numerosList = new ArrayList<>();
numerosList.add(10);
numerosList.add(20);
numerosList.add(30);
numerosList.add(40);
````
