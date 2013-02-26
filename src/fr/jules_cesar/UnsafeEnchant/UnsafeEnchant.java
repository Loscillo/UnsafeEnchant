package fr.jules_cesar.UnsafeEnchant;


import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class UnsafeEnchant extends JavaPlugin implements Listener{
	
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);
		
		// Get permission plugin
		Vault.load(this);
		Vault.setupPermissions();
	}

	public void onDisable(){
	}

	public boolean onCommand(CommandSender expediteur, Command commande, String label, String[] arguments){
		if(commande.getName().equalsIgnoreCase("enchantu") && expediteur instanceof Player){
			Player joueur = (Player) expediteur;
			if(Vault.perms.has(joueur.getWorld(), joueur.getName(), "UnsafeEnchant.use")){
				if(arguments.length > 0){
					for(int i = 0; i < arguments.length; i++){
						if(arguments[i].equalsIgnoreCase("tout")) donnerTout(joueur);
						
						else if(arguments[i].equalsIgnoreCase("epee")) donnerEpee(joueur);
					
						else if(arguments[i].equalsIgnoreCase("hache")) donnerHache(joueur);
					
						else if(arguments[i].equalsIgnoreCase("casque")) donnerCasque(joueur);
					
						else if(arguments[i].equalsIgnoreCase("plastron")) donnerPlastron(joueur);
					
						else if(arguments[i].equalsIgnoreCase("pantalon")) donnerPantalon(joueur);
					
						else if(arguments[i].equalsIgnoreCase("botte")) donnerBotte(joueur);
						
						else if(arguments[i].equalsIgnoreCase("pioche")) donnerPioche(joueur);
						
						else if(arguments[i].equalsIgnoreCase("arc")) donnerArc(joueur);
						
						else if(arguments[i].equalsIgnoreCase("pelle")) donnerPelle(joueur);
					}
				}
			}
 		}
		else if(commande.getName().equalsIgnoreCase("damage") && expediteur instanceof Player){
			Player joueur = (Player) expediteur;
			joueur.getItemInHand().setDurability((short) 1400);
		}
		
		return true;
	}
	
	private void donnerTout(Player joueur){
		donnerEpee(joueur);
		donnerHache(joueur);
		donnerCasque(joueur);
		donnerPlastron(joueur);
		donnerPantalon(joueur);
		donnerBotte(joueur);
		donnerPioche(joueur);
		donnerArc(joueur);
		donnerPelle(joueur);
	}
	
	private void donnerArc(Player joueur){
		ItemStack arc = new ItemStack(Material.BOW);
		arc.addUnsafeEnchantment(Enchantment.getById(34), 10);
		arc.addUnsafeEnchantment(Enchantment.getById(48), 10);
		arc.addUnsafeEnchantment(Enchantment.getById(49), 10);
		arc.addUnsafeEnchantment(Enchantment.getById(50), 10);
		arc.addUnsafeEnchantment(Enchantment.getById(51), 10);
		joueur.getInventory().addItem(arc);
		joueur.getInventory().addItem(new ItemStack(Material.ARROW, 64));
	}
	
	private void donnerEpee(Player joueur){
		ItemStack epee = new ItemStack(Material.DIAMOND_SWORD);
		epee.addUnsafeEnchantment(Enchantment.getById(16), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(17), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(18), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(19), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(20), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(21), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(34), 10);
		joueur.getInventory().addItem(epee);
	}

	private void donnerHache(Player joueur){
		ItemStack hache = new ItemStack(Material.DIAMOND_AXE);
		hache.addUnsafeEnchantment(Enchantment.getById(16), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(17), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(18), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(32), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(34), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(35), 10);
		joueur.getInventory().addItem(hache);
	}

	private void donnerCasque(Player joueur){
		ItemStack casque = new ItemStack(Material.DIAMOND_HELMET);
		casque.addUnsafeEnchantment(Enchantment.getById(0), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(1), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(3), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(4), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(5), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(6), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(7), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(34), 10);
		joueur.getInventory().addItem(casque);
	}

	private void donnerPlastron(Player joueur){
		ItemStack plastron = new ItemStack(Material.DIAMOND_CHESTPLATE);
		plastron.addUnsafeEnchantment(Enchantment.getById(0), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(1), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(3), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(4), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(7), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(34), 10);
		joueur.getInventory().addItem(plastron);
	}
	
	private void donnerPantalon(Player joueur){
		ItemStack pantalon = new ItemStack(Material.DIAMOND_LEGGINGS);
		pantalon.addUnsafeEnchantment(Enchantment.getById(0), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(1), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(3), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(4), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(7), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(34), 10);
		joueur.getInventory().addItem(pantalon);
	}
	
	private void donnerBotte(Player joueur){
		ItemStack botte = new ItemStack(Material.DIAMOND_BOOTS);
		botte.addUnsafeEnchantment(Enchantment.getById(0), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(1), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(2), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(3), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(4), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(7), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(34), 10);
		joueur.getInventory().addItem(botte);
	}
	
	private void donnerPioche(Player joueur){
		ItemStack pioche = new ItemStack(Material.DIAMOND_PICKAXE);
		pioche.addUnsafeEnchantment(Enchantment.getById(32), 10);
		pioche.addUnsafeEnchantment(Enchantment.getById(34), 10);
		pioche.addUnsafeEnchantment(Enchantment.getById(35), 10);
		joueur.getInventory().addItem(pioche);
	}

	private void donnerPelle(Player joueur){
		ItemStack pelle = new ItemStack(Material.DIAMOND_SPADE);
		pelle.addUnsafeEnchantment(Enchantment.getById(32), 10);
		pelle.addUnsafeEnchantment(Enchantment.getById(34), 10);
		pelle.addUnsafeEnchantment(Enchantment.getById(35), 10);
		joueur.getInventory().addItem(pelle);
	}
	
}

