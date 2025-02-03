package it.epicode.BE_W5D1.menu;

import it.epicode.BE_W5D1.bevande.Bevanda;
import it.epicode.BE_W5D1.pizze.Pizza;
import it.epicode.BE_W5D1.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
	private String nomeMenu;
	List<Pizza> pizze;
	List<Bevanda> bevande;
	List<Topping> toppings;
}
