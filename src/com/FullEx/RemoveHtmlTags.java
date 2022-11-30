package com.FullEx;

public class RemoveHtmlTags {
    public static void main(String[] args) {
        String textmsg="<p>I don't want this p tag<\\p>";
        System.out.println(textmsg);
        textmsg=textmsg.replaceAll("\\<,*@#\\>","");
        System.out.println(textmsg);
    }
}
