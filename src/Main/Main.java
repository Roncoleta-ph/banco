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
        String user = "postgres";
        String password = "Paulo2002";

       }
}