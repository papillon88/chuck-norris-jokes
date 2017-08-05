package qwe.asd.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import qwe.asd.chucknorrisjokes.repositories.FakeDataSource;
import qwe.asd.chucknorrisjokes.repositories.FakeJMSBroker;

@SpringBootApplication
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ChuckNorrisJokesApplication.class, args);
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		FakeJMSBroker fakeJMSBroker = ctx.getBean(FakeJMSBroker.class);
		System.out.println(fakeJMSBroker.getJmsUsername());

	}
}
