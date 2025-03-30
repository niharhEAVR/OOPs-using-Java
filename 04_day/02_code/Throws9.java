import java.io.IOException;
import java.sql.SQLException;

public class Throws9 {

    // Method that throws multiple exceptions
    static void processData() throws IOException, SQLException {
        System.out.println("Processing data...");
        
        // Throwing exceptions
        if (Math.random() > 0.5) {
            throw new IOException("File not found!");
        } else {
            throw new SQLException("Database error!");
        }
    }

    public static void main(String[] args) {
        try {
            processData();
        } catch (IOException | SQLException e) {
            System.out.println("Exception: " + e);
        }
    }
}
