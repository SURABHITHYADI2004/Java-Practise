import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LibraryManagement {

    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/LM_System";
        String user = "root";
        String password = "Surabhi@13";

        Connection con = null;
        PreparedStatement ps = null;
        Scanner sc = new Scanner(System.in);

        try {
            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            con = DriverManager.getConnection(url, user, password);

            // Turn OFF auto commit (important for batch)
            con.setAutoCommit(false);

            // 3. Prepare SQL Query
            String sql = "INSERT INTO LM_table VALUES (?, ?, ?,?,?)";
            ps = con.prepareStatement(sql);
            System.out.print("Enter number of books to insert: ");
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= n; i++) {
                System.out.print("Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Book Name: ");
                String name = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("Genre: ");
                String genre = sc.nextLine();
                System.out.print("Date of Publication: ");
                String dob = sc.nextLine();

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, author);
                ps.setString(4, genre);
                ps.setString(5, dob);

                ps.addBatch();
            }

            // 4. Execute Batch
            int[] result = ps.executeBatch();

            // 5. Commit transaction
            con.commit();

            System.out.println("Batch executed successfully!");
            System.out.println("Number of records inserted: " + result.length);

        } catch (Exception e) {

            try {
                // Rollback if any error occurs
                con.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        }

        finally {

            try {
                if (ps != null)
                    ps.close();
                if (con != null)
                    con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}