package com.spotifyxp.theming.themes;

import com.spotifyxp.logging.ConsoleLogging;
import com.spotifyxp.theming.Theme;

import javax.swing.*;

public class Windows implements Theme {
    @Override
    public String getAuthor() {
        return "Werwolf2303 [NO UPDATES]";
    }

    @Override
    public boolean isLight() {
        return true;
    }

    @Override
    public void initTheme() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (RuntimeException | UnsupportedLookAndFeelException | ClassNotFoundException |
                 InstantiationException | IllegalAccessException e) {
            ConsoleLogging.Throwable(e);
        }
    }
}
