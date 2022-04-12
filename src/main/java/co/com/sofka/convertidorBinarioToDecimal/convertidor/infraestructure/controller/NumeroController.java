package co.com.sofka.convertidorBinarioToDecimal.convertidor.infraestructure.controller;

import co.com.sofka.convertidorBinarioToDecimal.convertidor.domain.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convertir")
@CrossOrigin("*")
public class NumeroController {
    @Autowired
    private NumeroService service;

    @GetMapping("/{numero}")
    public ResponseEntity<Long> decimalToBinario(@PathVariable("numero") String binario) {
        return new ResponseEntity<Long>(this.service.convertirBinarioToDecimal(binario), HttpStatus.OK);
    }

}
