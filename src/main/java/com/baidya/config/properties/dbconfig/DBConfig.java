package com.baidya.config.properties.dbconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Getter
@Setter
@Component
public class DBConfig {

    @Autowired
    DataSource dataSource;

    public void testConnection()  {
        try{
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from member_policy.plan_details");
            while(resultSet.next()){
                System.out.printf("Plan ID: %s, Plan Name: %s, Plan Value: %s, Tenure: %s", resultSet.getString("plan_id"), resultSet.getString("plan_name"),
                        resultSet.getInt("plan_value"), resultSet.getInt("tenure"));
            }
        } catch (SQLException exception){
            exception.printStackTrace();
        }


    }




}
