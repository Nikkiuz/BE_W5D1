package it.epicode.BE_W5D1.bevande;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bevanda {

	private String nomeBevanda;
	private double prezzo;
	private int calorie;
}
