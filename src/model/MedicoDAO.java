package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicoDAO {

    private final String URL = "jdbc:postgresql://localhost:5432/Progii?ssl=false";
    private final String USER = "postgres";
    private final String PASSWORD = "Paulo2002";

    public void listarMedicos() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM medico")) {

            System.out.println("Lista de médicos cadastrados:");
            while (rs.next()) {
                Medico m = new Medico(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("crm"),
                    rs.getString("especialidade")
                );
                System.out.println(m);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar médicos: " + e.getMessage());
        }
    }
}
