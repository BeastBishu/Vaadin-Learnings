package org.vaadin.example.home.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;

public class CommentRead extends Div {
    public CommentRead(){
    Label cmtLabel = new Label("This is comment label.");
    add(cmtLabel);
    }
}
