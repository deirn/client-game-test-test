package lol.bai.deirn.clientgametesttest;

import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;

@SuppressWarnings("UnstableApiUsage")
public class ClientGameTestTest implements FabricClientGameTest {
    @Override
    public void runTest(ClientGameTestContext ctx) {
        try (var world = ctx.worldBuilder().create()) {
            world.getClientLevel().waitForChunksRender();
            ctx.takeScreenshot("screenshot");
        }
    }
}
