package org.vaadin.example;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import javax.swing.*;
import java.awt.*;

@Route("view")
@StyleSheet("style/style.css")
public class View extends Div {

    public  View(){
        createNavbar();
        sideBar();
        activity();
        firstBody();
        secondBody();
        blankBody();
        bottomBody();
        loadMore();
        rightBody();
        rightBottomBody();
        footer();
    }



    public void createNavbar(){
        Div navBar = new Div();
        navBar.addClassName("nav-main");

        Div logo = new Div();
        logo.addClassName("rew3-icon");

        Div midContent = new Div();
        midContent.setClassName("nav-center");
        Icon icon = new Icon(VaadinIcon.SEARCH);
        icon.setClassName("search-btn");
        TextField textField = new TextField();
        textField.setClassName("search-text");
        textField.setPlaceholder("What would you like to learn?");
         midContent.add(icon,textField);

        Div leftContent = new Div();
        Icon bell = new Icon(VaadinIcon.BELL);
        bell.setClassName("bell");
        leftContent.add(bell);

        Div farLeftContent = new Div();
        farLeftContent.setClassName("far-left");
        Avatar avatar = new Avatar();
        avatar.setClassName("avatar");
        avatar.setImage("/images/avatar.png");
        Span span = new Span("Dami Soyombo");
        span.setClassName("av-name");
        Icon poly = new Icon(VaadinIcon.CARET_DOWN);
        poly.addClassName("poly");
        farLeftContent.add(avatar,span,poly);

        navBar.add(logo,midContent,leftContent,farLeftContent);
        add(navBar);
    }

    private void sideBar() {
        Div sideBar = new Div();
        sideBar.setClassName("side-bar");
        Div insideSideBar = new Div();
        insideSideBar.setClassName("inside-side");

        //activity feed
        Div activityFeed = new Div();
        activityFeed.addClassName("activity-feed");
        Icon bookmark = new Icon(VaadinIcon.BOOKMARK);
        bookmark.setClassName("bookmark");
        Span activitySpan = new Span("Activity Feed");
        activitySpan.setClassName("activity-span");
        Div circle = new Div();
        circle.setClassName("circle");
        Span num = new Span("10");
        num.setClassName("num");

        activityFeed.add(bookmark,activitySpan,circle,num);

        //My courses
        Div courses = new Div();
        courses.addClassName("courses");
        Icon coursesIcon = new Icon(VaadinIcon.YOUTUBE_SQUARE);
        coursesIcon.setClassName("coursesIcon");
        Span coursesSpan = new Span("My Courses");
        coursesSpan.setClassName("coursesSpan");
        courses.add(coursesIcon,coursesSpan);

        //Explore
        Div explore = new Div();
        explore.addClassName("explore");
        Icon exploreIcon = new Icon(VaadinIcon.PLUS);
        exploreIcon.setClassName("exploreIcon");
        Span exploreSpan = new Span("Explore");
        exploreSpan.setClassName("exploreSpan");
        explore.add(exploreIcon,exploreSpan);

        //Schools
        Div schools = new Div();
        schools.addClassName("schools");
        Icon schoolIcon = new Icon(VaadinIcon.STORAGE);
        schoolIcon.setClassName("schoolIcon");
        Span schoolSpan = new Span("Schools");
        schoolSpan.setClassName("schoolSpan");
        schools.add(schoolIcon,schoolSpan);

        //My profile
        Div profile = new Div();
        profile.addClassName("profile");
        Icon profileIcon = new Icon(VaadinIcon.USER);
        profileIcon.setClassName("profileIcon");
        Span profileSpan = new Span("My Profile");
        profileSpan.setClassName("profileSpan");
        profile.add(profileIcon,profileSpan);

        //Ticket Management
        Div ticket = new Div();
        ticket.addClassName("ticket");
        Icon ticketIcon = new Icon(VaadinIcon.TICKET);
        ticketIcon.setClassName("ticketIcon");
        Span ticketSpan = new Span("Ticket Management");
        ticketSpan.setClassName("ticketSpan");
        ticket.add(ticketIcon,ticketSpan);

        //Settings
        Div setting = new Div();
        setting.addClassName("setting");
        Icon settingIcon = new Icon(VaadinIcon.COG);
        settingIcon.setClassName("settingIcon");
        Span settingSpan = new Span("Settings");
        settingSpan.setClassName("settingSpan");
        setting.add(settingIcon,settingSpan);

        //Logout
        Div logout = new Div();
        logout.addClassName("logout");
        Icon logoutIcon = new Icon(VaadinIcon.EXIT);
        logoutIcon.setClassName("logoutIcon");
        Span logoutSpan = new Span("Logout");
        logoutSpan.setClassName("logoutSpan");
        logout.add(logoutIcon,logoutSpan);


        insideSideBar.add(activityFeed,courses,explore,schools,profile,ticket,setting,logout);

        sideBar.add(insideSideBar);
        add(sideBar);
    }

