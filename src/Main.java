import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args){
//        String username = ""; // username for SQL user
//        String password = ""; // password for SQL password
//        String Dbname = ""; // database's name
//
//        String query = "select * from koefs.koeficientebi"; // query for SQL database which gets whole info from database
//        String Url = "jdbc:mysql://localhost:3306/" + Dbname; // Url to connect to host
//        try (Connection connection = DriverManager.getConnection(Url, username, password);
//             Statement stmt = connection.createStatement()) { // creating connection to SLQ database and preparing for execute query in SQL
//            try(ResultSet rs = stmt.executeQuery(query)){ // executes SQL query
//                try (FileWriter Write = new FileWriter("roots.txt")){ // opening file where we'll write Eq solutions
//                    while (rs.next()) {
//                        double A = rs.getDouble("A");
//                        double B = rs.getDouble("B");
//                        double C = rs.getDouble("C"); // getting Eq coefficients from SQL database
//
//                        QuadraticEquation QE = new QuadraticEquation(A, B, C); // creating QuadraticEquation object with coefficients from SQL database
//                        Write.write("--------------------------------------------------------------------------\n");
//                        Write.write("koeficientebi:\tA = " + A + "\tB = " + B + "\tC = " + C + "\n"); // writing coefficients in txt file
//
//                        if (QE.getD() >= 0) {
//                            double X1 = QE.getRl() + QE.getIm();
//                            double X2 = QE.getRl() - QE.getIm();
//                            Write.write("X1 = " + X1 + "\nX2 = " + X2 + "\n"); // writing The solution of Eq when Eq has real solutions
//                        } else {
//                            Write.write("X1 = " + QE.getRl() + " + " + QE.getIm() + " * i " + "\nX2 = " + QE.getRl() + " - " + QE.getIm() + " * i\n"); // writing The solution of Eq when Eq has imaginary solutions
//                        }
//
//                        Write.write("--------------------------------------------------------------------------\n");
//                    }
//
//                    Write.close(); // closing file
//                } catch (IOException e) {
//                    throw new RuntimeException(e); // catches exceptions for file opening
//                }
//
//            } catch (SQLException e ) {
//                throw new Error("Problem", e); // catches exceptions for SQL query
//            }
//
//        } catch (SQLException e ) {
//            throw new Error("Problem", e); // catches exceptions for SQL database connection
//        }
        QuadraticEquation eq = new QuadraticEquation(1,-5,4);
        System.out.println(eq.toString());
    }
}
