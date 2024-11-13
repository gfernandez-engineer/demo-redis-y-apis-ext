package com.practica.sistema_openfeign.controller;

import com.practica.sistema_openfeign.aggregates.response.ResponseSunat;
import com.practica.sistema_openfeign.sunatService.InfoSunatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/v1/openFeign")
@RequiredArgsConstructor
public class InfoSunatController {
    private final InfoSunatService infoSunatService;

    @GetMapping("/infoSunat")
    public ResponseEntity<ResponseSunat> getInfoSunat(
            @RequestParam("ruc") String ruc) throws IOException {
        return new ResponseEntity<>(infoSunatService.getInfoSunat(ruc), HttpStatus.OK);
    }
}

