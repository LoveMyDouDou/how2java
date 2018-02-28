package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

    public static void main(String [] args){
        Statement statement=null;
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("database load successfully!");

            connection= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                    "root",
                    "YGloveHX1314"
            );
            System.out.println("连接成功，获取连接对象："+connection);

            statement=connection.createStatement();
            System.out.println("获取Statement对象："+statement);

            for (int id=60;id<70;++id){
                String sql="insert into hero values ("+id+","+"'英雄"+id+"'"
                        +","+200+","+50+");";
                statement.execute(sql);
            }


            System.out.println("执行插入语句成功");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
