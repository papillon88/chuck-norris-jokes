package qwe.asd.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("jokeservice")
//@Primary
@Profile({"real","default"})
public class JokeServiceImpl implements JokeService {

    @Override
    public String getRandomJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
