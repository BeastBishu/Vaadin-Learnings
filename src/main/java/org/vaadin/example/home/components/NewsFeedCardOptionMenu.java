package org.vaadin.example.home.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;

import java.util.ArrayList;
import java.util.List;

@StyleSheet("style/style2.css")
public class NewsFeedCardOptionMenu extends Div {

    public NewsFeedCardOptionMenu(boolean isFavorite, int favoriteCount, int shareCount) {

        this.setClassName("second-lower");
        Div lowerContentLeft = new Div();
        lowerContentLeft.setClassName("lowercontent-left");
        Div lowerFirst = new Div();
        lowerFirst.setClassName("lowerfirst");
        Icon slIcon1 = new Icon(VaadinIcon.HEART);
        slIcon1.setClassName("licon");
        slIcon1.getStyle().set("color", "grey");
        if (isFavorite) slIcon1.setColor("red");
        slIcon1.addClickListener(e -> {
            if (slIcon1.getColor().equals("red")) {
                slIcon1.setColor("grey");

            } else {
                slIcon1.setColor("red");
            }
        });

        Span like = new Span(favoriteCount + " likes");
        like.setClassName("like-text");
        lowerFirst.add(slIcon1, like);
        Div lowerSecond = new Div();
        lowerSecond.setClassName("lowerfirst");

        Icon slIcon2 = new Icon(VaadinIcon.COMMENT);
        slIcon2.setClassName("licon");
        Span comment = new Span("Comment");
        comment.setClassName("like-text");
        lowerSecond.add(slIcon2, comment);
        lowerSecond.addClickListener(divClickEvent -> {

        });
        Div lowerThird = new Div();
        lowerThird.setClassName("lowerfirst");
        Icon slIcon3 = new Icon(VaadinIcon.SHARE);
        slIcon3.setClassName("licon");
        Span share = new Span(shareCount + "");
        share.setClassName("like-text");
        lowerThird.add(slIcon3, share);
        lowerContentLeft.add(lowerFirst, lowerSecond, lowerThird);
        Span reply = new Span("Reply");
        reply.setClassName("like-text");
        this.add(lowerContentLeft, reply);

    }



}
