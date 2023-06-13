package com.spotifyxp.support;

import com.spotifyxp.PublicValues;
import com.spotifyxp.designs.Theme;
import com.spotifyxp.panels.ContentPanel;

public class SteamDeckSupportModule {
    public SteamDeckSupportModule() {
        ContentPanel.frame.setAntiAliasingActive(false);
        ContentPanel.frame.setUndecorated(true);
        if(PublicValues.theme == Theme.LEGACY) {
            ContentPanel.frame.setJMenuBar(null);
        }
    }
}
