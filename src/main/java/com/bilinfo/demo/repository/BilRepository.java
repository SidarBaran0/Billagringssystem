package com.bilinfo.demo.repository;

import com.bilinfo.demo.model.Bil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BilRepository extends JpaRepository<Bil, Long> {

    // Metode for å finne biler basert på merke
    List<Bil> findByMerke(String merke);
}
