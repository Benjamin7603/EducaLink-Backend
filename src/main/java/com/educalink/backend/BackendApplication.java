package com.educalink.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import java.io.IOException;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	// ESTA ES LA FUNCIÓN MÁGICA
	// Se ejecuta apenas termina de cargar el servidor
	@EventListener(ApplicationReadyEvent.class)
	public void abrirNavegadorAutomaticamente() {
		System.out.println("🚀 Servidor listo. Abriendo página web...");
		try {
			// Comando para Windows que abre la URL predeterminada
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://localhost:8080");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}