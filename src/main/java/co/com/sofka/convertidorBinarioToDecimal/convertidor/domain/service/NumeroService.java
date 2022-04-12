package co.com.sofka.convertidorDecimalToBinario.convertidor.domain.service;

import co.com.sofka.convertidorDecimalToBinario.convertidor.domain.model.Numero;
import org.springframework.stereotype.Service;

@Service
public class NumeroService {
    public Long convertirBinarioToDecimal(String numero){
        return Long.parseLong(numero, 2);
    }
}
