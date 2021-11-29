package org.vaadin.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.page.Meta;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.omg.CORBA.ULongLongSeqHelper;

@Route("resp")
@StyleSheet("style/style1.css")
public class Respon extends Div {

    public Respon(){
        Div container = new Div();
        container.setClassName("container");
        container.add(createLeft(),createCenter(),createRight());
        add(container);
    }

    private Component createLeft() {
        Div createLeft = new Div();
        createLeft.setClassName("create-left");
        H1 h1 = new H1("Headline 1");
        Paragraph paragraph = new Paragraph("TA paragraph is a self-contained unit of discourse in writing dealing with a particular point or idea. A paragraph consists of one or more sentences. Though not required by the syntax of any language, paragraphs are usually an expected part of formal writing, used to organize longer prose.");
        createLeft.add(h1,paragraph);

        return createLeft;
    }
    private Component createCenter(){
        Div createCenter = new Div();
        createCenter.setClassName("create-center");
        H1 h1 = new H1("Headline 2");
        Paragraph paragraph = new Paragraph("THis is the new paragraph.");

        createCenter.add(h1,paragraph);
        return createCenter;
    }
    private Component createRight(){
        Div createRight = new Div();
        createRight.setClassName("create-right");
        H1 h1 = new H1("Headline 3");
        Paragraph paragraph = new Paragraph("THis is the new paragraph.");
        createRight.add(h1,paragraph);
        return  createRight;
    }

}
