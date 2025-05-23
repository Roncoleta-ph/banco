package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // Dados do produto
        String name = "Mouse Gamer";
        String sku = "MG-123";
        double price = 129.99;

        // Dados do banco
        String url = "jdbc:postgresql://localhost:5432/Progii?ssl=false";
        String user = "Paulo2002";
        String password = "Paulo2002";

        try {
            // Conecta ao banco
            Connection conn = DriverManager.getConnection(url, user, password);

            // Prepara o SQL
            String sql = "INSERT INTO product (name, sku, price) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, sku);
            stmt.setDouble(3, price);

            // Executa
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Produto inserido com sucesso!");
            }

            // Fecha a conexão
            conn.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}