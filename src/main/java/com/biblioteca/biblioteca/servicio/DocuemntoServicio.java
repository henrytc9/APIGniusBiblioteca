package com.biblioteca.biblioteca.servicio;

import com.biblioteca.biblioteca.modelo.Documento;
import com.biblioteca.biblioteca.repositorio.DocumentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocuemntoServicio {
    @Autowired
    private DocumentoRepositorio documentoRepositorio;

    public List<Documento> getTodoDocumento(){
        return documentoRepositorio.findAll();
    }
}
