package com.api.restaws.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ExceptionResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private LocalDate timestamp;
    private String message;
    private String details;
}
