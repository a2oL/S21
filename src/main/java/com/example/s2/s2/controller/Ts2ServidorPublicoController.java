package com.example.s2.s2.controller;

import java.util.List;

import javax.annotation.Resource;

import com.example.s2.s2.models.Ts2ServidorPublico;
import com.example.s2.s2.repositories.Ts2ServidorPublicoDAOREP;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/Ts2ServidorPublico")
public class Ts2ServidorPublicoController {
    @Resource 
    Ts2ServidorPublicoDAOREP ts2ServidorPublicoDAOREP;
    
    @GetMapping(value = "/datos")
    public List<Ts2ServidorPublico> getTs2ServidorPublico() {
        return ts2ServidorPublicoDAOREP.findAll();
    }

    @GetMapping(value = "/datosh")
    public ResponseEntity<List<Ts2ServidorPublico>> getTs2ServidorPublicoh() {
        return ts2ServidorPublicoDAOREP.findAllServidor();
    }
}