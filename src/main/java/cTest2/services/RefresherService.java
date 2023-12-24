package cTest2.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RefresherService {

    private String sql = "select * from people";
    public int getData() {
        int result = -1;
        try {
        	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/danny","root","DaGlickers1!");
        	Statement statement = connection.createStatement();
        	ResultSet resultSet = statement.executeQuery(sql); 
        	while (resultSet.next()) {
        		result = resultSet.getInt("age");
            }
        	
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        return result;
    }


}
