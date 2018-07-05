package com.example.server;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// ----------------------------------------------------
// VoiceStringData Class NonArgsConstructorClass
// ----------------------------------------------------
@Entity
@Table(name = "voice_str_Tbl")
public class VoiceStringData {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="voicedata")
    private String voiceString;
}