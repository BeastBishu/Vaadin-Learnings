package org.vaadin.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.Route;
import org.apache.commons.io.input.TeeInputStream;

@Route("newweb")
@StyleSheet("style/style2.css")
public class WebResponsive extends Div {

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
        Span name = new Span("Dami Soyombo");
        name.setClassName("name");
        Icon poly = new Icon(VaadinIcon.CARET_DOWN);
        poly.setClassName("poly");
        accountInfo.add(noti,avatar,name,poly);



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
        Div leftDiv = new Div();
        leftDiv.setClassName("left");

        Div leftInner = new Div();
        leftInner.setClassName("left-inner");

        Div activityFeed = new Div();
        activityFeed.setClassName("left-items");
        activityFeed.addClassName("inner-items");
        Icon icon1 = new Icon(VaadinIcon.BOOKMARK);
        icon1.setClassName("icon-class");
        Span span1 = new Span("Activity Feed");
        span1.setClassName("feed");
        activityFeed.add(icon1,span1);

        Div myCourses = new Div();
        myCourses.setClassName("left-items");
        myCourses.addClassName("inner-items");
        Icon icon2 = new Icon(VaadinIcon.YOUTUBE_SQUARE);
        icon2.setClassName("icon-class");
        Span span2 = new Span("My Courses");
        span2.setClassName("feed");
        myCourses.add(icon2,span2);

        Div explore = new Div();
        explore.setClassName("left-items");
        explore.addClassName("inner-items");
        Icon icon3 = new Icon(VaadinIcon.PLUS);
        icon3.setClassName("icon-class");
        Span span3 = new Span("Explore");
        span3.setClassName("feed");
        explore.add(icon3,span3);

        Div schools = new Div();
        schools.setClassName("left-items");
        schools.addClassName("inner-items");
        Icon icon4 = new Icon(VaadinIcon.STORAGE);
        icon4.setClassName("icon-class");
        Span span4 = new Span("Schools");
        span4.setClassName("feed");
        schools.add(icon4,span4);

        Div myProfile = new Div();
        myProfile.setClassName("left-items");
        myProfile.addClassName("inner-items");
        Icon icon5 = new Icon(VaadinIcon.USER);
        icon5.setClassName("icon-class");
        Span span5 = new Span("My Profile");
        span5.setClassName("feed");
        myProfile.add(icon5,span5);

        Div ticketManagement = new Div();
        ticketManagement.setClassName("left-items");
        ticketManagement.addClassName("inner-items");
        Icon icon6 = new Icon(VaadinIcon.TICKET);
        icon6.setClassName("icon-class");
        Span span6 = new Span("Ticket Management");
        span6.setClassName("feed");
        ticketManagement.add(icon6,span6);

        Div settings = new Div();
        settings.setClassName("left-items");
        settings.addClassName("inner-items");
        Icon icon7 = new Icon(VaadinIcon.COG);
        icon7.setClassName("icon-class");
        Span span7 = new Span("Settings");
        span7.setClassName("feed");
        settings.add(icon7,span7);

        Div logout = new Div();
        logout.setClassName("left-items");
        logout.addClassName("inner-items");
        Icon icon8 = new Icon(VaadinIcon.EXIT);
        icon8.setClassName("icon-class");
        Span span8 = new Span("Logout");
        span8.setClassName("feed");
        logout.add(icon8,span8);


        leftInner.add(activityFeed,myCourses,explore,schools,myProfile,ticketManagement,settings,logout);
        leftDiv.add(leftInner);

        htmlFlex.add(leftDiv,centerDiv(),right());
        contentContainer.add(htmlFlex);
        bodyContainer.add(contentContainer);
        baseLayout.add(bodyContainer);
        return  baseLayout;
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
        Div firstContent = new Div();
        firstContent.setClassName("first-content");
        Div firstText = new Div();
        firstText.setClassName("firstcontent-entertext");
        Avatar avatar = new Avatar();
        avatar.setImage("/images/avatar.png");
        avatar.setClassName("avatar2");

        Div titleMainDiv = new Div();
        Div titleDiv = new Div();
        titleDiv.setClassName("title-div");
        Span title = new Span("Title");
        title.setClassName("firstcontent-title");
        titleDiv.add(title);
        Div textDiv = new Div();
        textDiv.setClassName("text-div");
        Span enterText = new Span("Enter text here...");
        enterText.setClassName("firstcontent-inputtext");
        textDiv.add(enterText);
        titleMainDiv.add(titleDiv,textDiv);
        firstText.add(avatar,titleMainDiv);

