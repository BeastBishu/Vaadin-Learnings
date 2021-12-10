package org.vaadin.example.home.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.home.WebResponsive;


@Route(value = "activityFeed",layout = WebResponsive.class)
public class ActivityFeed extends VerticalLayout {

    public ActivityFeed(){
        add(centerDiv(),right());
    }

    private Component centerDiv(){
        Div center = new Div();
        center.setClassName("center");
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

        center.add(inputForm, card1);

        inputForm.getPostButton().addClickListener(e-> {
            NewFeedCard c = new NewFeedCard("images/avatar.png", "Bishu KC", "A seconds ago", "<span>"+inputForm.getTextAreaValue()+" </span>", false, 0, 0);
            center.addComponentAsFirst(c);
            center.addComponentAsFirst(inputForm);
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
        center.add(filter,midLower,lower);
        return center;
    }
    private Component right(){
        Div rightContainer = new Div();
        rightContainer.setClassName("right");

        Div rightTop = new Div();
        rightTop.setClassName("right-top");
        Div recommend = new Div();
        recommend.setClassName("recommend");
        Span span1 = new Span("Recommended Courses");
        span1.setClassName("second-title");
        Icon icon1 = new Icon(VaadinIcon.ELLIPSIS_DOTS_H);
        icon1.setClassName("licon");
        recommend.add(span1,icon1);
        Hr hr1 = new Hr();
        hr1.setClassName("hr2");

        Div rightTopContent = new Div();
        rightTopContent.setClassName("righttop-content");
        Image image = new Image();
        image.setSrc("/images/bulb.jpg");
        image.setClassName("image");
        Span title1 = new Span("University Entrance Exam Q & A: Energy");
        title1.setClassName("rightcontent-title");
        Span text1 = new Span("Energy(Potential, Kinetic and Mechanical. We provide answers to the past " +
                "University Exam questions.");
        text1.setClassName("rightcontent-text");
        rightTopContent.add(image,title1,text1);

        Hr hr2 = new Hr();
        hr2.setClassName("hr2");

        Div rightBottomContent = new Div();
        rightBottomContent.setClassName("righttop-content");
        Image image1 = new Image();
        image1.setSrc("/images/electric-pole-2.jpg");
        image1.setClassName("image");
        Span title2 = new Span("University Entrance Exam Q & A: Energy");
        title2.setClassName("rightcontent-title");
        Span text2 = new Span("Energy(Potential, Kinetic and Mechanical. We provide answers to the past " +
                "University Exam questions.");
        text2.setClassName("rightcontent-text");
        rightBottomContent.add(image1,title2,text2);

        Span seeAll = new Span("See All");
        seeAll.setClassName("see-all");
        rightTop.add(recommend,hr1,rightTopContent,hr2,rightBottomContent,seeAll);

        Div rightBottom = new Div();
        rightBottom.setClassName("right-bottom");
        Div recommend2 = new Div();
        recommend2.setClassName("recommend");
        Span span2 = new Span("Organization to follow");
        span2.setClassName("second-title");
        Icon icon2 = new Icon(VaadinIcon.ELLIPSIS_DOTS_H);
        icon2.setClassName("licon");
        recommend2.add(span2,icon2);

        Div rightContent1 = new Div();
        rightContent1.setClassName("right-content1");
        Avatar avatar = new Avatar();
        avatar.setImage("/images/avatar1.png");
        avatar.setClassName("avatar");
        Div innerRightContent1 = new Div();
        innerRightContent1.setClassName("innerright-content1");
        Span rightSpan1 = new Span("FUNAAB");
        rightSpan1.setClassName("rightspan1");
        Span lowRightSpan1 = new Span("school");
        lowRightSpan1.setClassName("lowrightspan1");
        innerRightContent1.add(rightSpan1,lowRightSpan1);

        rightContent1.add(avatar,innerRightContent1);

        rightBottom.add(recommend2);

        rightContainer.add(rightTop,rightBottom);
        return rightContainer;
    }
}
