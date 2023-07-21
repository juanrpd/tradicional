package com.tradicional.tradicional.consultarvigencia.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DataHeaderResponseTypeDto {

    @JsonProperty("codRespuesta")
    private Integer responseCode;

    @JsonProperty("errores")
    private List<BusinessErrorTypeDto> errors;
}
