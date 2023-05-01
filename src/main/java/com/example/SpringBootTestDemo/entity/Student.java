package com.example.SpringBootTestDemo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity

public class Student {
    @Id
    @Column(name="ID")
    private Integer id;
    @Column(name="NAME")
    @NotBlank(message="The column name should not me found")
    private String name;
    @Column(name="ADDRESS")

    private  String address;
    @Column(name="ROLLNO")

    private  String rollNo;

}
