package com.tradicional.tradicional.consultarvigencia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class BusinessErrorTypeDto {

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("descripcion")
    private String descripcion;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("msgErrorOrcl")
    private String msgErrorOrcl;

    @JsonProperty("msgErrorOrcl1")
    private String msgErrorOrcl1;
}
