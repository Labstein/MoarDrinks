package info.beerstorm.drinks;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Tequila extends CustomDrink {
	public Tequila(){
		tabEffect = new PotionEffect[]{new PotionEffect(PotionEffectType.CONFUSION, 600, 1, false, true),
				new PotionEffect(PotionEffectType.SPEED, 1800, 0, false, true),
				new PotionEffect(PotionEffectType.JUMP, 1800, 1, false, true)};
		drinkName = "Tequila";
	}
}
