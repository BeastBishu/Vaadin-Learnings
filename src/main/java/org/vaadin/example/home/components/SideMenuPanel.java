package org.vaadin.example.home.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.RouterLink;

public class SideMenuPanel extends Div {

    public SideMenuPanel(){

        this.setClassName("left");


        Div leftInner = new Div();
        leftInner.setClassName("left-inner");

        Div activityFeed = new Div();
        activityFeed.setClassName("left-items");
        activityFeed.addClassName("inner-items");
        RouterLink activityFeedAnchor = new RouterLink();
        Icon icon1 = new Icon(VaadinIcon.BOOKMARK);
        icon1.setClassName("icon-class");
        Span span1 = new Span("Activity Feed");
        span1.setClassName("feed");
        activityFeedAnchor.add(icon1,span1);
        activityFeedAnchor.setRoute(ActivityFeed.class);
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
        RouterLink myCoursesAnchor = new RouterLink();
        myCoursesAnchor.add(icon2,span2);
        myCoursesAnchor.setRoute(Btn1.class);
        myCourses.add(myCoursesAnchor);

        Div explore = new Div();
        explore.setClassName("left-items");
        explore.addClassName("inner-items");
        Icon icon3 = new Icon(VaadinIcon.PLUS);
        icon3.setClassName("icon-class");
        Span span3 = new Span("Explore");
        span3.setClassName("feed");
        RouterLink exploreAnchor = new RouterLink();
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
        this.add(leftInner);

    }
}
