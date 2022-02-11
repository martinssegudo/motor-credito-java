package br.com.motor.apis.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonResponse {
    private String name;
}
