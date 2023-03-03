package com.api.restaws.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonPropertyOrder({"first_name", "last_name"})
public class PersonDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @JsonProperty("first_name")
    @NotBlank
    private String firstName;
    @JsonProperty("last_name")
    @NotBlank
//    @JsonIgnore
    private String lastName;
}
