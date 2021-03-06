package xyz.unifycraft.template.mixins;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.unifycraft.template.TemplateMod;

@Mixin({Minecraft.class})
public class MinecraftMixin {
    @Inject(method = "startGame", at = @At("HEAD"))
    private void onGameStarted(CallbackInfo ci) {
        TemplateMod.getLogger().info("Hello, World!");
    }
}