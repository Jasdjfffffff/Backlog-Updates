
package net.mcreator.minecraftbacklogupdatesfix.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.minecraftbacklogupdatesfix.entity.OstrichEntity;

public class OstrichRenderer extends HumanoidMobRenderer<OstrichEntity, HumanoidModel<OstrichEntity>> {
	public OstrichRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(OstrichEntity entity) {
		return new ResourceLocation("minecraft_backlog_updates_fix:textures/entities/ostrich.png");
	}
}
