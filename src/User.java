package login; // Pacote principal do sistema de login

import java.sql.Connection; // Classe para conexão com o banco de dados
import java.sql.DriverManager; // Gerenciador do driver JDBC
import java.sql.ResultSet; // Classe para manipular resultados de queries
import java.sql.Statement; // Classe para executar comandos SQL

/**
 * Classe User responsável por gerenciar operações de login.
 * - Estabelece conexão com o banco de dados.
 * - Verifica credenciais de login.
 */
public class User {

    /**
     * Método para estabelecer conexão com o banco de dados MySQL.
     * @return Objeto Connection para manipulação do banco.
     */
    public Connection conectarBD() {
        Connection conn = null; // Inicializa a conexão como nula
        try {
            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.Driver").newInstance();

            // URL de conexão com credenciais
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";

            // Estabelece a conexão com o banco
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Tratamento de exceção em caso de erro na conexão
            e.printStackTrace();
        }
        return conn; // Retorna a conexão (ou null em caso de erro)
    }

    // Variáveis públicas para armazenar resultados
    public String nome = ""; // Nome do usuário
    public boolean result = false; // Resultado da verificação

    /**
     * Método que verifica as credenciais do usuário.
     * @param login Login do usuário.
     * @param senha Senha do usuário.
     * @return True se as credenciais forem válidas, False caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Inicializa a query SQL
        Connection conn = conectarBD(); // Conecta ao banco

        try {
            // Monta a query para buscar o usuário
            sql += "select nome from usuarios ";
            sql += "where login = '" + login + "' ";
            sql += "and senha = '" + senha + "';";

            // Executa a query
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Verifica se há resultados
            if (rs.next()) {
                result = true; // Usuário encontrado
                nome = rs.getString("nome"); // Obtém o nome do usuário
            }
        } catch (Exception e) {
            // Tratamento de exceção em caso de erro
            e.printStackTrace();
        }
        return result; // Retorna o resultado
    }
}
