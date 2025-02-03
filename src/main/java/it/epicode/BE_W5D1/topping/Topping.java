package it.epicode.BE_W5D1.topping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Topping {
	private String nomeTopping;
	private int calorie;
	private double prezzo;

}
