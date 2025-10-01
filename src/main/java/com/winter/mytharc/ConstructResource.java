package com.winter.mytharc;

import net.minecraft.resources.ResourceLocation;

public class ConstructResource
{
    public static ResourceLocation create(String path) {
        return new ResourceLocation("mytharc", path);
    }
}
