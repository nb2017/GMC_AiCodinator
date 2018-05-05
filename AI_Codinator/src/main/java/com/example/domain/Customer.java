package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "custom")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    // パスワード項追加
    private String passWord;
}