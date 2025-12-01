package com.educalink.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class EventoController {

    // Clase interna para definir la estructura de los datos
    // (Esto es lo que recibirá tu Android)
    static class Evento {
        public int id;
        public String title;
        public String body;

        public Evento(int id, String title, String body) {
            this.id = id;
            this.title = title;
            this.body = body;
        }
    }

    // --- EL MICROSERVICIO ---
    // Cuando Android llame a /eventos, responderemos esto:
    @GetMapping("/eventos")
    public List<Evento> obtenerEventos() {
        return Arrays.asList(
                new Evento(1, "Suspensión de Clases", "Debido a mantención eléctrica, se suspenden las clases este viernes en la sede."),
                new Evento(2, "Feria Laboral 2024", "Las empresas más grandes de TI estarán en el patio central. ¡Trae tu CV!"),
                new Evento(3, "Charla: IA en el Futuro", "Expositor invitado de Google presentará sobre el futuro de la IA."),
                new Evento(4, "Taller de Spring Boot", "Reforzamiento para la evaluación parcial este sábado a las 10:00 AM.")
        );
    }
}