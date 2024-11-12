package com.registerform.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userregister")
public class User
{
    private String name;
    @Id
    private String username;
    private String email;
    private String phonenumber;
    private String password;
    private String cpassword;
    private String gender;



}
