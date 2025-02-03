package it.epicode.BE_W5D1.menu;

import it.epicode.BE_W5D1.bevande.Bevanda;
import it.epicode.BE_W5D1.pizze.Pizza;
import it.epicode.BE_W5D1.topping.Topping;
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
	@Autowired
	private Pizza funghiSalsiccia;
	@Autowired
	private Pizza capricciosa;

	@Autowired
	private Topping abbondanteMozzarella;
	@Autowired
	private Topping salame;

	@Bean
	public Menu creaMenu() {
		Menu m = new Menu();
		m.setNomeMenu("Menu Pranzo");
		m.getBevande().add((Bevanda) List.of(aranciata, coca_cola));
		m.getPizze().add((Pizza) List.of(margherita, marinara, funghiSalsiccia, capricciosa));
		m.setToppings(List.of(abbondanteMozzarella, salame));
		return m;
	}
}
