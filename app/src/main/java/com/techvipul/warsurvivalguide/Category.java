package com.techvipul.warsurvivalguide;

public class Category {
    private String name;
    private int iconResId;
    private Class<?> activityClass;

    public Category(String name, int iconResId, Class<?> activityClass) {
        this.name = name;
        this.iconResId = iconResId;
        this.activityClass = activityClass;
    }

    public String getName() { return name; }
    public int getIconResId() { return iconResId; }
    public Class<?> getActivityClass() { return activityClass; }
}