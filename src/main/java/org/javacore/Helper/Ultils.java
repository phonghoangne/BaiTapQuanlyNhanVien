package org.javacore.Helper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Ultils {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/qlnv";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root123";

       private static String pattern = "MM-dd-yyyy";
    // cai de dki driver voi DriverManageger
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");// moi loia database co 1 duong dan khac nhay
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }}
    // mo ket noi den database
    public static Connection getConnection() throws SQLException {

        Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

        return conn;
    }
    // ham close de dong cac connect.
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static String formatDate(Date date)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return  simpleDateFormat.format(date);
    };
}
