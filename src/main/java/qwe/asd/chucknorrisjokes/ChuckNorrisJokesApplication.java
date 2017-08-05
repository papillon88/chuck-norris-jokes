package qwe.asd.chucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import qwe.asd.chucknorrisjokes.repositories.FakeDataSource;

@SpringBootApplication
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ChuckNorrisJokesApplication.class, args);
		FakeDataSource fakeDataSource =
				(FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
	}
}
