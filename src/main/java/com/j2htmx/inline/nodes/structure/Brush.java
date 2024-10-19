package com.j2htmx.inline.nodes.structure;


import com.j2htmx.inline.nodes.canvas.WireFrame;

//Common data for every client
public abstract class Brush extends WireFrame {

    public static void setPageTitle(String newTitle) {
        title = newTitle;
    }

}
