package info.beerstorm.main;

import org.bukkit.Material;
import org.bukkit.inventory.ShapelessRecipe;

import info.beerstorm.drinks.*;

//FUCK LA POLICE
@SuppressWarnings("deprecation")
public class Recipes {
	public static ShapelessRecipe beerRecipe(){
		ShapelessRecipe beerRecipe = new ShapelessRecipe(new Beer().getItem());
		beerRecipe.addIngredient(Material.POTION, 0).addIngredient(Material.WHEAT);
		return beerRecipe;
	}
	public static ShapelessRecipe rhumRecipe(){
		ShapelessRecipe rhumRecipe = new ShapelessRecipe(new Rhum().getItem());
		rhumRecipe.addIngredient(Material.POTION, 0).addIngredient(Material.SUGAR);
		return rhumRecipe;
	}
	public static ShapelessRecipe vodkaRecipe(){
		ShapelessRecipe vodkaRecipe = new ShapelessRecipe(new Vodka().getItem());
		vodkaRecipe.addIngredient(Material.POTION, 0).addIngredient(Material.POTATO_ITEM);
		return vodkaRecipe;
	}
	public static ShapelessRecipe whiskyRecipe(){
		ShapelessRecipe whiskyRecipe = new ShapelessRecipe(new Whisky().getItem());
		whiskyRecipe.addIngredient(Material.POTION, 0).addIngredient(Material.SEEDS);
		return whiskyRecipe;
	}
	public static ShapelessRecipe tequilaRecipe(){
		ShapelessRecipe tequilaRecipe = new ShapelessRecipe(new Tequila().getItem());
		tequilaRecipe.addIngredient(Material.POTION, 0).addIngredient(Material.CACTUS);
		return tequilaRecipe;
	}
	public static ShapelessRecipe coffeeRecipe(){
		ShapelessRecipe coffeeRecipe = new ShapelessRecipe(new Coffee().getItem());
		coffeeRecipe.addIngredient(Material.POTION, 0).addIngredient(Material.INK_SACK, 3);
		return coffeeRecipe;
	}
	public static ShapelessRecipe notchCiderRecipe(){
		ShapelessRecipe notchCiderRecipe = new ShapelessRecipe(new NotchCider().getItem());
		notchCiderRecipe.addIngredient(Material.POTION, 0).addIngredient(Material.GOLDEN_APPLE, 1);
		return notchCiderRecipe;
	}
}
