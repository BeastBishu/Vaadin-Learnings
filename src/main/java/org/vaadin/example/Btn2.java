package org.vaadin.example;


import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.model.style.Color;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.data.validator.EmailValidator;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.Arrays;
import java.util.List;

@Route(value = "btn2",layout = MenuDemo.class)
@PageTitle("Button 2 | Vaadin CRM")
public class Btn2 extends VerticalLayout {

    public Btn2(){
        VerticalLayout layout = new VerticalLayout();
        CheckboxGroup<String> box = new CheckboxGroup<>();
        List<String> list = Arrays.asList("option1","option2","option3");
        box.setLabel("Checkbox");
        box.setItems(list);
        box.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        layout.add(box);
        layout.setAlignItems(Alignment.CENTER);

        Accordion accordion = new Accordion();
        FormLayout firstLayout = new FormLayout();
        firstLayout.add(new TextField("Name"));
        firstLayout.add(new TextField("Phone"));
        firstLayout.add(new TextField("Email"));
        accordion.add("Personal Information",firstLayout);

        Div div = new Div(new Hr());

        FormLayout secondLayout = new FormLayout();
        secondLayout.add(new TextField("First"));
        secondLayout.add(new TextField("Second"));
        secondLayout.add(new TextField("Third"));


        SplitLayout splitLayout = new SplitLayout(
                createCard(),createCard()
        );
        splitLayout.setWidthFull();

        VerticalLayout verticalLayout = new VerticalLayout(createLogin());
        verticalLayout.setAlignItems(Alignment.CENTER);
        Select<String> lists = new Select<>();
        lists.setLabel("Dropdown:");
        lists.setItems("first","second","third","fourth");

        Person person = new Person("John Doe", 1957);
        Binder<Person> binder = new Binder<>(Person.class);
// Updates the value in each bound field component
        binder.readBean(person);

        Button saveButton = new Button("Save",
                event -> {
                    try {
                        binder.writeBean(person);
                        // A real application would also save
                        // the updated person
                        // using the application's backend
                    } catch (ValidationException e) {
                        notifyValidationException(e);
                    }
                });
        Button resetButton = new Button("Reset",
                event -> binder.readBean(person));
        TextField fullName = new TextField();
        binder.forField(fullName);

        add(layout,accordion,div,secondLayout,div,splitLayout,verticalLayout,lists,saveButton,resetButton,fullName);

    }

    private void notifyValidationException(ValidationException e) {
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
    public Component createLogin(){
        H1 label = new H1("Login");
        Span name = new Span("Username");
        TextField username = new TextField();
        Span password = new Span("Password");
        PasswordField pass = new PasswordField();
        Button button = new Button("Submit");
        VerticalLayout box = new VerticalLayout(label,name,username,password,pass,button);
        box.setClassName("card");
        box.setWidth("300px");
        box.setHeight("400px");
        box.setAlignItems(Alignment.CENTER);
        box.setJustifyContentMode(JustifyContentMode.CENTER);

        return box;
    }

}
