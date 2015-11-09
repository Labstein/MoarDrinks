package info.beerstorm.drinks;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;

public abstract class CustomDrink {
	
	protected PotionEffect[] tabEffect;
	protected String drinkName;
	protected List<String> drinkLore;
	
	public ItemStack getItem(){
		ItemStack drink = new ItemStack(Material.POTION);
		PotionMeta drinkMeta = (PotionMeta) drink.getItemMeta();
		//ajouter nom, effets, lore
		for(PotionEffect effect : tabEffect){
			drinkMeta.addCustomEffect(effect, true);
		}
		drinkMeta.setDisplayName(drinkName);
		drinkMeta.setLore(drinkLore);
		drink.setItemMeta(drinkMeta);
		return drink;
	}
}
