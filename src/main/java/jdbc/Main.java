package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Main {

    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/workers_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "root";

    static Connection conn;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
                initDB();

                while (true) {
                    System.out.println("1: add ");
                    System.out.println("2: view");
                    System.out.println("3: close");
                    System.out.println("->");

                    String s = sc.nextLine();
                    if (s.equals("1")) {
                        addWorker(sc);
                    } else if (s.equals("2")) {
                        viewWorkerBySalary(sc);
                    } else {
                        return;
                    }
                }
            } finally {
                if (conn != null) conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void addWorker(Scanner sc) throws SQLException {
        System.out.print("Enter worker position: ");
        String position = sc.nextLine();
        System.out.print("Enter worker salary: ");
        String sSalary = sc.nextLine();
        System.out.print("Enter worker first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter worker last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter worker age: ");
        String sAge = sc.nextLine();
        System.out.print("Enter worker experience: ");
        String sExperience = sc.nextLine();

        int salary = Integer.parseInt(sSalary);
        int age = Integer.parseInt(sAge);
        double experience = Double.parseDouble(sExperience);


        PreparedStatement ps = conn.prepareStatement("INSERT INTO workers_new (worker_position, salary, first_name, last_name, age, experience) VALUES(?, ?, ?, ?, ?, ?)");
        try {
            ps.setString(1, position);
            ps.setInt(2, salary);
            ps.setString(3, firstName);
            ps.setString(4, lastName);
            ps.setInt(5, age);
            ps.setDouble(6, experience);
            ps.executeUpdate();
        } finally {
            ps.close();
        }
    }

    private static void viewWorkerBySalary(Scanner sc) throws SQLException {
        System.out.print("Enter salary: ");
        String salary = sc.nextLine();
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM workers_new WHERE salary = " + salary);
        try {
            ResultSet rs = ps.executeQuery();
            try {
                ResultSetMetaData md = rs.getMetaData();

                for (int i = 1; i <= md.getColumnCount(); i++)
                    System.out.print(md.getColumnName(i) + "\t\t");
                System.out.println();

                while (rs.next()) {
                    for (int i = 1; i <= md.getColumnCount(); i++) {
                        System.out.print(rs.getString(i) + "\t\t");
                    }
                    System.out.println();
                }
            } finally {
                rs.close();
            }
        } finally {
            ps.close();
        }
    }

    private static void initDB() throws SQLException {
        Statement st = conn.createStatement();
        try {
            st.execute("DROP TABLE IF EXISTS workers_new");
            st.execute("CREATE TABLE workers_new (" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "worker_position VARCHAR(50) NOT NULL," +
                    "salary INT," +
                    "first_name VARCHAR(50) NOT NULL," +
                    "last_name VARCHAR(50) NOT NULL," +
                    "age INT," +
                    "experience DOUBLE(2,1))");
        } finally {
            st.close();
        }
    }
}
