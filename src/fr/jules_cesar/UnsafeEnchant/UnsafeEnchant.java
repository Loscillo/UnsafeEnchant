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
			int durabilite = 100;
			if(arguments.length == 2){
				durabilite = Integer.parseInt(arguments[1]);
				if(durabilite > 100) durabilite = 100;
			}
			if(Vault.perms.has(joueur.getWorld(), joueur.getName(), "UnsafeEnchant.use")){
				if(arguments.length > 0){
						if(arguments[0].equalsIgnoreCase("tout")) donnerTout(joueur, durabilite);
						
						else if(arguments[0].equalsIgnoreCase("epee")) donnerEpee(joueur, durabilite);
					
						else if(arguments[0].equalsIgnoreCase("hache")) donnerHache(joueur, durabilite);
					
						else if(arguments[0].equalsIgnoreCase("casque")) donnerCasque(joueur, durabilite);
					
						else if(arguments[0].equalsIgnoreCase("plastron")) donnerPlastron(joueur, durabilite);
					
						else if(arguments[0].equalsIgnoreCase("pantalon")) donnerPantalon(joueur, durabilite);
					
						else if(arguments[0].equalsIgnoreCase("botte")) donnerBotte(joueur, durabilite);
						
						else if(arguments[0].equalsIgnoreCase("pioche")) donnerPioche(joueur, durabilite);
						
						else if(arguments[0].equalsIgnoreCase("arc")) donnerArc(joueur, durabilite);
						
						else if(arguments[0].equalsIgnoreCase("pelle")) donnerPelle(joueur, durabilite);
				}
			}
 		}
		return true;
	}
	
	private void donnerTout(Player joueur, int durabilite){
		donnerEpee(joueur, durabilite);
		donnerHache(joueur, durabilite);
		donnerCasque(joueur, durabilite);
		donnerPlastron(joueur, durabilite);
		donnerPantalon(joueur, durabilite);
		donnerBotte(joueur, durabilite);
		donnerPioche(joueur, durabilite);
		donnerArc(joueur, durabilite);
		donnerPelle(joueur, durabilite);
	}
	
	private void donnerArc(Player joueur, int durabilite){
		ItemStack arc = new ItemStack(Material.BOW);
		arc.addUnsafeEnchantment(Enchantment.getById(34), 10);
		arc.addUnsafeEnchantment(Enchantment.getById(48), 10);
		arc.addUnsafeEnchantment(Enchantment.getById(49), 10);
		arc.addUnsafeEnchantment(Enchantment.getById(50), 10);
		arc.addUnsafeEnchantment(Enchantment.getById(51), 10);
		joueur.getInventory().addItem(arc);
		joueur.getInventory().addItem(new ItemStack(Material.ARROW, 64));
	}
	
	private void donnerEpee(Player joueur, int durabilite){
		ItemStack epee = new ItemStack(Material.DIAMOND_SWORD);
		epee.addUnsafeEnchantment(Enchantment.getById(16), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(17), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(18), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(19), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(20), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(21), 10);
		epee.addUnsafeEnchantment(Enchantment.getById(34), 10);
		dommage(epee, durabilite);
		joueur.getInventory().addItem(epee);
	}

	private void donnerHache(Player joueur, int durabilite){
		ItemStack hache = new ItemStack(Material.DIAMOND_AXE);
		hache.addUnsafeEnchantment(Enchantment.getById(16), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(17), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(18), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(32), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(34), 10);
		hache.addUnsafeEnchantment(Enchantment.getById(35), 10);
		dommage(hache, durabilite);
		joueur.getInventory().addItem(hache);
	}

	private void donnerCasque(Player joueur, int durabilite){
		ItemStack casque = new ItemStack(Material.DIAMOND_HELMET);
		casque.addUnsafeEnchantment(Enchantment.getById(0), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(1), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(3), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(4), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(5), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(6), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(7), 10);
		casque.addUnsafeEnchantment(Enchantment.getById(34), 10);
		dommage(casque, durabilite);
		joueur.getInventory().addItem(casque);
	}

	private void donnerPlastron(Player joueur, int durabilite){
		ItemStack plastron = new ItemStack(Material.DIAMOND_CHESTPLATE);
		plastron.addUnsafeEnchantment(Enchantment.getById(0), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(1), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(3), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(4), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(7), 10);
		plastron.addUnsafeEnchantment(Enchantment.getById(34), 10);
		dommage(plastron, durabilite);
		joueur.getInventory().addItem(plastron);
	}
	
	private void donnerPantalon(Player joueur, int durabilite){
		ItemStack pantalon = new ItemStack(Material.DIAMOND_LEGGINGS);
		pantalon.addUnsafeEnchantment(Enchantment.getById(0), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(1), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(3), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(4), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(7), 10);
		pantalon.addUnsafeEnchantment(Enchantment.getById(34), 10);
		dommage(pantalon, durabilite);
		joueur.getInventory().addItem(pantalon);
	}
	
	private void donnerBotte(Player joueur, int durabilite){
		ItemStack botte = new ItemStack(Material.DIAMOND_BOOTS);
		botte.addUnsafeEnchantment(Enchantment.getById(0), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(1), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(2), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(3), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(4), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(7), 10);
		botte.addUnsafeEnchantment(Enchantment.getById(34), 10);
		dommage(botte, durabilite);
		joueur.getInventory().addItem(botte);
	}
	
	private void donnerPioche(Player joueur, int durabilite){
		ItemStack pioche = new ItemStack(Material.DIAMOND_PICKAXE);
		pioche.addUnsafeEnchantment(Enchantment.getById(32), 10);
		pioche.addUnsafeEnchantment(Enchantment.getById(34), 10);
		pioche.addUnsafeEnchantment(Enchantment.getById(35), 10);
		dommage(pioche, durabilite);
		joueur.getInventory().addItem(pioche);
	}

	private void donnerPelle(Player joueur, int durabilite){
		ItemStack pelle = new ItemStack(Material.DIAMOND_SPADE);
		pelle.addUnsafeEnchantment(Enchantment.getById(32), 10);
		pelle.addUnsafeEnchantment(Enchantment.getById(34), 10);
		pelle.addUnsafeEnchantment(Enchantment.getById(35), 10);
		dommage(pelle, durabilite);
		joueur.getInventory().addItem(pelle);
	}
	
	private void dommage(ItemStack item, int pourcentage){
		int id = item.getTypeId();
		if(id >= 276 && id <= 279)
			item.setDurability((short)(1562 - (1562*pourcentage/100)));
		else if(id == 310)
			item.setDurability((short)(363 - (363*pourcentage/100)));
		else if(id == 311)
			item.setDurability((short)(528 - (528*pourcentage/100)));
		else if(id == 312)
			item.setDurability((short)(495 - (495*pourcentage/100)));
		else if(id == 313)
			item.setDurability((short)(429 - (429*pourcentage/100)));
	}
}

