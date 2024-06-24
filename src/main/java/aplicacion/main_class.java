package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"registro.api", "https.registro_uv_mx.contabilidad", "registro.configuracion"})
@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@SpringBootApplication
public class main_class {

    public static void main(String[] args) {
        SpringApplication.run(main_class.class, args);
    }
}
