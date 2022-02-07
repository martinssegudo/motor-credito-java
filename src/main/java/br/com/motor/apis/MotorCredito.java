package br.com.motor.apis;

import br.com.motor.apis.response.PersonResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.http.ResponseEntity;


public interface MotorCredito {
    @ApiOperation(value = "Salva um valor")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna uma mensagem se salvou o valor"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Retornara uma mensagem amigável para o usuária"),
    })
    ResponseEntity<PersonResponse> save(Long id);

}
