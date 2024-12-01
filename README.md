# Projeto: Erros de Conexão com Banco de Dados

## Descrição
Este projeto apresenta um código Java que realiza a conexão com um banco de dados MySQL e verifica usuários com base em login e senha.

## Objetivo
Analisar o código para identificar possíveis erros e más práticas de programação.

## Erros Identificados
1. **Tratamento de Exceções Insuficiente**  
   - Os blocos `catch` não possuem mensagens ou ações que facilitem o diagnóstico de problemas.

2. **Vulnerabilidade de Injeção de SQL**  
   - A concatenação de strings para construir queries SQL é vulnerável a ataques de injeção de SQL.

3. **Gerenciamento de Recursos**  
   - O objeto `Connection` não é fechado após o uso, causando vazamento de recursos.

4. **Classe do Driver Obsoleta**  
   - O código usa `com.mysql.Driver`, que está obsoleto em versões modernas do MySQL Connector.

5. **Credenciais Hardcoded**  
   - As credenciais do banco estão no código, comprometendo a segurança.

6. **Ausência de Validação da Conexão**  
   - Não há verificação para confirmar que a conexão foi estabelecida antes de executar a query.

7. **Nome da Classe Confuso**  
   - O nome `User` pode causar confusão, já que é um nome comum para classes de modelo.