    private void activity() {
        Div actDiv = new Div();
        Span span = new Span("ACTIVITY FEED");
        span.setClassName("activity");
        actDiv.add(span);

        Div filter = new Div();
        Icon filterIcon = new Icon(VaadinIcon.BULLETS);
        filterIcon.setClassName("filterIcon");
        Span filterSpan = new Span("Filter");
        filterSpan.setClassName("filterSpan");
        filter.add(filterIcon,filterSpan);

        add(actDiv,filter);
    }

    private void firstBody(){
        Div body = new Div();
        body.setClassName("first-body");
        Div title = new Div();
        title.setClassName("firstbody-title");
        Avatar avatar = new Avatar();
        avatar.setImage("/images/avatar.png");
        avatar.setClassName("firstbody-avatar");
        Span titleSpan = new Span("Title");
        titleSpan.setClassName("firstbody-titlespan");
        Span enterText = new Span("Enter text here...");
        enterText.setClassName("firstbody-entertext");
        title.add(avatar,titleSpan,enterText);

        Hr hr = new Hr();
        hr.setClassName("hr");

        Div postDiv = new Div();
        postDiv.setClassName("post-div");
        Icon icon1 = new Icon(VaadinIcon.PICTURE);
        icon1.setClassName("icon1");
        Icon icon2 = new Icon(VaadinIcon.YOUTUBE);
        icon2.setClassName("icon2");
        Icon icon3 = new Icon(VaadinIcon.LOCATION_ARROW_CIRCLE);
        icon3.setClassName("icon3");
        Icon icon4 = new Icon(VaadinIcon.ELLIPSIS_DOTS_H);
        icon4.setClassName("icon4");
        Icon icon5 = new Icon(VaadinIcon.SMILEY_O);
        icon5.setClassName("icon5");
        Button post = new Button("POST");
        post.setClassName("btn-post");
        postDiv.add(icon1,icon2,icon3,icon4,icon5,post);

        body.add(title,hr,postDiv);
        add(body);
    }

    private void secondBody(){
        Div body = new Div();
        body.setClassName("second-body");
        Div topBody = new Div();
        topBody.setClassName("top-body");
        Avatar secondBodyAvatar = new Avatar();
        secondBodyAvatar.setImage("/images/avatar.png");
        secondBodyAvatar.setClassName("secondbody-avatar");
        Span name = new Span("Dami Soyombo");
        name.setClassName("secondbody-name");
        Span days = new Span("4 days ago");
        days.setClassName("secondbody-days");
        topBody.add(secondBodyAvatar,name,days);

        Hr hr = new Hr();
        hr.setClassName("secondbody-hr");

        Div secondBodyCenter = new Div();
        secondBodyCenter.setClassName("secondbody-center");
        Span secondBodyHead = new Span("Congratulation to Hamoye Data Science Internship Stage C Winners!");
        secondBodyHead.setClassName("secondbody-head");
        Span secondBodyText = new Span("The collapse of the online-advertising market in 2001 made marketing " +
                "on the internet seem even less compelling. Website usability, press releases");
        secondBodyText.setClassName("secondbody-text");
        secondBodyCenter.add(secondBodyHead,secondBodyText);

        Hr secondHr = new Hr();
        secondHr.setClassName("second-hr");

        Div secondBodyBottom = new Div();
        secondBodyBottom.setClassName("secondbody-bottom");
        Icon icon1= new Icon(VaadinIcon.HEART);
        icon1.setClassName("secondbottom-icon1");
        Span span1 = new Span("Like 30");
        span1.setClassName("secondbottom-span1");
        Icon icon2 = new Icon(VaadinIcon.COMMENT);
        icon2.setClassName("secondbottom-icon2");
        Span span2 = new Span("Comment");
        span2.setClassName("secondbottom-span2");
        Icon icon3 = new Icon(VaadinIcon.SHARE);
        icon3.setClassName("secondbottom-icon3");
        Span span3 = new Span("34");
        span3.setClassName("secondbottom-span3");
        Span span4 = new Span("Reply");
        span4.setClassName("secondbottom-span4");
        secondBodyBottom.add(icon1,span1,icon2,span2,icon3,span3,span4);


        body.add(topBody,hr,secondBodyCenter,secondHr,secondBodyBottom);
        add(body);
    }
    private void blankBody(){
        Div blankDiv = new Div();
        blankDiv.setClassName("blankbody");

        add(blankDiv);
    }

