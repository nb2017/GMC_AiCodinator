package com.example.server;
import org.springframework.data.jpa.repository.JpaRepository;
 
 
public interface SampleDao extends JpaRepository <VoiceStringData, Integer> {
 
}