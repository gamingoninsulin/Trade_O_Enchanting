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

	public static org.bukkit.configuration.file.YamlConfiguration PERSISTENT_VARIABLES;

	@Override
	public void onEnable() {
		instance = this;
		getDataFolder().mkdir();
		getServer().getPluginManager().registerEvents(this, this);
		PERSISTENT_VARIABLES = org.bukkit.configuration.file.YamlConfiguration
				.loadConfiguration(new File(getDataFolder(), "data.yml"));
		try {
			try {
				org.bukkit.Bukkit
						.createMerchant(String.valueOf(PluginMain.PERSISTENT_VARIABLES.get("ShadyTraderToken")));
				try {
					try {
						PluginMain.PERSISTENT_VARIABLES.set("ShadyTraderToken", new org.bukkit.inventory.ShapedRecipe(
								((org.bukkit.NamespacedKey) (Object) ((org.bukkit.inventory.ShapedRecipe) ((org.bukkit.inventory.ShapedRecipe) (Object) PluginMain.PERSISTENT_VARIABLES
										.get("ShadyTraderToken")).shape(
												((java.lang.String[]) new ArrayList(Arrays.asList("00E", "PS0", "SP0"))
														.toArray(new java.lang.String[]{}))))),
								PluginMain.getNamedItemWithLore(
										((org.bukkit.Material) org.bukkit.Material.TRIPWIRE_HOOK), "Shady Trader Token",
										new ArrayList(Arrays.asList("Found Shady Trader token!", "Wonder what it does.",
												"(R-click AIR)")))));
						try {
							try {
								PluginMain.PERSISTENT_VARIABLES.set("ShadyTraderToken",
										((org.bukkit.inventory.ShapedRecipe) ((org.bukkit.inventory.ShapedRecipe) (Object) PluginMain.PERSISTENT_VARIABLES
												.get("ShadyTraderToken")).setIngredient("S".charAt(0),
														((org.bukkit.Material) org.bukkit.Material.STICK),
														((int) 1d))));
								try {
									PluginMain.PERSISTENT_VARIABLES.set("ShadyTraderToken",
											((org.bukkit.inventory.ShapedRecipe) ((org.bukkit.inventory.ShapedRecipe) (Object) PluginMain.PERSISTENT_VARIABLES
													.get("ShadyTraderToken")).setIngredient("P".charAt(0),
															((org.bukkit.Material) org.bukkit.Material.ENDER_PEARL),
															((int) 1d))));
									try {
										PluginMain.PERSISTENT_VARIABLES.set("ShadyTraderToken",
												((org.bukkit.inventory.ShapedRecipe) ((org.bukkit.inventory.ShapedRecipe) (Object) PluginMain.PERSISTENT_VARIABLES
														.get("ShadyTraderToken")).setIngredient("E".charAt(0),
																((org.bukkit.Material) org.bukkit.Material.EMERALD),
																((int) 1d))));
										try {
											org.bukkit.Bukkit.addRecipe(
													((org.bukkit.inventory.Recipe) (Object) PluginMain.PERSISTENT_VARIABLES
															.get("ShadyTraderToken")));
										} catch (Exception $kSGPyDYjRTrGwQRz) {
											PluginMain.reportError("kSGPyDYjRTrGwQRz", $kSGPyDYjRTrGwQRz);
										}
									} catch (Exception $jApyd98TqXILTyqd) {
										PluginMain.reportError("jApyd98TqXILTyqd", $jApyd98TqXILTyqd);
									}
								} catch (Exception $DdVFwRqcbnFFIt3L) {
									PluginMain.reportError("DdVFwRqcbnFFIt3L", $DdVFwRqcbnFFIt3L);
								}
							} catch (Exception $yXAwtUNsOWiojTNA) {
								PluginMain.reportError("yXAwtUNsOWiojTNA", $yXAwtUNsOWiojTNA);
							}
						} catch (Exception $gKJWculR3y98cxdm) {
							PluginMain.reportError("gKJWculR3y98cxdm", $gKJWculR3y98cxdm);
						}
					} catch (Exception $VNedRayn7n5nZNKN) {
						PluginMain.reportError("VNedRayn7n5nZNKN", $VNedRayn7n5nZNKN);
					}
				} catch (Exception $yO9TX98IxJruAnC8) {
					PluginMain.reportError("yO9TX98IxJruAnC8", $yO9TX98IxJruAnC8);
				}
			} catch (Exception $XFp9YxP3S5giNL8w) {
				PluginMain.reportError("XFp9YxP3S5giNL8w", $XFp9YxP3S5giNL8w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		try {
			PERSISTENT_VARIABLES.save(new File(getDataFolder(), "data.yml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
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
		Object $207ae509ccefdf7dcad33a707e6091e8 = null;
		Object $1d6e56f47c7f7ffc8a717fc9b81c858a = null;
		Object $a345513d979fe1966c82bffe9d954484 = null;
		Object $c39a45b18322b1147cf30d45506e1c2b = null;
		Object $9648a19dd96ba8c2c863b75bdf804d38 = null;
		Object $b31fd2783eb244d297b28978cb547e57 = null;
		Object $08026397d0ee85142a444904faf176b2 = null;
		Object $c3780414ebf9d6190af921b3bb0ccc95 = null;
		Object $fe2341107bd8b0e6f0c027af715a808a = null;
		Object $86ad1c632d71929e0ac127df682a2da9 = null;
		Object $315f91b7b78deef2dbb386dac4fbe5af = null;
		Object $81919dff8a87ec455494cee5b3f3930d = null;
		Object $987f0b633e2bc71467c507016f4bd3f3 = null;
		Object $90436309c62743dc11448b126436ef65 = null;
		try {
			if (PluginMain.checkEquals(((org.bukkit.event.block.Action) event.getAction()),
					((org.bukkit.event.block.Action) org.bukkit.event.block.Action.LEFT_CLICK_AIR))) {
				try {
					$315f91b7b78deef2dbb386dac4fbe5af = ((org.bukkit.inventory.Merchant) org.bukkit.Bukkit
							.createMerchant("Shady Trader"));
					try {
						try {
							$08026397d0ee85142a444904faf176b2 = new org.bukkit.inventory.MerchantRecipe(
									new org.bukkit.inventory.ItemStack(
											((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE), ((int) 8d)),
									((int) 4d));
							try {
								$c3780414ebf9d6190af921b3bb0ccc95 = new org.bukkit.inventory.MerchantRecipe(
										new org.bukkit.inventory.ItemStack(
												((org.bukkit.Material) (Object) new org.bukkit.inventory.ItemStack(
														((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE),
														((int) 16d)))),
										((int) 4d));
								try {
									$c39a45b18322b1147cf30d45506e1c2b = new org.bukkit.inventory.MerchantRecipe(
											new org.bukkit.inventory.ItemStack(
													((org.bukkit.Material) (Object) new org.bukkit.inventory.ItemStack(
															((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE),
															((int) 32d)))),
											((int) 4d));
									try {
										$b31fd2783eb244d297b28978cb547e57 = new org.bukkit.inventory.MerchantRecipe(
												new org.bukkit.inventory.ItemStack(
														((org.bukkit.Material) (Object) new org.bukkit.inventory.ItemStack(
																((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE),
																((int) 64d)))),
												((int) 4d));
										try {
											try {
												((org.bukkit.inventory.MerchantRecipe) (Object) $1d6e56f47c7f7ffc8a717fc9b81c858a)
														.addIngredient(new org.bukkit.inventory.ItemStack(
																((org.bukkit.Material) org.bukkit.Material.GLASS_BOTTLE),
																((int) 8d)));
												try {
													((org.bukkit.inventory.MerchantRecipe) (Object) $1d6e56f47c7f7ffc8a717fc9b81c858a)
															.addIngredient(new org.bukkit.inventory.ItemStack(
																	((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE),
																	((int) 8d)));
													try {
														((org.bukkit.inventory.MerchantRecipe) (Object) $fe2341107bd8b0e6f0c027af715a808a)
																.addIngredient(new org.bukkit.inventory.ItemStack(
																		((org.bukkit.Material) org.bukkit.Material.GLASS_BOTTLE),
																		((int) 16d)));
														try {
															((org.bukkit.inventory.MerchantRecipe) (Object) $fe2341107bd8b0e6f0c027af715a808a)
																	.addIngredient(new org.bukkit.inventory.ItemStack(
																			((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE),
																			((int) 16d)));
															try {
																((org.bukkit.inventory.MerchantRecipe) (Object) $9648a19dd96ba8c2c863b75bdf804d38)
																		.addIngredient(
																				new org.bukkit.inventory.ItemStack(
																						((org.bukkit.Material) org.bukkit.Material.GLASS_BOTTLE),
																						((int) 32d)));
																try {
																	((org.bukkit.inventory.MerchantRecipe) (Object) $9648a19dd96ba8c2c863b75bdf804d38)
																			.addIngredient(
																					new org.bukkit.inventory.ItemStack(
																							((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE),
																							((int) 32d)));
																	try {
																		((org.bukkit.inventory.MerchantRecipe) (Object) $86ad1c632d71929e0ac127df682a2da9)
																				.addIngredient(
																						new org.bukkit.inventory.ItemStack(
																								((org.bukkit.Material) org.bukkit.Material.GLASS_BOTTLE),
																								((int) 64d)));
																		try {
																			((org.bukkit.inventory.MerchantRecipe) (Object) $86ad1c632d71929e0ac127df682a2da9)
																					.addIngredient(
																							new org.bukkit.inventory.ItemStack(
																									((org.bukkit.Material) org.bukkit.Material.EXPERIENCE_BOTTLE),
																									((int) 64d)));
																			try {
																				try {
																					((org.bukkit.inventory.Merchant) (Object) $207ae509ccefdf7dcad33a707e6091e8)
																							.setRecipes(new ArrayList(
																									Arrays.asList(
																											$81919dff8a87ec455494cee5b3f3930d,
																											$90436309c62743dc11448b126436ef65,
																											$a345513d979fe1966c82bffe9d954484,
																											$987f0b633e2bc71467c507016f4bd3f3)));
																					try {
																						try {
																							((org.bukkit.entity.HumanEntity) (Object) ((org.bukkit.entity.Player) event
																									.getPlayer()))
																											.openMerchant(
																													((org.bukkit.inventory.Merchant) (Object) $315f91b7b78deef2dbb386dac4fbe5af),
																													true);
																							try {
																								try {
																									((org.bukkit.entity.HumanEntity) (Object) ((org.bukkit.entity.Player) event
																											.getPlayer()))
																													.setItemInHand(
																															PluginMain
																																	.getNamedItemWithLore(
																																			((org.bukkit.Material) org.bukkit.Material.TRIPWIRE_HOOK),
																																			"Shady Trader Token",
																																			new ArrayList(
																																					Arrays.asList(
																																							"Found Shady Trader token!",
																																							"Wonder what it does.",
																																							"(L-click AIR)"))));
																								} catch (Exception $rs4sIwp4PfXryvuM) {
																									PluginMain
																											.reportError(
																													"rs4sIwp4PfXryvuM",
																													$rs4sIwp4PfXryvuM);
																								}
																							} catch (Exception $ufxz5n3OxLR6RmfS) {
																								PluginMain.reportError(
																										"ufxz5n3OxLR6RmfS",
																										$ufxz5n3OxLR6RmfS);
																							}
																						} catch (Exception $ZznEU18hfbfJBfM1) {
																							PluginMain.reportError(
																									"ZznEU18hfbfJBfM1",
																									$ZznEU18hfbfJBfM1);
																						}
																					} catch (Exception $LzXC2CKXhRDoVYY3) {
																						PluginMain.reportError(
																								"LzXC2CKXhRDoVYY3",
																								$LzXC2CKXhRDoVYY3);
																					}
																				} catch (Exception $FcQaucbOhxKa75ae) {
																					PluginMain.reportError(
																							"FcQaucbOhxKa75ae",
																							$FcQaucbOhxKa75ae);
																				}
																			} catch (Exception $khpzR4jCjdyvqFSZ) {
																				PluginMain.reportError(
																						"khpzR4jCjdyvqFSZ",
																						$khpzR4jCjdyvqFSZ);
																			}
																		} catch (Exception $aGr2nnEk4WRGrBOD) {
																			PluginMain.reportError("aGr2nnEk4WRGrBOD",
																					$aGr2nnEk4WRGrBOD);
																		}
																	} catch (Exception $ToPkwDQq1a06zOnn) {
																		PluginMain.reportError("ToPkwDQq1a06zOnn",
																				$ToPkwDQq1a06zOnn);
																	}
																} catch (Exception $sWBIDmLps5Z5t22M) {
																	PluginMain.reportError("sWBIDmLps5Z5t22M",
																			$sWBIDmLps5Z5t22M);
																}
															} catch (Exception $vA1pjRz09hbt8x8l) {
																PluginMain.reportError("vA1pjRz09hbt8x8l",
																		$vA1pjRz09hbt8x8l);
															}
														} catch (Exception $kXBWIIiEjS1s26gb) {
															PluginMain.reportError("kXBWIIiEjS1s26gb",
																	$kXBWIIiEjS1s26gb);
														}
													} catch (Exception $7krV41RIvhhM6kKg) {
														PluginMain.reportError("7krV41RIvhhM6kKg", $7krV41RIvhhM6kKg);
													}
												} catch (Exception $SxDrl4I1whradj2i) {
													PluginMain.reportError("SxDrl4I1whradj2i", $SxDrl4I1whradj2i);
												}
											} catch (Exception $aFzv7cxY3MMymVEI) {
												PluginMain.reportError("aFzv7cxY3MMymVEI", $aFzv7cxY3MMymVEI);
											}
										} catch (Exception $gK8ARZgyAdRiQbO2) {
											PluginMain.reportError("gK8ARZgyAdRiQbO2", $gK8ARZgyAdRiQbO2);
										}
									} catch (Exception $UUdNbS8Y4711ui5p) {
										PluginMain.reportError("UUdNbS8Y4711ui5p", $UUdNbS8Y4711ui5p);
									}
								} catch (Exception $pcPlnFvbJd9nagvH) {
									PluginMain.reportError("pcPlnFvbJd9nagvH", $pcPlnFvbJd9nagvH);
								}
							} catch (Exception $AVsEtvkBBjSdSm9C) {
								PluginMain.reportError("AVsEtvkBBjSdSm9C", $AVsEtvkBBjSdSm9C);
							}
						} catch (Exception $DWGcyJoMO9HewiGP) {
							PluginMain.reportError("DWGcyJoMO9HewiGP", $DWGcyJoMO9HewiGP);
						}
					} catch (Exception $5x2cbrXllcdHbsRJ) {
						PluginMain.reportError("5x2cbrXllcdHbsRJ", $5x2cbrXllcdHbsRJ);
					}
				} catch (Exception $F1zwDsdTYamJNaGE) {
					PluginMain.reportError("F1zwDsdTYamJNaGE", $F1zwDsdTYamJNaGE);
				}
			}
		} catch (Exception $ULAOh0x8986nQ9dS) {
			PluginMain.reportError("ULAOh0x8986nQ9dS", $ULAOh0x8986nQ9dS);
		}
	}

	public static void reportError(String id, Exception error) throws Exception {
		Class.forName("com.gmail.visualbukkit.plugin.VisualBukkitPlugin")
				.getDeclaredMethod("reportError", String.class, Exception.class).invoke(null, id, error);
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
