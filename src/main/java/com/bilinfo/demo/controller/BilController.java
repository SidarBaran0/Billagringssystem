package com.bilinfo.demo.controller;
import org.springframework.web.bind.annotation.*;
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
@RequestMapping("/api/biler")
public class BilController {
    private final BilService bilService;

    public BilController(BilService bilService) {
        this.bilService = bilService;
    }

    @GetMapping
    public ResponseEntity<List<Bil>> getAlleBiler() {
        return new ResponseEntity<>(bilService.getAlleBiler(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Bil> leggTilBil(@RequestBody Bil bil) {
        return new ResponseEntity<>(bilService.leggTilBil(bil), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bil> oppdaterBil(@PathVariable Long id, @RequestBody Bil bil) {
        return new ResponseEntity<>(bilService.oppdaterBil(id, bil), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> slettBil(@PathVariable Long id) {
        bilService.slettBil(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
