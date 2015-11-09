package info.beerstorm.drinks;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Coffee extends CustomDrink {
	public Coffee(){
		tabEffect = new PotionEffect[]{new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 1, true, true),
				new PotionEffect(PotionEffectType.SPEED, 1200, 1, false, true)};
		drinkName = "Coffee";
	}
}