    private  void bottomBody(){
        Div bottomBody = new Div();
        bottomBody.setClassName("bottom-body");
        Div bottomFirst = new Div();
        bottomFirst.setClassName("bottombody-first");
        Avatar bottomBodyAvatar = new Avatar("H");
        bottomBodyAvatar.setClassName("bottombody-avatar");
        Span bottomBodySpan1 = new Span("Hamoya Team");
        bottomBodySpan1.setClassName("bottombody-span1");
        Span bottomBodySpan2 = new Span("4 days ago");
        bottomBodySpan2.setClassName("bottombody-span2");
        bottomFirst.add(bottomBodyAvatar,bottomBodySpan1,bottomBodySpan2);

        Hr bottomHr = new Hr();
        bottomHr.setClassName("bottom-hr");
        Div bottomDiv = new Div();
        bottomDiv.setClassName("bottom-div");
        Span bottomSpan = new Span("A new course titled STEM + CHALLENGED has been added to the course library");
        bottomSpan.setClassName("bottom-span");
        bottomDiv.add(bottomSpan);

        bottomBody.add(bottomFirst,bottomHr,bottomDiv);
        add(bottomBody);
    }

    private void loadMore(){
        Icon loadMore = new Icon(VaadinIcon.ARROW_CIRCLE_DOWN);
        loadMore.setClassName("loadmore");

        add(loadMore);
    }

