package it.epicode.BE_W5D1.topping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {
	@Bean
	public Topping abbondanteMozzarella() {
		Topping t = new Topping();
		t.setNomeTopping("Abbondante Mozzarella");
		t.setCalorie(100);
		t.setPrezzo(1.5);
		return t;
	}

	@Bean
	public Topping salame() {
		Topping t = new Topping();
		t.setNomeTopping("salame");
		t.setCalorie(150);
		t.setPrezzo(0.90);
		return t;
	}
}
