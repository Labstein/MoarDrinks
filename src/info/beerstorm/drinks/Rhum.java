package info.beerstorm.drinks;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Rhum extends CustomDrink {
	public Rhum(){
		tabEffect = new PotionEffect[]{new PotionEffect(PotionEffectType.CONFUSION, 600, 1, false, true),
				new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1800, 1, true, true)};
		drinkName = "Rhum";
	}
}
