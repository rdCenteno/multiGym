package multigym.gym.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {

    private static Logger log = LogManager.getLogger(RootController.class);

    @GetMapping("/")
    public String index(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        log.info("The user has access to /");
        log.info("The user name is: ", name);
        return "hello";
    }

    @GetMapping("/hello")
    public String hola(Model modelo, @RequestParam String name) {
        log.info("El usuario ha accedido a la ruta de /hello");
        modelo.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/otro")
    public String guessNumber(Model model) {
        log.info("The user has access to /otro, it returns an empty template");
        return "pruebaPlantilla";
    }

    @GetMapping("/listaEstablecimientos")
    public String listaEstablecimientos() {
        log.info("El usuario ha accedido a la ruta de /listaEstablecimientos");
        return "listaEstablecimientos";
    }

    @GetMapping("/listaActividades")
    public String listaActividades() {
        log.info("El usuario ha accedido a la ruta de /listaActividades");
        return "listaActividades";
    }

    @GetMapping("/actividad")
    public String actividad() {
        log.info("El usuario ha accedido a la ruta de /actividad");
        return "actividad";
    }
}
