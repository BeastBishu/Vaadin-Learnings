package org.vaadin.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "",layout = MenuDemo.class)
@PageTitle("Button 1 | Vaadin CRM")
public class Btn1 extends VerticalLayout {

    public Btn1(){

        H1 h = new H1("Button 1 Header");
        Span sp = new Span("This is the content of button 1");
        Button btn = new Button("Click here",buttonClickEvent -> {
            Notification.show(h.getText());
        });

        VerticalLayout layout = new VerticalLayout(h,sp,btn);
        HorizontalLayout hLayout = new HorizontalLayout(createCard(),createCard(),createCard(),createCard());
        HorizontalLayout h1Layout = new HorizontalLayout(createCard(),createCard(),createCard(),createCard());
        layout.setAlignItems(Alignment.CENTER);
        layout.setJustifyContentMode(JustifyContentMode.CENTER);
        hLayout.setAlignItems(Alignment.END);
        hLayout.setJustifyContentMode(JustifyContentMode.END);

        add(layout,hLayout,h1Layout);
    }
    public Component createCard(){
        Span label = new Span("Card");
        label.setClassName("span1");
        FlexLayout card = new FlexLayout(label);
        card.setClassName("card");
        card.setAlignItems(Alignment.CENTER);
        card.setJustifyContentMode(JustifyContentMode.CENTER);
        card.setWidth("200px");
        card.setHeight("200px");

        return card;
    }
}
