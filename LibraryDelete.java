import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LibraryDelete{

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
            String sql = "DELETE FROM LM_table WHERE id = ?";
            ps = con.prepareStatement(sql);
            System.out.print("Enter number of books to delete: ");
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= n; i++) {
                System.out.print("Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                ps.setInt(1, id);
                ps.addBatch();
            }

            // 4. Execute Batch
            int[] result = ps.executeBatch();


            // 5. Commit transaction
            con.commit();

            System.out.println("Batch executed successfully!");
            System.out.println("Number of records deleted: " + result.length);

        } catch (Exception e) {

            try {
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