/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Racha
 */
public interface ReporteService {
    public ResponseEntity<Resource>
            generaReporte(String reporte, //El nombre del archivo de jasper que esta dentro del folder de reportes
                    Map<String, Object> parametros, //optiene los parámetros del reporte
                    String tipo) throws IOException;  // El tipo de reporte que vamos a descargaren la applicación csv, pdf, excell o solo la visualizacion del reporte.
}
