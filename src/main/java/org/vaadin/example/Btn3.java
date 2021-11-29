package org.vaadin.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "btn3",layout = MenuDemo.class)
public class Btn3 extends VerticalLayout {
    Grid<Person> grid = new Grid<>(Person.class);

    public Btn3(){
        addClassName("list-view");
        setSizeFull();

        add(grid);
    }
}
