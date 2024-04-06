package chrisferdev.farmaciafx;

import chrisferdev.farmaciafx.views.SistemasFarmaciaFx;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmaciaFxApplication {

	public static void main(String[] args) {
		//SpringApplication.run(FarmaciaFxApplication.class, args);
		Application.launch(SistemasFarmaciaFx.class, args);
	}

}
