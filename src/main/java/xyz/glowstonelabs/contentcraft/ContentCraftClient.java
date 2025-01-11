package xyz.glowstonelabs.contentcraft;

import net.fabricmc.api.ClientModInitializer;



public class ContentCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ContentCraft.LOGGER.info("<<<IMPORTANT>>> Make sure you have a serverside instance of ContentCraft installed in the server/singleplayer world otherwise some of out features wont work!");

    }
}
