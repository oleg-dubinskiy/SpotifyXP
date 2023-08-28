package com.spotifyxp.visuals;
import com.spotifyxp.PublicValues;
import com.spotifyxp.utils.SpectrumAnalyzer;
import org.checkerframework.checker.units.qual.A;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AudioVisualizer extends JPanel {
    byte[] converted = null;
    JFrame frame = null;
    ArrayList<Color> colors = new ArrayList<>();
    public void open() {
        frame = new JFrame(PublicValues.language.translate("ui.audiovisualizer.title"));
        setPreferredSize(new Dimension(800, 400));
        setBackground(Color.black);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
        colors.add(Color.decode("#078D70"));
        colors.add(Color.decode("#26CEAA"));
        colors.add(Color.decode("#90E8C1"));
        colors.add(Color.decode("#FFFFFF"));
        colors.add(Color.decode("#7BADE2"));
        colors.add(Color.decode("#5049CC"));
        colors.add(Color.decode("#3D1A78"));
    }

    public void close() {
        frame.dispose();
    }

    public boolean isVisible() {
        converted = null;
        if(frame == null) {
            return false;
        }
        return frame.isVisible();
    }

    double[] lastspectrumdata = null;

    boolean rainbow = false;

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        if(rainbow) {
            if (converted != null) {
                try {
                    gr.setColor(Color.decode("#2596be"));
                    gr.fillRect(0, 0, getWidth(), getHeight());
                    SpectrumAnalyzer analyzer = new SpectrumAnalyzer();
                    double[] spectrumData = analyzer.analyzeAudio(converted);
                    colors.clear();
                    for (int r = 0; r < 100; r++) colors.add(new Color(r * 255 / 100, 255, 0));
                    for (int g = 100; g > 0; g--) colors.add(new Color(255, g * 255 / 100, 0));
                    for (int b = 0; b < 100; b++) colors.add(new Color(255, 0, b * 255 / 100));
                    for (int r = 100; r > 0; r--) colors.add(new Color(r * 255 / 100, 0, 255));
                    for (int g = 0; g < 100; g++) colors.add(new Color(0, g * 255 / 100, 255));
                    for (int b = 100; b > 0; b--) colors.add(new Color(0, 255, b * 255 / 100));
                    colors.add(new Color(0, 255, 0));
                    int c = 0;
                    if (spectrumData == null) {
                        if (lastspectrumdata == null) {
                            return;
                        }
                        spectrumData = lastspectrumdata;
                    }
                    for (int i = 0; i < spectrumData.length; i++) {
                        try {
                            gr.setColor(colors.get(c));
                        } catch (IndexOutOfBoundsException e) {
                            c = 0;
                            gr.setColor(colors.get(c));
                        }
                        double amp = spectrumData[i];
                        gr.drawLine(i, getHeight(), i, (int) amp);
                        c++;
                    }
                    lastspectrumdata = spectrumData;
                } catch (IllegalArgumentException ignored) {
                }
            }
        }else{
            if(converted != null) {
                try {
                    gr.setColor(Color.black);
                    gr.fillRect(0, 0, getWidth(), getHeight());
                    SpectrumAnalyzer analyzer = new SpectrumAnalyzer();
                    double[] spectrumData = analyzer.analyzeAudio(converted);
                    int c = 0;
                    int a = 0;
                    if (spectrumData == null) {
                        if (lastspectrumdata == null) {
                            return;
                        }
                        spectrumData = lastspectrumdata;
                    }
                    for (int i = 0; i < spectrumData.length; i++) {
                        if(c > colors.size() - 1) {
                            c = 0;
                        }
                        double amp = spectrumData[i];
                        gr.setColor(colors.get(c));
                        gr.drawLine(i, getHeight(), i, (int) (Math.round(getHeight() - amp * 2)));
                        if(a == 5) {
                            c++;
                            a = 0;
                        }
                        a++;
                    }
                }catch (IllegalArgumentException ignored) {
                }
            }
        }
    }


    public void update(byte[] converted)  {
        this.converted = converted;
        repaint();
    }
}