        Hr hr = new Hr();
        hr.setClassName("hr");

        Div firstDivLower = new Div();
        firstDivLower.setClassName("firstdiv-lower");
        Div leftContent = new Div();
        leftContent.setClassName("left-content");
        Icon licon1 = new Icon(VaadinIcon.PICTURE);
        licon1.setClassName("licon");
        Icon licon2 = new Icon(VaadinIcon.YOUTUBE);
        licon2.setClassName("licon");
        Icon licon3 = new Icon(VaadinIcon.MAP_MARKER);
        licon3.setClassName("licon");
        Icon licon4 = new Icon(VaadinIcon.ELLIPSIS_DOTS_H);
        licon4.setClassName("licon");
        leftContent.add(licon1,licon2,licon3,licon4);

        Div rightContent = new Div();
        rightContent.setClassName("right-content");
        Icon ricon1 = new Icon(VaadinIcon.SMILEY_O);
        ricon1.setClassName("licon");
        Button post = new Button("POST");
        post.setClassName("post-btn");
        rightContent.add(ricon1,post);


        firstDivLower.add(leftContent,rightContent);
        firstContent.add(firstText,hr,firstDivLower);

        Div secondContent = new Div();
        secondContent.setClassName("second-content");
        Div secondTopContent = new Div();
        secondTopContent.setClassName("secondtop-content");
        Div secondAvatarContent = new Div();
        secondAvatarContent.setClassName("second-avatarcontent");
        Avatar avatar1 = new Avatar();
        avatar1.setClassName("avatar2");
        avatar1.setImage("/images/avatar.png");
        secondAvatarContent.add(avatar1);

        Div avatarLeft = new Div();
        Div avName = new Div();
        Span name = new Span("Dami Soyombo");
        name.setClassName("dami");
        avName.add(name);
        Div daysAgo = new Div();
        daysAgo.setClassName("days-div");
        Span days = new Span("4 days ago");
        days.setClassName("days-text");
        daysAgo.add(days);
        avatarLeft.add(avName,daysAgo);
        secondTopContent.add(secondAvatarContent,avatarLeft);

        Hr hr2 = new Hr();
        hr2.setClassName("hr2");

        Div secondDetail = new Div();
        secondDetail.setClassName("second-detail");
        Div secondDetailTitle = new Div();
        Span secondTitle = new Span("Congratulation to Hamoya Data Science Internship Stage C Winners!");
        secondTitle.setClassName("second-title");
        secondDetailTitle.add(secondTitle);
        Div secondDetailText = new Div();
        secondDetailText.setClassName("seconddetail-div");
        Span secondText = new Span("The collapse of the online-advertising market in 2001" +
                "made marketing on the internet seem even less compelling. Website usability, press" +
                "releases");
        secondText.setClassName("second-text");
        secondDetailText.add(secondText);
        secondDetail.add(secondDetailTitle,secondDetailText);

        Hr hr3 = new Hr();
        hr3.setClassName("hr2");

        Div secondLower = new Div();
        secondLower.setClassName("second-lower");
        Div lowerContentLeft = new Div();
        lowerContentLeft.setClassName("lowercontent-left");
        Div lowerFirst = new Div();
        lowerFirst.setClassName("lowerfirst");
        Icon slIcon1 = new Icon(VaadinIcon.HEART);
        slIcon1.setClassName("licon");
        Span like = new Span("30 likes");
        like.setClassName("like-text");
        lowerFirst.add(slIcon1,like);
        Div lowerSecond = new Div();
        lowerSecond.setClassName("lowerfirst");
        Icon slIcon2 = new Icon(VaadinIcon.COMMENT);
        slIcon2.setClassName("licon");
        Span comment = new Span("Comment");
        comment.setClassName("like-text");
        lowerSecond.add(slIcon2,comment);
        Div lowerThird = new Div();
        lowerThird.setClassName("lowerfirst");
        Icon slIcon3 = new Icon(VaadinIcon.SHARE);
        slIcon3.setClassName("licon");
        Span share = new Span("34");
        share.setClassName("like-text");
        lowerThird.add(slIcon3,share);
        lowerContentLeft.add(lowerFirst,lowerSecond,lowerThird);
        Span reply = new Span("Reply");
        reply.setClassName("like-text");
        secondLower.add(lowerContentLeft,reply);

        secondContent.add(secondTopContent,hr2,secondDetail,hr3,secondLower);

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
        center.add(filter,firstContent,secondContent,midLower,lower);
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
