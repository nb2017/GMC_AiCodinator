package com.example.repository;

import com.example.domain.SpeechData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SpeechDataRepository extends JpaRepository<SpeechData, Integer> {
    // パスワード項追加に伴う変更 20180429
    @Query("SELECT x FROM SpeechData x")
    List<SpeechData> findAllOrderByName();

    // パスワード項追加に伴う変更 20180429
    @Query("SELECT x FROM SpeechData x")
    Page<SpeechData> findAllOrderByName(Pageable pageable);
}

