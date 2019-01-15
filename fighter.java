package GlobalFighter;


import GlobalFighter.graphics.GUI3;
import GlobalFighter.jobs.EntityTask;
import GlobalFighter.jobs.JobsTask;
import GlobalFighter.jobs.foodTask;
import GlobalFighter.jobs.lootTask;
import org.shadowbot.bot.api.Manifest;
import org.shadowbot.bot.api.ShadowScript;
import org.shadowbot.bot.api.SkillCategory;
import org.shadowbot.bot.api.listeners.PaintListener;
import org.shadowbot.bot.api.methods.data.Skills;
import org.shadowbot.bot.api.util.Log;
import org.shadowbot.bot.api.util.Random;
import org.shadowbot.bot.api.util.Time;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

/**
 * User: Pen
 */
@Manifest(author = "Farhad", category = SkillCategory.COMBAT, description = "GlobalFighter", scriptName = "ShadowFighter")
public class fighter extends ShadowScript implements PaintListener {
    private final Color color1 = new Color(255, 255, 255);
    private final Font font1 = new Font("Arial", 1, 17);
    private final Image img1 = getImage("http://puu.sh/5nAVK.png");
    private long start_Time;

    private Image getImage(String url) {
        try {
            return ImageIO.read(new URL(url));
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public void onStart() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel");
                } catch (Exception e) {
                    System.out.println("Substance Graphite failed to initialize");
                }
                GUI3 gui = new GUI3();
                gui.setVisible(true);
            }
        });

        while (Storage.START) {
            sleep(25);
        }
        JobsTask.addJob(new EntityTask());
        JobsTask.addJob(new lootTask());
        JobsTask.addJob(new foodTask());

        sleep(Random.nextInt(200, 400));
        Storage.STARTXP = Skills.getExperience(Skills.Skill.ATTACK)
                + Skills.getExperience(Skills.Skill.STRENGTH)
                + Skills.getExperience(Skills.Skill.DEFENSE)
                + Skills.getExperience(Skills.Skill.CONSTITUTION);
        start_Time = System.currentTimeMillis();
    }

    @Override
    public int operate() {
        return JobsTask.run();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onStop() {
        Log.info("Thanks for using GlobalFighter :)");
        Log.info("Post Progress Report on Official Thread :)");
    }

    @Override
    public void render(Graphics g1) {
        long timeRan = System.currentTimeMillis() - start_Time;
        Storage.XPHOUR = (int) ((Storage.GAINEDXP) * 3600000D / (timeRan));
        Storage.GAINEDXP = Skills.getExperience(Skills.Skill.ATTACK) + Skills.getExperience(Skills.Skill.STRENGTH) + Skills.getExperience(Skills.Skill.DEFENSE) + Skills.getExperience(Skills.Skill.CONSTITUTION) - Storage.STARTXP;
        Graphics2D g = (Graphics2D) g1;
        g.drawImage(img1, 0, 338, null);
        g.setFont(font1);
        g.setColor(color1);
        g.drawString("" + Time.parse(timeRan), 185, 373);
        g.drawString("" + (Storage.GAINEDXP) + " Hour: " + (Storage.XPHOUR), 111, 413);
        g.drawString("" + Storage.NPCKILLED, 133, 454);

    }


}
