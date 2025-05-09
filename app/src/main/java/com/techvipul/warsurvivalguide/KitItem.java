package com.techvipul.warsurvivalguide;

public class KitItem {
    private String name;
    private String description;
    private int iconResId;

    public KitItem(String name, String description, int iconResId) {
        this.name = name;
        this.description = description;
        this.iconResId = iconResId;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getIconResId() { return iconResId; }
}