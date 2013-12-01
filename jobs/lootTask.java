package GlobalFighter.jobs;

import GlobalFighter.Storage;
import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.methods.interactive.GroundItems;
import org.shadowbot.bot.api.wrapper.GroundItem;

/**
 * User: Pen
 */
public class lootTask implements Job {
    @Override
    public boolean isActive() {
        return Storage.LOOT;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void run() {
        GroundItem LOOT = GroundItems.getNearest(Storage.TOLOOT);
        if (LOOT != null) {
            if (LOOT.distanceTo() < 6 && LOOT.isOnScreen()) {
                LOOT.interact("Take");
                Storage.isAnimating();
            }
        }
    }
}
