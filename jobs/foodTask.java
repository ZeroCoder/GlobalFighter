package GlobalFighter.jobs;

import GlobalFighter.Storage;
import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.methods.data.Inventory;
import org.shadowbot.bot.api.methods.interactive.Players;

/**
 * User: Pen
 */
public class foodTask implements Job {
    @Override
    public boolean isActive() {
        return Storage.FOOD;
    }

    @Override
    public void run() {
        if (Players.getLocal().getHealthPercent() < 50) {
            if (Inventory.contains(Storage.WHICHFOOD)) {
                Inventory.getItem(Storage.WHICHFOOD).interact("Eat");
            }
        }
    }
}
