package com.example.s2.s2.interfaces;

import java.util.List;

import com.example.s2.s2.models.Ts2ServidorPublico;

import org.springframework.http.ResponseEntity;

public interface Ts2ServidorPublicoDAO {
    List<Ts2ServidorPublico> findAll();
    public ResponseEntity<List<Ts2ServidorPublico>> findAllServidor();
}