    private  void rightBody(){
        Div rightBody = new Div();
        rightBody.setClassName("rightbody");
        Span rightbodySpan1 = new Span("Recommended Courses");
        rightbodySpan1.setClassName("rightbody-span1");
        Icon rightbodyIcon1 = new Icon(VaadinIcon.ELLIPSIS_DOTS_H);
        rightbodyIcon1.setClassName("rightbody-icon1");
        Hr rightBodyHr = new Hr();
        rightBodyHr.setClassName("rightbody-hr");

        Div rightBodyTop = new Div();
        rightBodyTop.setClassName("rightbody-top");
        Image image1 = new Image();
        image1.setClassName("rightbody-image1");
        image1.setSrc("/images/bulb.jpg");
        Span rightBodyHead1= new Span("University Entrance Exam Q&A:Energy");
        rightBodyHead1.setClassName("rightbody-head1");
        Span rightBodyPara1 = new Span("Energy(Potential, Kinetic and Mechanical).We " +
                "provide answered questions from actual past University entrance examinations.");
        rightBodyPara1.setClassName("rightbody-para1");
        rightBodyTop.add(image1,rightBodyHead1,rightBodyPara1);

        Hr rightBodyHr2 = new Hr();
        rightBodyHr2.setClassName("rightbody-hr2");

        Div rightBodybottom = new Div();
        rightBodybottom.setClassName("rightbody-bottom");
        Image image2 = new Image();
        image2.setClassName("rightbody-image2");
        image2.setSrc("/images/electric-pole-2.jpg");
        Span rightBodyHead2= new Span("University Entrance Exam Q&A:Energy");
        rightBodyHead2.setClassName("rightbody-head2");
        Span rightBodyPara2 = new Span("We provide answered questions from actual past university" +
                "examinations, with explanatory hints for all answer choices");
        rightBodyPara2.setClassName("rightbody-para2");
        rightBodybottom.add(image2,rightBodyHead2,rightBodyPara2);

        Span rightBottomText = new Span("see all");
        rightBottomText.setClassName("rightbottom-text");

        rightBody.add(rightbodySpan1,rightbodyIcon1,rightBodyHr,rightBodyTop,rightBodyHr2,rightBodybottom,rightBottomText);

        add(rightBody);
    }
    private void rightBottomBody(){
        Div rightBottomBody = new Div();
        rightBottomBody.setClassName("right-bottombody");

        Div topDiv = new Div();
        topDiv.setClassName("top-div");
        Span topDivSpan = new Span("Organizations to follow");
        topDivSpan.setClassName("topdiv-span");
        Icon topDivIcon = new Icon(VaadinIcon.ELLIPSIS_DOTS_H);
        topDivIcon.setClassName("topdiv-icon");
        topDiv.add(topDivSpan,topDivIcon);

        Div bottomDiv = new Div();
        bottomDiv.setClassName("bottomdiv");

        //DIV 1
        Div bottomDiv1 = new Div();
        bottomDiv1.setClassName("bottom-firstdiv1");
        Avatar bfirstDivAvatar1 = new Avatar();
        bfirstDivAvatar1.setImage("/images/avatar2.png");
        bfirstDivAvatar1.setClassName("bfirstdiv-avatar1");
        Span bFirstDivSpan1 = new Span("FUNAAB");
        bFirstDivSpan1.setClassName("bfirstdiv-span1");
        Span bSecondDivSpan1 = new Span("School");
        bSecondDivSpan1.setClassName("bseconddiv-span1");
        Icon bFirstIcon1 = new Icon(VaadinIcon.PLUS_CIRCLE_O);
        bFirstIcon1.setClassName("b-icon1");

        bottomDiv1.add(bfirstDivAvatar1,bFirstDivSpan1,bSecondDivSpan1,bFirstIcon1);

        //DIV 2
        Div bottomDiv2 = new Div();
        bottomDiv2.setClassName("bottom-firstdiv2");
        Avatar bfirstDivAvatar2 = new Avatar();
        bfirstDivAvatar2.setImage("/images/avatar2.png");
        bfirstDivAvatar2.setClassName("bfirstdiv-avatar2");
        Span bFirstDivSpan2 = new Span("LearnHub");
        bFirstDivSpan2.setClassName("bfirstdiv-span2");
        Span bSecondDivSpan2 = new Span("Organization");
        bSecondDivSpan2.setClassName("bseconddiv-span2");
        Icon bFirstIcon2 = new Icon(VaadinIcon.PLUS_CIRCLE_O);
        bFirstIcon2.setClassName("b-icon2");

        bottomDiv2.add(bfirstDivAvatar2,bFirstDivSpan2,bSecondDivSpan2,bFirstIcon2);

        //DIV 3
        Div bottomDiv3 = new Div();
        bottomDiv3.setClassName("bottom-firstdiv3");
        Avatar bfirstDivAvatar3 = new Avatar();
        bfirstDivAvatar3.setImage("/images/avatar2.png");
        bfirstDivAvatar3.setClassName("bfirstdiv-avatar3");
        Span bFirstDivSpan3 = new Span("OUA");
        bFirstDivSpan3.setClassName("bfirstdiv-span3");
        Span bSecondDivSpan3 = new Span("School");
        bSecondDivSpan3.setClassName("bseconddiv-span3");
        Icon bFirstIcon3 = new Icon(VaadinIcon.CHECK);
        bFirstIcon3.setClassName("b-icon3");

        bottomDiv3.add(bfirstDivAvatar3,bFirstDivSpan3,bSecondDivSpan3,bFirstIcon3);

        //DIV 4
        Div bottomDiv4 = new Div();
        bottomDiv4.setClassName("bottom-firstdiv4");
        Avatar bfirstDivAvatar4 = new Avatar();
        bfirstDivAvatar4.setImage("/images/avatar2.png");
        bfirstDivAvatar4.setClassName("bfirstdiv-avatar4");
        Span bFirstDivSpan4 = new Span("OOU");
        bFirstDivSpan4.setClassName("bfirstdiv-span4");
        Span bSecondDivSpan4 = new Span("School");
        bSecondDivSpan4.setClassName("bseconddiv-span4");
        Icon bFirstIcon4 = new Icon(VaadinIcon.CHECK);
        bFirstIcon4.setClassName("b-icon1");

        bottomDiv4.add(bfirstDivAvatar4,bFirstDivSpan4,bSecondDivSpan4,bFirstIcon4);

        //DIV 5
        Div bottomDiv5 = new Div();
        bottomDiv5.setClassName("bottom-firstdiv5");
        Avatar bfirstDivAvatar5 = new Avatar();
        bfirstDivAvatar5.setImage("/images/avatar2.png");
        bfirstDivAvatar5.setClassName("bfirstdiv-avatar5");
        Span bFirstDivSpan5 = new Span("UNILAG");
        bFirstDivSpan5.setClassName("bfirstdiv-span5");
        Span bSecondDivSpan5 = new Span("School");
        bSecondDivSpan5.setClassName("bseconddiv-span5");
        Icon bFirstIcon5 = new Icon(VaadinIcon.PLUS_CIRCLE_O);
        bFirstIcon5.setClassName("b-icon5");

        bottomDiv5.add(bfirstDivAvatar5,bFirstDivSpan5,bSecondDivSpan5,bFirstIcon5);

        //DIV 6
        Div bottomDiv6 = new Div();
        bottomDiv6.setClassName("bottom-firstdiv6");
        Avatar bfirstDivAvatar6 = new Avatar();
        bfirstDivAvatar6.setImage("/images/avatar2.png");
        bfirstDivAvatar6.setClassName("bfirstdiv-avatar6");
        Span bFirstDivSpan6 = new Span("TALENTRISE");
        bFirstDivSpan6.setClassName("bfirstdiv-span6");
        Span bSecondDivSpan6 = new Span("Organization");
        bSecondDivSpan6.setClassName("bseconddiv-span6");
        Icon bFirstIcon6 = new Icon(VaadinIcon.PLUS_CIRCLE_O);
        bFirstIcon6.setClassName("b-icon6");

        bottomDiv6.add(bfirstDivAvatar6,bFirstDivSpan6,bSecondDivSpan6,bFirstIcon6);


        bottomDiv.add(bottomDiv1,bottomDiv2,bottomDiv3,bottomDiv4,bottomDiv5,bottomDiv6);
        rightBottomBody.add(topDiv,bottomDiv);
        add(rightBottomBody);
    }

