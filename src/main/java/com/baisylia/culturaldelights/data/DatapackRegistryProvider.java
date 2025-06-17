package com.baisylia.culturaldelights.data;

import com.baisylia.culturaldelights.CulturalDelights;
import com.baisylia.culturaldelights.worldgen.ModBiomeModifiers;
import com.baisylia.culturaldelights.worldgen.ModFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class DatapackRegistryProvider extends DatapackBuiltinEntriesProvider {

   public static final RegistrySetBuilder REGISTRIES = new RegistrySetBuilder()
           .add(Registries.CONFIGURED_FEATURE, ModFeatures.Configured::init)
           .add(Registries.PLACED_FEATURE, ModFeatures.Placed::init)
           .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::init);

   public DatapackRegistryProvider( PackOutput output, CompletableFuture<HolderLookup.Provider> provider ) {

      super(output, provider, REGISTRIES, Set.of("minecraft", CulturalDelights.MOD_ID));
   }
}
