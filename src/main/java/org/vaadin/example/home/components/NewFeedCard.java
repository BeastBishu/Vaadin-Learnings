package org.vaadin.example.home.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextArea;

public class NewFeedCard extends Div {

    private Button postButton;
    private TextArea textArea;
    private String username;
    public NewFeedCard(String avatar, String authorName, String postTime,
                       String postHtmlData, boolean isFavorite, int favoriteCount, int shareCount) {
        username = authorName;
        this.setClassName("second-content");
        Div secondTopContent = new Div();
        secondTopContent.setClassName("secondtop-content");
        Div secondAvatarContent = new Div();
        secondAvatarContent.setClassName("second-avatarcontent");
        Avatar avatar1 = new Avatar();
        avatar1.setClassName("avatar2");
        avatar1.setImage(avatar);
        secondAvatarContent.add(avatar1);

        Div avatarLeft = new Div();
        Div avName = new Div();
        Span name = new Span(authorName);
        name.setClassName("dami");
        avName.add(name);
        Div daysAgo = new Div();
        daysAgo.setClassName("days-div");
        Span days = new Span(postTime);
        days.setClassName("days-text");
        daysAgo.add(days);
        avatarLeft.add(avName,daysAgo);
        secondTopContent.add(secondAvatarContent,avatarLeft);

        Hr hr2 = new Hr();
        hr2.setClassName("hr2");

        Div secondDetail = new Div();
        secondDetail.setClassName("second-detail");
        //Div secondDetailTitle = new Div();
        //Span secondTitle = new Span("Congratulation to Hamoya Data Science Internship Stage C Winners!");
        //secondTitle.setClassName("second-title");
        //secondDetailTitle.add(secondTitle);
        Div secondDetailText = new Div();
        secondDetailText.setClassName("seconddetail-div");
        Html secondText = new Html(postHtmlData);
        //secondText.getElement().getClassList().set("second-text", true);
        secondDetailText.add(secondText);
        secondDetail.add(/*secondDetailTitle,*/secondDetailText);

        Hr hr3 = new Hr();
        hr3.setClassName("hr2");
        this.add(secondTopContent,hr2,secondDetail,hr3, newsFeedCardOptionMenu(isFavorite, favoriteCount, shareCount));
    }
    private Component newsFeedCardOptionMenu(boolean isFavorite, int favoriteCount, int shareCount) {
        Div newsFeed = new Div();
        newsFeed.setClassName("second-lower");
        Div lowerContentLeft = new Div();
        lowerContentLeft.setClassName("lowercontent-left");
        Div lowerFirst = new Div();
        lowerFirst.setClassName("lowerfirst");
        Icon slIcon1 = new Icon(VaadinIcon.HEART);
        slIcon1.setClassName("licon");
        slIcon1.getStyle().set("color", "grey");
        if (isFavorite) slIcon1.setColor("red");
        slIcon1.addClickListener(e -> {
            if (slIcon1.getColor().equals("red")) {
                slIcon1.setColor("grey");

            } else {
                slIcon1.setColor("red");
            }
        });

        Span like = new Span(favoriteCount + " likes");
        like.setClassName("like-text");
        lowerFirst.add(slIcon1, like);
        Div lowerSecond = new Div();
        lowerSecond.setClassName("lowerfirst");

        Icon slIcon2 = new Icon(VaadinIcon.COMMENT);
        slIcon2.setClassName("licon");
        Span comment = new Span("Comment");
        comment.setClassName("like-text");
        lowerSecond.add(slIcon2, comment);
        lowerSecond.addClickListener(divClickEvent -> {
            Button postButton = new Button("Post comment");
            TextArea textArea = new TextArea();
            Div commentForm = createComment(postButton, textArea);
            this.add(commentForm);
            postButton.addClickListener(e -> {
                String commentText = textArea.getOptionalValue().orElse("");
                if(commentText.isEmpty()) {
                    Notification notification = new Notification("Invalid Comment");
                    notification.setDuration(5000);
                    notification.setOpened(true);
                    textArea.focus();
                } else {
                    Div allComments = new Div();
                    Avatar avatar = new Avatar();
                    avatar.setImage("/images/avatar.png");
                    Div nameAndComment = new Div();
                    Label user = new Label(username);
                    user.getStyle().set("font-family","Marker Felt, fantasy");
                    user.getStyle().set("font-weight","bold");
                    Label commentLabel = new Label(commentText);
                    commentLabel.getStyle().set("color","#404040");

                    nameAndComment.add(user,commentLabel);

                    nameAndComment.getStyle().set("display","flex");
                    nameAndComment.getStyle().set("flex-direction","column");
                    nameAndComment.getStyle().set("gap","9px");
                    nameAndComment.getStyle().set("padding","9px");
                    nameAndComment.getStyle().set("margin-left","10px");
                    nameAndComment.getStyle().set("justify-content","flex-start");
                    nameAndComment.getStyle().set("background","#EBF0F2");
                    nameAndComment.getStyle().set("border-radius","25px");

                    this.remove(commentForm);
                    allComments.add(avatar,nameAndComment);
                    allComments.getStyle().set("display","flex");
                    allComments.getStyle().set("width","auto");
                    allComments.getStyle().set("padding","5px");
                    allComments.getStyle().set("margin-top","5px");
                    allComments.getStyle().set("margin-left","20px");
                    allComments.getStyle().set("margin-right","20px");
                    allComments.getStyle().set("margin-bottom","5px");
                    allComments.getStyle().set("border","2px");
                    allComments.getStyle().set("border-radius","25px");
                    allComments.getStyle().set("border-color","#E5E1E1");
                    allComments.getStyle().set("border-style","solid");
                    allComments.getStyle().set("align-items","center");
                    this.add(allComments);


                }
            });

        });
        Div lowerThird = new Div();
        lowerThird.setClassName("lowerfirst");
        Icon slIcon3 = new Icon(VaadinIcon.SHARE);
        slIcon3.setClassName("licon");
        Span share = new Span(shareCount + "");
        share.setClassName("like-text");
        lowerThird.add(slIcon3, share);
        lowerContentLeft.add(lowerFirst, lowerSecond, lowerThird);
        Span reply = new Span("Reply");
        reply.setClassName("like-text");
        newsFeed.add(lowerContentLeft, reply);

        return newsFeed;

    }

    private Div createComment(Button postButton, TextArea textArea) {
        Div commentSection = new Div();

        textArea.setLabel("Write your comment...");
        textArea.setWidthFull();
        textArea.setHeight("100px");
        textArea.setPlaceholder("post your comment here...");

        postButton.getStyle().set("margin-top","10px");
        postButton.getStyle().set("margin-left","auto");

        commentSection.getStyle().set("display","flex");
        commentSection.getStyle().set("gap","10px");
        commentSection.getStyle().set("flex-direction","column");
        commentSection.getStyle().set("padding","20px");

        commentSection.add(textArea,postButton);
        return commentSection;
    }

    }

