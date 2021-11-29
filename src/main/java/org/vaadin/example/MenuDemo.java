package org.vaadin.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;

@PWA(name = "Vaadin",
        shortName = "CRM")
@StyleSheet("style/style.css")
public class MenuDemo extends AppLayout {

    public MenuDemo() {
        createHeader();
        createFooter();
    }

    private void createHeader() {
        Span logo = new Span("LOGO");
        Span logout = new Span("Logout");
        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(),logo,logout);

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.expand(logo);
        header.setWidth("100%");

        addToNavbar(header);
    }

    private void createFooter() {
        Button btn1 = new Button("btn1");

        btn1.addClickListener(buttonClickEvent -> {
           UI.getCurrent().navigate(Btn1.class);
        });
        RouterLink btn2 = new RouterLink("btn1",Btn2.class);
        btn2.setClassName("span");
        RouterLink btn3 = new RouterLink("Btn 3",Btn3.class);
        btn2.setClassName("span");
        VerticalLayout menu = new VerticalLayout(btn1,btn2,btn3);
        menu.setHeightFull();
        menu.setClassName("menu");
        addToDrawer(menu);
    }

}
