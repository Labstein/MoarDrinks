package info.beerstorm.drinks;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Beer extends CustomDrink {
	
	public Beer(){
		tabEffect = new PotionEffect[]{new PotionEffect(PotionEffectType.SATURATION, 1, 3, true, true),
				new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1800, 0, true, true),
				new PotionEffect(PotionEffectType.SLOW, 600, 0, false, true)};
		drinkName = "Beer";
	}
}
