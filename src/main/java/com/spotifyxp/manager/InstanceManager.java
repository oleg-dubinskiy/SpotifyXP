package com.spotifyxp.manager;

import com.spotifyxp.api.*;
import com.spotifyxp.deps.se.michaelthelin.spotify.SpotifyApi;
import com.spotifyxp.utils.PlayerUtils;

import java.util.ArrayList;

/**
 * This class is a manager
 *
 * @apiNote get[insertName] -> Gets an instance of the specified class
 * <br>set[insertName] -> Sets the instance of the specified class
 * <br> Get Example: getUnofficialSpotifyApi()
 * <br> Set Example: setUnofficialSpotifyApi( [instance of UnofficialSpotifyAPI] )
 */
public class InstanceManager {
    static SpotifyAPI api;
    static SpotifyApi sapi;
    static OAuthPKCE pkce;
    static Player player;
    static GitHubAPI gitHubAPI;
    static UnofficialSpotifyAPI unofficialSpotifyAPI;
    static PlayerUtils playerUtils;
    static ArrayList<Object> classInstances = new ArrayList<>();

    public static Player getPlayer() {
        if (player == null) {
            player = new Player(api);
        }
        return player;
    }

    public static void setPlayer(Player p) {
        player = p;
    }

    public static OAuthPKCE getPkce() {
        if (pkce == null) {
            pkce = new OAuthPKCE();
        }
        return pkce;
    }

    public static UnofficialSpotifyAPI getUnofficialSpotifyApi() {
        if (unofficialSpotifyAPI == null) {
            unofficialSpotifyAPI = new UnofficialSpotifyAPI(InstanceManager.getPkce().getToken());
        }
        return unofficialSpotifyAPI;
    }

    public static void setUnofficialSpotifyAPI(UnofficialSpotifyAPI api) {
        unofficialSpotifyAPI = api;
    }

    public static void setPkce(OAuthPKCE pk) {
        pkce = pk;
    }

    public static SpotifyAPI getSpotifyAPI() {
        if (api == null) {
            api = new SpotifyAPI();
        }
        return api;
    }

    public static PlayerUtils getPlayerUtils() {
        if (playerUtils == null) {
            playerUtils = new PlayerUtils();
        }
        return playerUtils;
    }

    public static void setPlayerUtils(PlayerUtils utils) {
        playerUtils = utils;
    }

    public static void setSpotifyAPI(SpotifyAPI a) {
        api = a;
    }

    public static void setSpotifyApi(SpotifyApi a) {
        sapi = a;
    }

    public static SpotifyApi getSpotifyApi() {
        if (sapi == null) {
            sapi = SpotifyApi.builder().setAccessToken(pkce.getToken()).build();
        }
        return sapi;
    }

    public static GitHubAPI getGitHubAPI() {
        if (gitHubAPI == null) {
            gitHubAPI = new GitHubAPI();
        }
        return gitHubAPI;
    }

    public static void setGitHubAPI(GitHubAPI api) {
        gitHubAPI = api;
    }

    public static void destroy() {
        classInstances.clear();
        api = null;
        sapi = null;
        pkce = null;
        player = null;
        gitHubAPI = null;
        unofficialSpotifyAPI = null;
        playerUtils = null;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getInstanceOf(Class<T> classReference) throws InstantiationException, IllegalAccessException {
        for (Object clazz : classInstances) {
            if (classReference.isInstance(clazz)) {
                return (T) clazz;
            }
        }
        Object instance = classReference.newInstance();
        classInstances.add(instance);
        return (T) instance;
    }
}
