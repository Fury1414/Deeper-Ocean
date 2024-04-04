package net.mcreator.deeperocean.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class ImplodedcodeProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if ((world.getBlockState(BlockPos.containing(x,y,z))).getBlock() == Blocks.WATER||(world.getBlockState(BlockPos.containing(x,y,z))).getBlock() == Blocks.WATER) {if (==y-15) {entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("deeper_ocean:imploded")))), 1);}}
}
}
