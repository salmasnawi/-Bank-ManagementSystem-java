package com.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJavaDb {

    public static Connection connectDb() {
        try {
            // تحميل Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // الاتصال بقاعدة البيانات
            String url = "jdbc:mysql://localhost:4306/bankswing"; // تأكد من صحة المنفذ واسم قاعدة البيانات
            String user = "root"; // اسم المستخدم
            String password = ""; // كلمة المرور
            
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("تم الاتصال بقاعدة البيانات بنجاح!");
            return conn;
        } catch (ClassNotFoundException e) {
            System.err.println("Driver غير موجود: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("خطأ في الاتصال بقاعدة البيانات: " + e.getMessage());
        }
        return null;
    }
}
