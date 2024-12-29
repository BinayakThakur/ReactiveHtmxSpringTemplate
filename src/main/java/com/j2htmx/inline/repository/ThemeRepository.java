package com.j2htmx.inline.repository;

public class ThemeRepository {
    //Make this session specific
    private static String theme = "theme-modern";

    public String getTheme() {
        return this.theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

}
