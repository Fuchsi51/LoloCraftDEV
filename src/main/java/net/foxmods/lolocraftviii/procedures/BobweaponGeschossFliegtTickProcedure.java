package net.foxmods.lolocraftviii.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.foxmods.lolocraftviii.LolocraftMod;

import java.util.Map;

public class BobweaponGeschossFliegtTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LolocraftMod.LOGGER.warn("Failed to load dependency entity for procedure BobweaponGeschossFliegtTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.ANVIL, (float) 1);
	}
}
