package it.epicode.BE_W5D1.tavoli;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
	private int numeroTavolo;
	private int numeroMaxCoperti;
	private StatoTavolo statoTavolo;
}
