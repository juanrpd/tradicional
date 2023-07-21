package com.tradicional.tradicional.consultarvigencia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ConsultarVigenciaResponse {

    @JsonProperty("dataHeader")
    protected DataHeaderResponseTypeDto dataHeader;

    @JsonProperty("data")
    protected ConsultValidityOutTypeDto data;
}
