
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.midnightweapons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.midnightweapons.client.model.Modelangel_armor;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MidnightWeaponsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelangel_armor.LAYER_LOCATION, Modelangel_armor::createBodyLayer);
	}
}
