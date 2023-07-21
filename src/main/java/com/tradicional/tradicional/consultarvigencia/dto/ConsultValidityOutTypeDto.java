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
public class ConsultValidityOutTypeDto {

    private static final long serialVersionUID = 1L;

    @JsonProperty("vigente")
    private Boolean validity;
}
