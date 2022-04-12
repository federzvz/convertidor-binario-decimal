package co.com.sofka.convertidorBinarioToDecimal.convertidor.domain.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroService {
    public Long convertirBinarioToDecimal(String numero){
        return Long.parseLong(numero, 2);
    }
}
