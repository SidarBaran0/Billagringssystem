package com.bilinfo.demo.service;

import com.bilinfo.demo.model.Bil;
import com.bilinfo.demo.repository.BilRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BilService {

    private final BilRepository bilRepository;

    public BilService(BilRepository bilRepository) {
        this.bilRepository = bilRepository;
    }

    public List<Bil> getAlleBiler() {
        return bilRepository.findAll();
    }

    public Bil leggTilBil(Bil bil) {
        return bilRepository.save(bil);
    }
    public List<Bil> finnBilerEtterMerke(String merke) {
        return bilRepository.findByMerke(merke);
    }


    public Bil oppdaterBil(Long id, Bil bil) {
        Bil eksisterendeBil = bilRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Bil med ID " + id + " finnes ikke"));
        eksisterendeBil.setMerke(bil.getMerke());
        eksisterendeBil.setModell(bil.getModell());
        eksisterendeBil.setÅrsmodell(bil.getÅrsmodell());
        eksisterendeBil.setKilometerstand(bil.getKilometerstand());
        return bilRepository.save(eksisterendeBil);
    }

    public void slettBil(Long id) {
        bilRepository.deleteById(id);
    }
}

// http://localhost:8080/api/biler
// http://localhost:8080/swagger-ui/index.html