package it.epicode.BE_W5D1.bevande;


import it.epicode.BE_W5D1.menu.ElementoMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bevanda implements ElementoMenu {

	private String nomeBevanda;
	private double prezzo;
	private int calorie;

	@Override
	public String getNome() {
		return nomeBevanda;
	}
}
