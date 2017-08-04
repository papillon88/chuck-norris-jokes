package qwe.asd.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("jokeservice")
@Primary
@Profile({"real","default"})
public class JokeServiceImpl implements JokeService {

    @Autowired
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
