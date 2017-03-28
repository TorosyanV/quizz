package info.fonis.web;

import info.fonis.data.entity.QuizzEntity;
import info.fonis.service.QuizzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by vazgent on 3/28/2017.
 */
@Controller
public class QuizzController {


    @Autowired
     private QuizzService quizzService;

    @GetMapping("/quizz/{id}")
    public String getQuizz(@PathVariable long id, ModelMap modelMap){
        QuizzEntity quizz = quizzService.getById(id);
        modelMap.addAttribute("quizz",quizz);

        return "quizz";
    }
}
