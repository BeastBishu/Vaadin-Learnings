package org.vaadin.example.home;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import jdk.Exported;
import org.vaadin.example.home.components.*;

import java.awt.*;



@PWA(name = "Vaadin",
        shortName = "CRM")
@Route("")
@StyleSheet("style/style2.css")
public class WebResponsive extends Div implements RouterLayout {

    Div center;
    Div myCoursesAnchor;
    Div activityFeedAnchor;
    Div exploreAnchor;
    public WebResponsive(){
        Div mainContainer = new Div();
        mainContainer.setClassName("main-container");
        mainContainer.add(createNavbar(),baseLayout());
        add(mainContainer);
    }

    private Component createNavbar() {
        Div navComponent = new Div();
        navComponent.setClassName("nav-component");
        Div mainNavContainer = new Div();
        mainNavContainer.setClassName("main-nav");
        Div mainHeader = new Div();
        mainHeader.setClassName("main-header");
        mainHeader.addClassName("main-flex");
        Div logo = new Div();
        Image logo1 = new Image();
        logo1.setSrc("/images/logo1.png");
        logo1.setClassName("logo");
        logo.add(logo1);
        Div searchBar = new Div();
        searchBar.setClassName("search-bar");
        Icon searchIcon = new Icon(VaadinIcon.SEARCH);
        searchIcon.setClassName("search-icon");
        Input searchInput = new Input();
        searchInput.setType("text");
        searchInput.setPlaceholder("What would you like to learn?");
        searchInput.setClassName("search-input");
        searchBar.add(searchIcon,searchInput);

        Div accountInfo = new Div();
        accountInfo.setClassName("account-info");
        Icon noti = new Icon(VaadinIcon.BELL);
        noti.setClassName("noti");
        Avatar avatar = new Avatar();
        avatar.setImage("/images/avatar.png");
        avatar.setClassName("avatar");
        MenuBar menuBar = new MenuBar();
        MenuItem profile = menuBar.addItem("Bishu KC");
        profile.getElement().getStyle().set("color","white");
        SubMenu dropdown = profile.getSubMenu();
        dropdown.addItem("Profile",menuItemClickEvent -> {
            Notification notification = Notification.show("Not Implemented");

        });
        dropdown.addItem("Settings",menuItemClickEvent -> {
            Notification.show("Not Implemented");
        });
        dropdown.addItem("Logout",menuItemClickEvent -> {
            Notification.show("Not Implemented");
        });
        accountInfo.add(noti,avatar,menuBar);



        mainHeader.add(logo,searchBar,accountInfo);
        mainNavContainer.add(mainHeader);
        navComponent.add(mainNavContainer);
        return  navComponent;
    }

