package steveplayzz.soulify.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import steveplayzz.soulify.core.Soulify;

@Mod.EventBusSubscriber(modid = Soulify.MOD_ID, bus = Bus.MOD)
public class SoulifyItems {
	public static final ItemSubRegistryHelper HELPER = Soulify.REGISTRY_HELPER.getItemSubHelper();
	
}