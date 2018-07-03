package com.example.server;

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
@Table(name = "voiceStringDataTbl")
public class VoiceStringData {
    @Id
    @GeneratedValue
    private Integer id;
    private String voiceString;
}