package vb.$tradeoenchanting;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	public static Object GLOBAL_8c77f5d0ddf21067f8d6e0c68d5ccd1f;

	@Override
	public void onEnable() {
		instance = this;
		getDataFolder().mkdir();
		getServer().getPluginManager().registerEvents(this, this);
		try {
			org.bukkit.Bukkit.createMerchant(String.valueOf(GLOBAL_8c77f5d0ddf21067f8d6e0c68d5ccd1f));
			PluginMain.GLOBAL_8c77f5d0ddf21067f8d6e0c68d5ccd1f = new org.bukkit.inventory.ShapedRecipe(
					PluginMain.getNamedItemWithLore(((org.bukkit.Material) null), "Shady Trader Wand", new ArrayList(
							Arrays.asList("Found Shady Trader Wand!", "Wonder what it does.", "(R-click AIR)"))));
			((org.bukkit.inventory.ShapedRecipe) (Object) GLOBAL_8c77f5d0ddf21067f8d6e0c68d5ccd1f)
					.shape(((java.lang.String[]) new ArrayList(Arrays.asList("00E", "PS0", "SP0"))
							.toArray(new java.lang.String[]{})));
			((org.bukkit.inventory.ShapedRecipe) (Object) GLOBAL_8c77f5d0ddf21067f8d6e0c68d5ccd1f).setIngredient(
					"E".charAt(0), ((org.bukkit.material.MaterialData) new org.bukkit.inventory.ItemStack(
							((org.bukkit.Material) org.bukkit.Material.EMERALD)).getData()));
			((org.bukkit.inventory.ShapedRecipe) (Object) GLOBAL_8c77f5d0ddf21067f8d6e0c68d5ccd1f).setIngredient(
					"P".charAt(0), ((org.bukkit.material.MaterialData) new org.bukkit.inventory.ItemStack(
							((org.bukkit.Material) org.bukkit.Material.ENDER_PEARL)).getData()));
			((org.bukkit.inventory.ShapedRecipe) (Object) GLOBAL_8c77f5d0ddf21067f8d6e0c68d5ccd1f).setIngredient(
					"S".charAt(0), ((org.bukkit.material.MaterialData) new org.bukkit.inventory.ItemStack(
							((org.bukkit.Material) org.bukkit.Material.STICK)).getData()));
			org.bukkit.Bukkit
					.addRecipe(((org.bukkit.inventory.Recipe) (Object) GLOBAL_8c77f5d0ddf21067f8d6e0c68d5ccd1f));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		if (obj instanceof List) {
			return (List) obj;
		}
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event1(org.bukkit.event.player.PlayerInteractEvent event) throws Exception {
		Object $08026397d0ee85142a444904faf176b2 = null;
		Object $c3780414ebf9d6190af921b3bb0ccc95 = null;
		Object $c39a45b18322b1147cf30d45506e1c2b = null;
		Object $315f91b7b78deef2dbb386dac4fbe5af = null;
		Object $b31fd2783eb244d297b28978cb547e57 = null;
		if (PluginMain.checkEquals(((org.bukkit.inventory.ItemStack) event.getItem()), PluginMain.getNamedItemWithLore(
				((org.bukkit.Material) org.bukkit.Material.STICK), "Shady Trader Wand",
				new ArrayList(Arrays.asList("Found Shady Trader Wand!", "Wonder what it does.", "(R-click AIR)"))))) {
			if (PluginMain.checkEquals(((org.bukkit.event.block.Action) event.getAction()),
					((org.bukkit.event.block.Action) org.bukkit.event.block.Action.RIGHT_CLICK_AIR))) {
				$315f91b7b78deef2dbb386dac4fbe5af = ((org.bukkit.inventory.Merchant) org.bukkit.Bukkit
						.createMerchant("Shady Trader"));
				$08026397d0ee85142a444904faf176b2 = new org.bukkit.inventory.MerchantRecipe(
						new org.bukkit.inventory.ItemStack(
								((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE), ((int) 8d)),
						((int) 4d));
				$c3780414ebf9d6190af921b3bb0ccc95 = new org.bukkit.inventory.MerchantRecipe(
						new org.bukkit.inventory.ItemStack(
								((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE), ((int) 16d)),
						((int) 4d));
				$c39a45b18322b1147cf30d45506e1c2b = new org.bukkit.inventory.MerchantRecipe(
						new org.bukkit.inventory.ItemStack(
								((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE), ((int) 32d)),
						((int) 4d));
				$b31fd2783eb244d297b28978cb547e57 = new org.bukkit.inventory.MerchantRecipe(
						new org.bukkit.inventory.ItemStack(
								((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE), ((int) 64d)),
						((int) 4d));
				((org.bukkit.inventory.MerchantRecipe) (Object) $08026397d0ee85142a444904faf176b2).addIngredient(
						new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.GLASS_BOTTLE),
								((int) 8d)));
				((org.bukkit.inventory.MerchantRecipe) (Object) $08026397d0ee85142a444904faf176b2).addIngredient(
						new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.EMERALD),
								((int) 4d)));
				((org.bukkit.inventory.MerchantRecipe) (Object) $c3780414ebf9d6190af921b3bb0ccc95).addIngredient(
						new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.GLASS_BOTTLE),
								((int) 16d)));
				((org.bukkit.inventory.MerchantRecipe) (Object) $c3780414ebf9d6190af921b3bb0ccc95).addIngredient(
						new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.EMERALD),
								((int) 13d)));
				((org.bukkit.inventory.MerchantRecipe) (Object) $c39a45b18322b1147cf30d45506e1c2b).addIngredient(
						new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.GLASS_BOTTLE),
								((int) 32d)));
				((org.bukkit.inventory.MerchantRecipe) (Object) $c39a45b18322b1147cf30d45506e1c2b).addIngredient(
						new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.EMERALD_BLOCK),
								((int) 2d)));
				((org.bukkit.inventory.MerchantRecipe) (Object) $b31fd2783eb244d297b28978cb547e57).addIngredient(
						new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.GLASS_BOTTLE),
								((int) 64d)));
				((org.bukkit.inventory.MerchantRecipe) (Object) $b31fd2783eb244d297b28978cb547e57).addIngredient(
						new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.EMERALD_ORE),
								((int) 3d)));
				((org.bukkit.inventory.Merchant) (Object) $315f91b7b78deef2dbb386dac4fbe5af).setRecipes(new ArrayList(
						Arrays.asList($08026397d0ee85142a444904faf176b2, $c3780414ebf9d6190af921b3bb0ccc95,
								$c39a45b18322b1147cf30d45506e1c2b, $b31fd2783eb244d297b28978cb547e57)));
				((org.bukkit.entity.HumanEntity) (Object) ((org.bukkit.entity.Player) event.getPlayer())).openMerchant(
						((org.bukkit.inventory.Merchant) (Object) $315f91b7b78deef2dbb386dac4fbe5af), true);
			}
		}
	}

	public static org.bukkit.inventory.ItemStack getNamedItemWithLore(Material material, String name,
			List<String> lore) {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(material);
		org.bukkit.inventory.meta.ItemMeta itemMeta = item.getItemMeta();
		if (itemMeta != null) {
			itemMeta.setDisplayName(name);
			itemMeta.setLore(lore);
			item.setItemMeta(itemMeta);
		}
		return item;
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
