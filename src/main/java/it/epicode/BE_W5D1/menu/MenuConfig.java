package it.epicode.BE_W5D1.menu;

import it.epicode.BE_W5D1.bevande.Bevanda;
import it.epicode.BE_W5D1.pizze.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {
	@Autowired
	private Bevanda aranciata;
	@Autowired
	private Bevanda coca_cola;

	@Autowired
	private Pizza margherita;
	@Autowired
	private Pizza marinara;

	@Bean
	public Menu creaMenu() {
		Menu m = new Menu();
		m.setNomeMenu("Menu Pranzo");
		m.getBevande().add((Bevanda) List.of(aranciata, coca_cola));
		m.getPizze().add((Pizza) List.of(margherita, marinara));
		return m;
	}
}
