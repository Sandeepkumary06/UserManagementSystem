package com.example.UserManagementSystem.configuration;

import com.example.UserManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanConfiguration {

    public LocalDate getDate(){
        LocalDate myObj = LocalDate.now(); // Create a date object
        return myObj;
    }
    public LocalTime getTime(){
        LocalTime myObj = LocalTime.now();
        return myObj;
    }
    LocalDate date = getDate();
    LocalTime time = getTime();
    @Bean
    public List<User> getIntialUserList() {
        User Intialuser= new User("1","SandeepKumar","2000-11-06","yekollusandeepkumar@gmail.com","9940556420",date,time);
        List<User>UserList = new ArrayList<>();
        UserList.add(Intialuser);
        return UserList;
    }
}
