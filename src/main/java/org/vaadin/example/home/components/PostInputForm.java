package org.vaadin.example.home.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextArea;

public class PostInputForm extends Div {

    private Button postButton;
    private TextArea textArea;

    public PostInputForm() {
        textArea = new TextArea("What's on your mind...");
        textArea.setWidthFull();
        textArea.setHeight("200px");

        postButton = new Button("Post");
        postButton.getStyle().set("margin-top", "12px");
        postButton.getStyle().set("margin-left", "auto");

        this.setWidthFull();
        this.getStyle().set("display", "flex");
        this.getStyle().set("flex-direction", "column");
        this.getStyle().set("padding", "20px");
        this.getStyle().set("box-sizing", "border-box");
        this.getStyle().set("border", "1px solid hsl(0 0% 87%)");

        this.add(textArea, postButton);
    }

    public Button getPostButton() {
        return postButton;
    }

    public String getTextAreaValue() {
        return textArea.getOptionalValue().orElse("");
    }
}
