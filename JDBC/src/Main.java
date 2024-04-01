import java.sql.*;

public class Main {

    // Database connection parameters
    public static final String DB_URL = "jdbc:mysql://localhost/employee";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";


    public static void main(String[] args) {

        Connection success = null;
        String sql = "SELECT * FROM employees"; // Creating SQL Query

        try {

            success = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD); // Establishing connection to the database
            Statement st = success.createStatement();
            ResultSet data = st.executeQuery(sql);

            // Printing data to the console
            while (data.next()){
                System.out.println("ID :" + data.getInt("employee_id"));
                System.out.println("ALL NAME :" + data.getString("employee_name"));
                System.out.println("POSITION :" + data.getString("employee_position"));
                System.out.println("SALARY :" + data.getInt("employee_salary"));
                System.out.println("--> --> --> --> --> --> --> --> -->");
            }


            // Closing ResultSet, Statement, and Connection
            data.close();
            st.close();
            success.close();



        } catch (SQLException error){
            System.out.println(error.getMessage());
        }

        System.out.println("Operation Completed.");




    }
}