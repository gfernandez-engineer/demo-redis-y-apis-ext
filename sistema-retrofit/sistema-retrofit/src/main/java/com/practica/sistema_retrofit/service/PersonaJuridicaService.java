package com.practica.sistema_retrofit.service.impl;

import com.practica.sistema_retrofit.response.ResponseSunat;

public interface PersonaJuridicaService {
    ResponseSunat getInfoSunat(String dni);
}
