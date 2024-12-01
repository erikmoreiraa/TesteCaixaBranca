# Projeto: Erros de Conexão com Banco de Dados

Nodos principais:
1. Início do método.
2. Conexão com o banco de dados.
3. Construção da query SQL.
4. Execução da query.
5. Condição: Usuário existe?
6. Retorno de sucesso (usuário encontrado).
7. Retorno de falha (usuário não encontrado).
8. Tratamento de exceção.
9. Fim do método.

## Cálculo da Complexidade Ciclomática
A complexidade ciclomática é calculada com a fórmula:


M=E−N+2

E (Arestas): Número de arestas (fluxos entre os nodos).
N (Nodos): Número de nodos (pontos no grafo).

**Cálculo**
Contar o número de arestas no grafo:
Exemplo: 10 arestas.
Contar o número de nodos:
Exemplo: 9 nodos.

Substituir na fórmula:

𝑀 = 10 − 9 + 2 = 3

## Base de Caminhos
Com a complexidade ciclomática de 3, existem 3 caminhos lineares independentes. Identifique-os com base no grafo de fluxo:

**Caminho 1:**
1 → 2 → 3 → 4 → 5 → 6 → 9
(Usuário encontrado com sucesso)

**Caminho 2:**
1 → 2 → 3 → 4 → 5 → 7 → 9
(Usuário não encontrado)

**Caminho 3:**
1 → 2 → 8 → 9
(Erro na execução)
