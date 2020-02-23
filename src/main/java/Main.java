import org.osbot.rs07.api.ui.Message;
import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;

import java.awt.*;

@ScriptManifest(name = "Basic Script", author = "Philippe", version = 1.0, info = "", logo = "")

public class Main extends Script {
    @Override
    public void onStart() {
        // Before loop
    }

    @Override
    public void onExit() {
        // After loop
    }

    @Override
    public int onLoop() {

        return 100; // Amount of time in ms before loop restarts
    }

    @Override
    public void onMessage(Message message) {
        // On message received
    }

    @Override
    public void onGameTick() {
        // On game tick
    }

    @Override
    public void onPaint(Graphics2D graphics2D) {
        // Graphics
    }
}
