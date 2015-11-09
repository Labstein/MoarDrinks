package info.beerstorm.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getServer().addRecipe(Recipes.beerRecipe());
		getServer().addRecipe(Recipes.rhumRecipe());
		getServer().addRecipe(Recipes.vodkaRecipe());
		getServer().addRecipe(Recipes.whiskyRecipe());
		getServer().addRecipe(Recipes.tequilaRecipe());
		getServer().addRecipe(Recipes.coffeeRecipe());
		getServer().addRecipe(Recipes.notchCiderRecipe());
	}
	
	@Override
	public void onDisable(){
		
	}
	
}
