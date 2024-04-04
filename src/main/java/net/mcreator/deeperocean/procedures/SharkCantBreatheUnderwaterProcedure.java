package net.mcreator.deeperocean.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import net.mcreator.deeperocean.DeeperOceanMod;

public class SharkCantBreatheUnderwaterProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isInWater()) {
			DeeperOceanMod.queueServerWork(100, () -> {
				if (!entity.isInWater()) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DROWN)), 1);
				}
			});
		}
	}
}
