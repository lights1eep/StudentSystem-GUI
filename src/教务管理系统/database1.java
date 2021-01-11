package 教务管理系统;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database1 {
public static void main(String[] args) {
  
    Connection con;
    // 驱动程序名
    String driver = "com.mysql.jdbc.Driver";
    // URL指向要访问的数据库名 test
    String url = "jdbc:mysql://localhost:3306/manager?serverTimezone=UTC&useSSL=false";
    // MySQL配置时的用户名
    String user = "root";
    // MySQL配置时的密码
    String password = "1314521..";
    // 遍历查询结果集
    try {
        // 加载驱动程序
        Class.forName(driver);
        // 1.getConnection()方法，连接MySQL数据库！！
        con = DriverManager.getConnection(url, user, password);
        if (!con.isClosed())
            System.out.println("\n\t\t成功以 " + user + " 身份连接到数据库！！！");

        // 2.创建statement类对象，用来执行SQL语句！！
        Statement statement = con.createStatement();
        // 要执行的SQL语句
        String sql = "select *from user_table";
     //  PreparedStatement prestmt=con.prepareStatement(sql);
      // prestmt.setInt(2, 2017000002);
      // prestmt.setString(1, "000002");
       //prestmt.setString(3, "学生");
     //  prestmt.executeUpdate();
        // 3.ResultSet类，用来存放获取的结果集！！
        ResultSet rs = statement.executeQuery(sql);
      //  System.out.println("\n\t\t执行结果如下所示:");
      //  System.out.println("\t\t-----------------------------------------------------------------");
      //  System.out.println("\t\t|\t" + "ID" + "\t" + "姓名" + "\t" + "性别" + "\t" + "年龄" + "\t" + "手机号码" + "\t\t" + "地址\t|");
      //  System.out.println("\t\t-----------------------------------------------------------------");

        int ID = 0;
        String password1 = null;
        String positon = null;
        //int Age = 0;
       // String Phone = null;
        //String Address = null;

    while (rs.next()) {
            // 获取 ID 这列数据
            ID = rs.getInt("user_id");
            // 获取 Name 这列数据
            password1 = rs.getString("user_password");
            // 获取 Sex 这列数据
           positon = rs.getString("user_position");
                  System.out.println("\t\t|\t" + ID + "\t" + password1 + "\t" + positon );
        }
      
        System.out.println("\t\t-----------------------------------------------------------------");
       rs.close();
      //  prestmt.close();
        con.close();
    }
    catch (ClassNotFoundException e) {
        // 数据库驱动类异常处理
        System.out.println("Sorry,can`t find the Driver!");
        e.printStackTrace();
    }
    catch (SQLException e) {
        // 数据库连接失败异常处理
        e.printStackTrace();
    }
    catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
    finally {
        System.out.println("\t\t\t\t\t\t\t\t获取数据库数据完毕！!！");
    }
}
}