package GlobalFighter.jobs;

import GlobalFighter.Storage;
import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.methods.interactive.GroundItems;
import org.shadowbot.bot.api.wrapper.GroundItem;

/**
 * User: Pen
 */
public class herbsTask implements Job {
    @Override
    public boolean isActive() {
        return Storage.HERBS;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void run() {
        GroundItem HERB = GroundItems.getNearest(Storage.HERB);
        if (HERB != null) {
            if (HERB.distanceTo() < 6 && HERB.isOnScreen()) {
                HERB.interact("Take");
                Storage.isAnimating();
            }
        }
    }
}
