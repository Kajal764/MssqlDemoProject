package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "first")
public class first {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int e_id;

    private String name;

    private int age;


}