    private void footer(){
        Div footer = new Div();
        footer.setClassName("footer");
        Span footerSpan = new Span("© 2020 Hamoye");
        footerSpan.setClassName("footer-span");

        Div footerCenter = new Div();
        footerCenter.setClassName("footer-center");
        Avatar av1 = new Avatar();
        av1.setClassName("avatar-1");
        av1.setImage("/images/twitter.png");
        Avatar av2 = new Avatar();
        av2.setClassName("avatar-2");
        av2.setImage("/images/instagram.png");
        Avatar av3 = new Avatar();
        av3.setClassName("avatar-3");
        av3.setImage("/images/facebook.png");
        footerCenter.add(av1,av2,av3);

        Div footerRight = new Div();
        footerRight.setClassName("footer-right");
        Span footerSpan1 = new Span("Help");
        footerSpan1.setClassName("footer-span1");
        Span footerSpan2 = new Span("Contact");
        footerSpan2.setClassName("footer-span2");
        Span footerSpan3 = new Span("Privacy Policy");
        footerSpan3.setClassName("footer-span3");
        Span footerSpan4 = new Span("Terms of Use");
        footerSpan4.setClassName("footer-span4");
        footerRight.add(footerSpan1,footerSpan2,footerSpan3,footerSpan4);

        footer.add(footerSpan,footerCenter,footerRight);
        add(footer);
    }
}
