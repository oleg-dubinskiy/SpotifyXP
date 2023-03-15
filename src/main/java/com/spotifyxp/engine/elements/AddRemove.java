package com.spotifyxp.engine.elements;

import com.spotifyxp.engine.Element;
import com.spotifyxp.engine.EnginePanel;
import com.spotifyxp.logging.ConsoleLogging;

import java.awt.*;
import java.awt.geom.Path2D;

public class AddRemove implements Element {
    int x = 0;
    int y = 0;
    String name = "AddRemove";
    int w = 0;
    int h = 0;
    boolean a = false;
    Color lc = Color.black;
    EnginePanel ep = null;
    boolean d = false;
    int s = 0;

    public AddRemove(int size, int xaxis, int yaxis, boolean add, Color lineColor) {
        s = size;
        x = xaxis;
        y = yaxis;
        a = add;
        lc = lineColor;
    }

    @Override
    public void setEnginePanelInstance(EnginePanel enginePanel) {
        ep = enginePanel;
    }

    @Override
    public void setDebug(boolean debug) {
        d = debug;
    }

    public void setAdd(boolean add) {
        a = add;
        ep.triggerRepaint();
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void drawElement(Graphics2D graphics2D) {
        Circle.draw(s, x, y, lc, graphics2D);
        graphics2D.setColor(lc);
        if(a) {
            //Draw plus
            graphics2D.drawLine(x + s, y, x + s, y + s*2);
            graphics2D.drawLine(x, y + s, x + s*2, y + s);
        }else{
            //Draw minus
            graphics2D.drawLine(x, y + s, x + s*2, y + s);
        }
        if(d) {
            ConsoleLogging.changeName("DrawingEngine");
            ConsoleLogging.info("Drawing: '" + name + "' with x:" + x + " | y:" + y + " | width:" + w + " | height:" + h);
            ConsoleLogging.changeName("SpotifyXP");
        }
        graphics2D.setColor(Color.black);
    }
}