package info.beerstorm.drinks;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Whisky extends CustomDrink {
	public Whisky(){
		tabEffect = new PotionEffect[]{new PotionEffect(PotionEffectType.CONFUSION, 600, 1, false, true),
				new PotionEffect(PotionEffectType.REGENERATION, 200, 0, true, true)};
		drinkName = "Whisky";
	}
}
