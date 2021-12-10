package org.vaadin.example.home.components;

import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.example.MenuDemo;
import org.vaadin.example.home.WebResponsive;


/*@Route(value = "ActivityFeed", layout = WebResponsive.class)*/
public class CenterDiv extends Div {
    public CenterDiv(){
        this.setClassName("center");
        Div filter = new Div();
        filter.setClassName("filter");
        Span span1 = new Span("Activity Feed");
        span1.setClassName("feed");
        Div rightItems = new Div();
        Icon icon1 = new Icon(VaadinIcon.BULLETS);
        icon1.setClassName("icon-class1");
        Span span2 = new Span("Filter");
        span2.setClassName("feed");
        rightItems.add(icon1,span2);

        filter.add(span1,rightItems);
        PostInputForm inputForm = new PostInputForm();

        String rawHtml = "<article\n" +
                "      style=\"\n" +
                "        width: 300px;\n" +
                "        border: 2px solid gray;\n" +
                "        padding: 10px;\n" +
                "        border-radius: 10px;\n" +
                "        margin: 5px;\n" +
                "      \"\n" +
                "    >\n" +
                "      <img\n" +
                "        src=\n" +
                "\"https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190710102234/download3.png\"\n" +
                "        alt=\"\"\n" +
                "        width=\"300\"\n" +
                "        height=\"250\"\n" +
                "        class=\"alignnone size-medium wp-image-560930\"\n" +
                "      />\n" +
                "      <h1>GeeksforGeeks</h1>\n" +
                "        \n" +
                "<p>\n" +
                "        Sandeep Jain(FOUNDER) An IIT Roorkee alumnus and \n" +
                "        founder of GeeksforGeeks. Apart from GeeksforGeeks, \n" +
                "        he has worked with DE Shaw and Co. as a software \n" +
                "        developer and JIIT Noida as an assistant professor.\n" +
                "      </p>\n" +
                "  \n" +
                "    </article>";
        NewFeedCard card1 = new NewFeedCard("images/avatar.png", "Bishu KC", "1 hour ago", rawHtml, true, 5, 20);

        this.add(inputForm, card1);

        inputForm.getPostButton().addClickListener(e-> {
            NewFeedCard c = new NewFeedCard("images/avatar.png", "Bishu KC", "A seconds ago", "<span>"+inputForm.getTextAreaValue()+" </span>", false, 0, 0);
            this.addComponentAsFirst(c);
            this.addComponentAsFirst(inputForm);
        });



        Div midLower = new Div();
        midLower.setClassName("mid-lower");
        Div midLowerContent = new Div();
        midLowerContent.setClassName("midlower-content");
        midLower.add(midLowerContent);

        Div lower = new Div();
        lower.setClassName("lower");
        Div lowerContent = new Div();
        lowerContent.setClassName("lower-content");
        lower.add(lowerContent);
        this.add(filter,midLower,lower);

    }
}
