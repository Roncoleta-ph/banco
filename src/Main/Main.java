package Main;

import model.MedicoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	 public static void main(String[] args) {
	        MedicoDAO dao = new MedicoDAO();
	        dao.listarMedicos();  // Vai buscar e imprimir os médicos do banco
	    }
	
    public static void Main(String[] args) {
        Main main = new Main();
        main.Database();
    }

    public void Database() {
        final String DSN = "jdbc:postgresql://localhost:5432/Progii?ssl=false";
        final String USER = "postgres";
        final String PASSWORD = "Paulo2002";

        try (Connection conn = DriverManager.getConnection(DSN, USER, PASSWORD)) {
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}