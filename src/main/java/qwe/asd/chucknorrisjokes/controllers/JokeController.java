package qwe.asd.chucknorrisjokes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import qwe.asd.chucknorrisjokes.services.JokeService;

@Controller
public class JokeController {

    @Autowired
    //@Qualifier("jokeServiceBakupImpl")
    private JokeService jokeService;

    @RequestMapping(name = "/" , method = RequestMethod.GET)
    public String getRandomJoke(Model model){
        model.addAttribute("joke",jokeService.getRandomJoke());
        return "chucknorris";
    }

    public JokeService getJokeService() {
        return jokeService;
    }

    public void setJokeService(JokeService jokeService) {
        this.jokeService = jokeService;
    }
}
