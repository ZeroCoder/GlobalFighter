package GlobalFighter;

import org.shadowbot.bot.api.methods.interactive.Players;
import org.shadowbot.bot.api.util.Time;

/**
 * User: Pen
 */
public class Storage {

    public static final int HERB[] = {199, 201, 203, 205, 207, 1140, 3049, 209,
            2485, 213, 215, 217, 211, 3051, 1440};
    public static boolean START = false, LOOT = false, FOOD = false, BANK = false, HERBS = false;
    public static String TARGET;
    public static int WHICHFOOD;
    public static int TOLOOT;
    public static int STARTXP = 0, GAINEDXP = 0, XPHOUR, NPCKILLED;

    public static void CombatSleeping() {
        for (int i = 0; i < 10 && Players.getLocal().isInCombat(); i++, Time.sleep(200, 275)) ;
    }

    public static void isAnimating() {
        for (int i = 0; i < 10 && !(Players.getLocal().getAnimation() == -1); i++, Time.sleep(200, 275)) ;
    }

}
