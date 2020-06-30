package com.xavitoim.experiencemod.utils.helpers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

public class KeyboardHelper {
    private static final long WINDOW = Minecraft.getInstance().getMainWindow().getHandle();

    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingShift() {
        return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_SHIFT)
                || InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_SHIFT);
    }

    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingCtrl() {
        return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_CONTROL)
                || InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_CONTROL);
    }

    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingSpace() {
        return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_SPACE);
    }

    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingWASD() {
        return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_W) ||
                InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_A) ||
                InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_S) ||
                InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_D);
    }
}
