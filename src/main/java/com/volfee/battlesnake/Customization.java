package com.volfee.battlesnake;

public class Customization {
    // Version of the Battlesnake API implemented
    // by this Battlesnake. Currently only API version 1 is valid.
    private final static String apiversion = "1";

    // Username of the author of this Battlesnake.
    // If provided, this will be used to verify ownership.
    private final static String author = "Volfee";

    // Hex color code used to display this Battlesnake.
    // Must start with "#" and be 7 characters long.
    private final static String color = "#22a347";

    // Displayed head of this Battlesnake. See Personalization
    // Docs for available options
    private final static String head = "default";

    // Displayed tail of this Battlesnake. See Personalization Docs
    // for available options.
    private final static String tail = "default";

    // A version number or tag for your snake.
    private final static String version = "0.0.1";

    public Customization() {}

    public String getApiversion() {
        return apiversion;
    }

    public String getAuthor() {
        return author;
    }

    public String getColor() {
        return color;
    }

    public String getHead() {
        return head;
    }

    public String getTail() {
        return tail;
    }

    public String getVersion() {
        return version;
    }
}
