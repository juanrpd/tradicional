package com.tradicional.tradicional.consultarvigencia.controller;

import com.tradicional.tradicional.consultarvigencia.dto.ConsultValidityOutTypeDto;
import com.tradicional.tradicional.consultarvigencia.dto.ConsultarVigenciaResponse;
import com.tradicional.tradicional.consultarvigencia.dto.DataHeaderResponseTypeDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultarVigenciaController {
    @GetMapping(path = "/api/v1/liquidacion/vigencia", produces = MediaType.APPLICATION_JSON_VALUE)
    public ConsultarVigenciaResponse consultarVigencia(
            @RequestParam(value = "placa", required = true) String licensePlate,
            @RequestParam(value = "tipoDocumento", required = true) String documentType,
            @RequestParam(value = "numeroDocumento", required = true) String documentNumber){
        return ConsultarVigenciaResponse.builder()
                .dataHeader(DataHeaderResponseTypeDto.builder().responseCode(0).build())
                .data(ConsultValidityOutTypeDto.builder().validity(true).build())
                .build();
    }
}
