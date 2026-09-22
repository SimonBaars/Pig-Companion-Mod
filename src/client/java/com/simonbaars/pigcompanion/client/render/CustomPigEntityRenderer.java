package com.simonbaars.pigcompanion.client.render;

import com.simonbaars.pigcompanion.PigCompanionMod;
import com.simonbaars.pigcompanion.entity.ArmoredPigEntity;
import com.simonbaars.pigcompanion.entity.CompanionPigEntity;
import com.simonbaars.pigcompanion.entity.SuperPigEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.Identifier;

public class CustomPigEntityRenderer extends MobEntityRenderer<AnimalEntity, PigEntityModel<AnimalEntity>> {
    
    public CustomPigEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new PigEntityModel<>(context.getPart(EntityModelLayers.PIG)), 0.7f);
    }

    @Override
    public Identifier getTexture(AnimalEntity entity) {
        String texturePath = getTexturePathForEntity(entity);
        return Identifier.of(PigCompanionMod.MOD_ID, texturePath);
    }

    private String getTexturePathForEntity(AnimalEntity entity) {
        String entityTypeName = entity.getType().toString();
        
        // SuperPig
        if (entity instanceof SuperPigEntity) {
            return "textures/entity/pig/pig.png";
        }
        
        // Companion pigs
        if (entity instanceof CompanionPigEntity) {
            if (entityTypeName.contains("pig_companion_leather")) {
                return "textures/entity/pig/pig_companion_leather.png";
            } else if (entityTypeName.contains("pig_companion_iron")) {
                return "textures/entity/pig/pig_companion_iron.png";
            } else if (entityTypeName.contains("pig_companion_gold")) {
                return "textures/entity/pig/pig_companion_gold.png";
            } else if (entityTypeName.contains("pig_companion_diamond")) {
                return "textures/entity/pig/pig_companion_diamond.png";
            }
        }
        
        // Armored pigs
        if (entity instanceof ArmoredPigEntity) {
            if (entityTypeName.contains("pig_leather")) {
                return "textures/entity/pig/pig_leather.png";
            } else if (entityTypeName.contains("pig_iron")) {
                return "textures/entity/pig/pig_iron.png";
            } else if (entityTypeName.contains("pig_gold")) {
                return "textures/entity/pig/pig_gold.png";
            } else if (entityTypeName.contains("pig_diamond")) {
                return "textures/entity/pig/pig_diamond.png";
            }
        }
        
        // Default fallback
        return "textures/entity/pig/pig.png";
    }
}
