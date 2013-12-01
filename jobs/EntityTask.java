package GlobalFighter.jobs;

import GlobalFighter.Storage;
import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.methods.data.movement.Camera;
import org.shadowbot.bot.api.methods.data.movement.Walking;
import org.shadowbot.bot.api.methods.input.Mouse;
import org.shadowbot.bot.api.methods.interactive.NPCs;
import org.shadowbot.bot.api.methods.interactive.Players;
import org.shadowbot.bot.api.util.Random;
import org.shadowbot.bot.api.util.Time;
import org.shadowbot.bot.api.wrapper.NPC;

/**
 * User: Pen
 */
public class EntityTask implements Job {
    @Override
    public boolean isActive() {
        return !Players.getLocal().isInCombat();
    }

    @Override
    public void run() {
        final NPC TARGET = NPCs.getNearest(Storage.TARGET);
        if (TARGET != null) {
            if (TARGET.isOnScreen()) {
                if (!Players.getLocal().isInCombat()) {
                    TARGET.interact("Attack");
                    Storage.NPCKILLED++;
                    Storage.isAnimating();
                    Storage.CombatSleeping();
                    antiBan();
                }
            } else {
                Camera.turnTo(TARGET);
                Storage.isAnimating();
                Walking.walkTo(TARGET);
            }
        }
    }

    public void antiBan() {
        int Option = Random.nextInt(1, 4);
        switch (Option) {
            case 2:
                int cameraAngel = Random.nextInt(0, 360);
                Camera.setAngle(cameraAngel);
                break;
            case 3:
                break;
            case 4:
                Mouse.setSpeed(Random.nextInt(6, 10));
                break;
        }
    }
}