    private Component baseLayout(){
        Div baseLayout = new Div();
        baseLayout.setClassName("base-layout");
        Div bodyContainer = new Div();
        bodyContainer.setClassName("body-container");
        Div contentContainer = new Div();
        contentContainer.setClassName("content-container");
        Div htmlFlex = new Div();
        htmlFlex.setClassName("html-flex");

        //left Div
//        SideMenuPanel sideMenuPanel = new SideMenuPanel();
        Div sideMenuPanel = new Div();
        sideMenuPanel.setClassName("left");
        Div leftInner = new Div();
        leftInner.setClassName("left-inner");

        Div activityFeed = new Div();
        activityFeed.setClassName("left-items");
        activityFeed.addClassName("inner-items");
        activityFeedAnchor = new Div();
        Icon icon1 = new Icon(VaadinIcon.BOOKMARK);
        icon1.setClassName("icon-class");
        Span span1 = new Span("Activity Feed");
        span1.setClassName("feed");
        activityFeedAnchor.add(icon1,span1);
        /*activityFeedAnchor.add(icon1,span1);
        activityFeedAnchor.setRoute(CenterDiv.class);*/
        activityFeed.add(activityFeedAnchor);

        Div myCourses = new Div();
        myCourses.setClassName("left-items");
        myCourses.addClassName("inner-items");
        Icon icon2 = new Icon(VaadinIcon.YOUTUBE_SQUARE);
        icon2.setClassName("icon-class");
        Span span2 = new Span("My Courses");
        span2.setClassName("feed");
        myCoursesAnchor = new Div();
        myCoursesAnchor.add(icon2,span2);
        myCourses.add(myCoursesAnchor);

        Div explore = new Div();
        explore.setClassName("left-items");
        explore.addClassName("inner-items");
        Icon icon3 = new Icon(VaadinIcon.PLUS);
        icon3.setClassName("icon-class");
        Span span3 = new Span("Explore");
        span3.setClassName("feed");
        exploreAnchor = new Div();
        exploreAnchor.add(icon3,span3);
        explore.add(exploreAnchor);

        Div schools = new Div();
        schools.setClassName("left-items");
        schools.addClassName("inner-items");
        Icon icon4 = new Icon(VaadinIcon.STORAGE);
        icon4.setClassName("icon-class");
        Span span4 = new Span("Schools");
        span4.setClassName("feed");
        RouterLink schoolsAnchor = new RouterLink();
        schoolsAnchor.add(icon4,span4);
        schools.add(schoolsAnchor);

        Div myProfile = new Div();
        myProfile.setClassName("left-items");
        myProfile.addClassName("inner-items");
        Icon icon5 = new Icon(VaadinIcon.USER);
        icon5.setClassName("icon-class");
        Span span5 = new Span("My Profile");
        span5.setClassName("feed");
        RouterLink myProfileAnchor = new RouterLink();
        myProfileAnchor.add(icon5,span5);
        myProfile.add(myProfileAnchor);

        Div ticketManagement = new Div();
        ticketManagement.setClassName("left-items");
        ticketManagement.addClassName("inner-items");
        Icon icon6 = new Icon(VaadinIcon.TICKET);
        icon6.setClassName("icon-class");
        Span span6 = new Span("Ticket Management");
        span6.setClassName("feed");
        RouterLink ticketManagementAnchor = new RouterLink();
        ticketManagementAnchor.add(icon6,span6);
        ticketManagement.add(ticketManagementAnchor);

        Div settings = new Div();
        settings.setClassName("left-items");
        settings.addClassName("inner-items");
        Icon icon7 = new Icon(VaadinIcon.COG);
        icon7.setClassName("icon-class");
        Span span7 = new Span("Settings");
        span7.setClassName("feed");
        RouterLink settingsAnchor = new RouterLink();
        settingsAnchor.add(icon7,span7);
        settings.add(settingsAnchor);

        Div logout = new Div();
        logout.setClassName("left-items");
        logout.addClassName("inner-items");
        Icon icon8 = new Icon(VaadinIcon.EXIT);
        icon8.setClassName("icon-class");
        Span span8 = new Span("Logout");
        span8.setClassName("feed");
        RouterLink logoutAnchor = new RouterLink();
        logoutAnchor.add(icon8,span8);
        logout.add(logoutAnchor);


        leftInner.add(activityFeed,myCourses,explore,schools,myProfile,ticketManagement,settings,logout);
        sideMenuPanel.add(leftInner);

        htmlFlex.add(sideMenuPanel,centerDiv());
        contentContainer.add(htmlFlex);
        bodyContainer.add(contentContainer);
        baseLayout.add(bodyContainer);
        return  baseLayout;
    }

    private Component centerDiv(){
        center = new Div();
        center.setClassName("center");
        myCoursesAnchor.addClickListener(divClickEvent -> {
            center.removeAll();
            center.add(centerDivForMyCourses());
        });
        activityFeedAnchor.addClickListener(divClickEvent -> {
            center.removeAll();
            center.add(centerDivForActivity());
        });
        exploreAnchor.addClickListener(divClickEvent -> {
            center.removeAll();
            center.add(centerDivForExplore());
        });
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

    private Div centerDivForActivity(){
        center = new Div();
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

    private Div centerDivForMyCourses(){
        center = new Div();
        center.setClassName("center");
        Div centerDivCourse = new Div();
        Label courseLabel = new Label("List of courses:");
        courseLabel.setClassName("courselabel");
        Label course1 = new Label("Programming");
        course1.setClassName("course1");
        Label course2= new Label("Physics");
        course2.setClassName("course1");
        Label course3 = new Label("Mathematics");
        course3.setClassName("course1");
        Label course4 = new Label("Art");
        course4.setClassName("course1");
        centerDivCourse.add(courseLabel,course1,course2,course3,course4);

        centerDivCourse.getStyle().set("padding","30px");
        centerDivCourse.getStyle().set("background","grey");
        centerDivCourse.getStyle().set("height","300px");
        centerDivCourse.getStyle().set("display","flex");
        centerDivCourse.getStyle().set("flex-direction","column");
        centerDivCourse.getStyle().set("gap","30px");
        centerDivCourse.getStyle().set("margin-left","30px");
        centerDivCourse.getStyle().set("align-items","center");

        center.add(centerDivCourse);
        return center;
    }

    private Div centerDivForExplore(){
        center = new Div();
        center.setClassName("center");
        Div centerDivCourse = new Div();
        Label courseLabel = new Label("Explore:");
        courseLabel.setClassName("courselabel");
        Label course1 = new Label("People");
        course1.setClassName("course1");
        Label course2= new Label("Culture");
        course2.setClassName("course1");
        Label course3 = new Label("Architect");
        course3.setClassName("course1");

        centerDivCourse.add(courseLabel,course1,course2,course3);

        centerDivCourse.getStyle().set("padding","30px");
        centerDivCourse.getStyle().set("background","grey");
        centerDivCourse.getStyle().set("height","300px");
        centerDivCourse.getStyle().set("display","flex");
        centerDivCourse.getStyle().set("flex-direction","column");
        centerDivCourse.getStyle().set("gap","30px");
        centerDivCourse.getStyle().set("margin-left","30px");
        centerDivCourse.getStyle().set("align-items","center");

        center.add(centerDivCourse);
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
