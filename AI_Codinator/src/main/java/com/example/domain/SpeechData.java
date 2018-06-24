package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.sql.rowset.serial.SerialArray;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "speechDataTbl")
public class SpeechData {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer voice;
}