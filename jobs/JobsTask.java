package GlobalFighter.jobs;

import org.shadowbot.bot.api.Job;
import org.shadowbot.bot.api.methods.data.Game;
import org.shadowbot.bot.api.util.Random;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Magorium
 * Date: 8/25/13
 * Time: 1:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class JobsTask {

    private static ArrayList<Job> jobs = new ArrayList<Job>();

    public static Job[] jobs() {
        return jobs.toArray(new Job[jobs.size()]);
    }

    public static void addJob(Job job) {
        jobs.add(job);
    }

    public static int run() {
        if (Game.isLoggedIn()) {
            for (Job job : jobs) {
                if (job != null && job.isActive()) {
                    job.run();
                }
            }
        }
        return Random.nextInt(150, 200);
    }
}
