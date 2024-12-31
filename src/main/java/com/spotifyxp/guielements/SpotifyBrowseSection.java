package com.spotifyxp.guielements;

import com.spotifyxp.PublicValues;
import com.spotifyxp.api.UnofficialSpotifyAPI;
import com.spotifyxp.panels.ContentPanel;
import com.spotifyxp.panels.HomePanel;
import com.spotifyxp.panels.View;
import com.spotifyxp.panels.Views;
import com.spotifyxp.utils.GraphicalMessage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Locale;

public class SpotifyBrowseSection extends JScrollPane {
    public DefTable table;
    private ArrayList<String> uris;

    public SpotifyBrowseSection(ArrayList<UnofficialSpotifyAPI.SpotifyBrowseEntry> entries, int x, int y, int width, int height) {
        table = new DefTable();
        uris = new ArrayList<>();

        table.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "Name", ""
                }
        ));
        table.setForeground(PublicValues.globalFontColor);
        table.getTableHeader().setForeground(PublicValues.globalFontColor);

        for(UnofficialSpotifyAPI.SpotifyBrowseEntry e : entries) {
            uris.add(e.getEvents().get().getEvents().get(0).getData_uri().get().getUri());
            table.addModifyAction(new Runnable() {
                @Override
                public void run() {
                    String subtitle = "";
                    if(e.getText().getSubtitle().isPresent()) {
                        subtitle = e.getText().getSubtitle().get();
                    } else if (e.getText().getDescription().isPresent()) {
                        subtitle = e.getText().getDescription().get();
                    }
                    ((DefaultTableModel) table.getModel()).addRow(new Object[] {e.getText().getTitle(), subtitle});
                }
            });
        }

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2) {
                    String entry = uris.get(table.getSelectedRow());
                    HomePanel.ContentTypes contentType;
                    switch(entry.split(":")[1].toLowerCase(Locale.ENGLISH)) {
                        case "playlist":
                            contentType = HomePanel.ContentTypes.playlist;
                            break;
                        case "album":
                            contentType = HomePanel.ContentTypes.album;
                            break;
                        case "show":
                            contentType = HomePanel.ContentTypes.show;
                            break;
                        case "episode":
                        case "track":
                            PublicValues.spotifyplayer.load(entry, true, false);
                            return;
                        default:
                            GraphicalMessage.bug("Called browse onclick with an unsupported content type: " + entry.split(":")[1]);
                            return;
                    }

                    //This opens the track panel but additionally also hijacks the back button
                    ContentPanel.trackPanel.open(entry, contentType, new Runnable() {
                        @Override
                        public void run() {
                            ContentPanel.switchView(Views.BROWSESECTION);
                            ContentPanel.lastViewPanel = ContentPanel.browsepanel;
                            ContentPanel.lastView = Views.BROWSE;
                        }
                    });
                }
            }
        });

        setViewportView(table);
        setBounds(x, y, width, height);
    }
}