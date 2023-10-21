package com.spotifyxp.guielements;

import com.spotifyxp.PublicValues;
import com.spotifyxp.deps.se.michaelthelin.spotify.model_objects.specification.Track;
import com.spotifyxp.factory.Factory;
import com.spotifyxp.logging.ConsoleLogging;
import com.spotifyxp.swingextension.ContextMenu;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class DefaultTable extends DefTable {
    //DefaultTable
    //
    // The default table consists of two elements
    // 1. The uri cache
    // 2. The table itself

    // How does the uri cache work?
    // When you click on a row in the table the row number gets passed to the song cache z.b cache.get(ROW_NUMBER) and it gives back the uri of the spotify thingy you selected
    final ArrayList<String> uricache = new ArrayList<>();
    final Type type;
    boolean hasContextMenu = false;

    public enum Type {
        TRACK,
        ARTIST,
        SHOW,
        ALBUM,
        PLAYLIST
    }

    final ContextMenu contextMenu;

    public DefaultTable(Type tableType) {
        type = tableType;
        contextMenu = new ContextMenu(this);
        setColumnSelectionAllowed(false);
        setRowSelectionAllowed(true);
        initializeTableContents();
    }

    public void clear() {
        uricache.clear();
        ((DefaultTableModel) getModel()).setRowCount(0);
    }

    void initializeTableContents() {
        switch(type) {
            case SHOW:
                initializeShow();
                break;
            case ALBUM:
                initializeAlbum();
                break;
            case TRACK:
                initializeTrack();
                break;
            case ARTIST:
                initializeArtist();
                break;
            case PLAYLIST:
                initializePlaylist();
                break;
        }
    }

    void initializeTrack() {
        setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        PublicValues.language.translate("ui.search.songlist.songname"), PublicValues.language.translate("ui.search.songlist.filesize"), PublicValues.language.translate("ui.search.songlist.bitrate"), PublicValues.language.translate("ui.search.songlist.length")
                }
        ));
    }

    void initializeArtist() {
        setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        PublicValues.language.translate("ui.search.songlist.songname")
                }
        ));
    }

    void initializeShow() {
        setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        PublicValues.language.translate("ui.search.songlist.songname")
                }
        ));
    }

    void initializeAlbum() {
        setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        PublicValues.language.translate("ui.search.songlist.songname")
                }
        ));
    }

    void initializePlaylist() {
        setModel(new DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        PublicValues.language.translate("ui.hotlist.playlistlist.playlists")
                }
        ));
    }

    public Track getTrack(int row) {
        if(!(row>uricache.size())) {
            return null;
        }
        try {
            return Factory.getSpotifyApi().getTrack(uricache.get(row)).build().execute();
        }catch (Exception e) {
            ConsoleLogging.Throwable(e);
            return null;
        }
    }
}
