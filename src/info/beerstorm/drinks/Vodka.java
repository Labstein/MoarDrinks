package info.beerstorm.drinks;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Vodka extends CustomDrink {
	public Vodka(){
		tabEffect = new PotionEffect[]{new PotionEffect(PotionEffectType.CONFUSION, 600, 1, false, true),
				new PotionEffect(PotionEffectType.ABSORPTION, 1800, 0, true, true),
				new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1800, 0, true, true)};
		drinkName = "Vodka";
	}
}
