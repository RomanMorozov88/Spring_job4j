package police.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import police.model.Accident;
import police.repository.AccidentHibernate;

import java.util.List;

/**
 * контроллер для главной страницы
 */
@Controller
public class IndexController {

    static Logger LOG = LogManager.getLogger(IndexController.class.getName());

    private final AccidentHibernate repository;

    public IndexController(AccidentHibernate repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String getAccidents(ModelMap modelMap) {

        List<Accident> accidentsList = repository.getAccidents();
        modelMap.addAttribute("accidentsList", accidentsList);

        modelMap.addAttribute("user",
                SecurityContextHolder.getContext().getAuthentication().getPrincipal());

        return "index";
    }

}
