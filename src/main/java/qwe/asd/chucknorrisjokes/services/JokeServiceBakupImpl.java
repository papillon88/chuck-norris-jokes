package qwe.asd.chucknorrisjokes.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"dummy"})
public class JokeServiceBakupImpl implements JokeService{

    @Override
    public String getRandomJoke() {
        return "dummy method call";
    }
}
