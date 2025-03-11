# Gerenciamento de Departamentos e Funcionários

## Visão Geral
Esta aplicação Java organiza funcionários em departamentos com base em dados de entrada. O programa processa uma lista de funcionários, os atribui aos departamentos apropriados e depois os classifica e exibe de forma estruturada.
Foi feito para um exercicio do curso Dev Superior para pratica de estruturas de dados como HashMap e Listas.

## Funcionalidades
- Processa dados de funcionários a partir de uma lista predefinida.
- Agrupa funcionários por departamento usando um `HashMap`.
- Garante a unicidade dos departamentos através dos métodos `equals` e `hashCode`.
- Ordena os departamentos em ordem alfabética.
- Exibe cada departamento e seus funcionários.

## Estrutura do Projeto
```
Model/
├── Main.java         # Ponto de entrada da aplicação
├── Department.java   # Representa um departamento
├── Employee.java     # Representa um funcionário
```

## Explicação das Classes
### `Department`
- Representa um departamento com um `id` e um `nome`.
- Implementa `equals` e `hashCode` para garantir unicidade.
- Possui um método `addEmployee` para criar objetos de funcionários.

### `Employee`
- Representa um funcionário com um `id`, `nome` e `salário`.
- Contém métodos getters e setters para os atributos.

### `Main`
- Lê e processa os dados dos funcionários.
- Armazena os funcionários nos departamentos correspondentes usando um `HashMap`.
- Ordena os departamentos em ordem alfabética.
- Exibe cada departamento junto com seus funcionários.

## Como Executar
1. Compile os arquivos Java:
   ```sh
   javac Model/*.java
   ```
2. Execute a aplicação:
   ```sh
   java Model.Main
   ```

## Exemplo de Saída
```
Estoque:
  4368: Dom Dias, $7000.0
  7523: Lara Matos, $8000.0
Marketing:
  2732: Bob Costa, $6500.0
  6421: Davi Souto, $7500.0
Vendas:
  8032: Meire Silva, $8000.0
  3298: Pedro Neto, $8500.0
  8639: Carol Souza, $9000.0
```

## Licença
Este projeto é de código aberto e gratuito para uso.

