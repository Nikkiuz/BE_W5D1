package it.epicode.BE_W5D1.pizze;


import it.epicode.BE_W5D1.menu.ElementoMenu;
import it.epicode.BE_W5D1.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements ElementoMenu {

	private String nomePizza;
	private int calorie;
	private double prezzo;
	List<Topping> toppings = new ArrayList<>();

	@Override
	public String getNome() {
		return nomePizza;
	}
}
