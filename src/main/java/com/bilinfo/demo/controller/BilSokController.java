package com.bilinfo.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.List;
import com.bilinfo.demo.model.Bil;
import com.bilinfo.demo.service.BilService;


@RestController
@RequestMapping("/api/biler/sok")
public class BilSokController {
    private final BilService bilService;

    public BilSokController(BilService bilService) {
        this.bilService = bilService;
    }

    @GetMapping("/merke/{merke}")
    public ResponseEntity<List<Bil>> finnBilerEtterMerke(@PathVariable String merke) {
        List<Bil> biler = bilService.finnBilerEtterMerke(merke);
        return new ResponseEntity<>(biler, HttpStatus.OK);
    }
}
