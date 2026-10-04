package com.example.practicacasa.controlador;

import com.example.practicacasa.modelo.Luchador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Controller

public class ControladorPrincipal {

    @RequestMapping("/batalla")
    public String lucha(Model model) {
        // Rendimiento: ThreadLocalRandom en lugar de new Random()
        ThreadLocalRandom r = ThreadLocalRandom.current();

        Luchador luchador1 = new Luchador("Ryu", r.nextInt(1, 11), r.nextInt(1, 101));
        Luchador luchador2 = new Luchador("Ken", r.nextInt(1, 11), r.nextInt(1, 101));

        int contadorRondas = 0;
        int maxRondas = 3;

        while (contadorRondas < maxRondas) {
            contadorRondas++;

            // Ataque de Luchador 1
            luchador2.setVida(luchador2.getVida() - luchador1.getAtaque());
            if (luchador2.getVida() <= 0) {
                luchador2.setVida(0); // Evitar vida negativa en la interfaz
                break;
            }

            // Ataque de Luchador 2
            luchador1.setVida(luchador1.getVida() - luchador2.getAtaque());
            if (luchador1.getVida() <= 0) {
                luchador1.setVida(0); // Evitar vida negativa en la interfaz
                break;
            }
        }

        // Determinación del resultado
        String resultado;
        if (luchador1.getVida() > luchador2.getVida()) {
            resultado = "El ganador es: " + luchador1.getNombre();
        } else if (luchador2.getVida() > luchador1.getVida()) {
            resultado = "El ganador es: " + luchador2.getNombre();
        } else {
            resultado = "Empate";
        }

        // Atributos agregados al modelo usando convenciones camelCase
        model.addAttribute("resultado", resultado);
        model.addAttribute("contadorRondas", contadorRondas);
        model.addAttribute("luchador1", luchador1);
        model.addAttribute("luchador2", luchador2);

        return "batalla";
    }

}
