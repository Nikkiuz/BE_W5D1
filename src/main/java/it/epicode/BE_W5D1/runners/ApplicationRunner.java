package it.epicode.BE_W5D1.runners;

import it.epicode.BE_W5D1.menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
	@Autowired
	private Menu menu;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(menu);
	}
}
