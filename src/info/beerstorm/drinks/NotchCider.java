package info.beerstorm.drinks;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NotchCider extends CustomDrink {
	public NotchCider(){
		tabEffect = new PotionEffect[]{new PotionEffect(PotionEffectType.SATURATION, 1, 3, false, true),
				new PotionEffect(PotionEffectType.REGENERATION, 600, 4, false, true),
				new PotionEffect(PotionEffectType.ABSORPTION, 2400, 0, false, true),
				new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 6000, 0, false, true),
				new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 6000, 0, false, true)};
		//TODO: afficher le nom en violet
		drinkName = "Notch cider";
	}
}
