package com.educalink.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class SedeController {

    static class Sede {
        public String nombre;
        public String direccion;
        public double latitud;
        public double longitud;

        public Sede(String nombre, String direccion, double lat, double lon) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.latitud = lat;
            this.longitud = lon;
        }
    }

    @GetMapping("/sedes")
    public List<Sede> obtenerSedes() {
        return Arrays.asList(
                // Coordenadas reales de Duoc UC Puerto Montt
                new Sede("Duoc UC Puerto Montt", "Egaña 651, Puerto Montt", -41.472561, -72.942363),
                // Sede Santiago de relleno para comparar
                new Sede("Casa Central Santiago", "Eliodoro Yañez 1595", -33.444214, -70.618641)
        );
    }
}