package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// ----------------------------------------------------
// ログインページ用のユーザ情報
// 20180610 
// ----------------------------------------------------
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UserTbl")
public class User{
    @Id
    @GeneratedValue
    private Integer id;
    private Integer type;
    private String userId;
    private String userPassword;
}