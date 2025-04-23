package one.digitalinnovation.gof;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Bem-vindo à minha aplicação Spring Boot! 🚀 Aqui você vai encontrar um sistema de cadastro de clientes usando padrões de projeto!";
    }
}
