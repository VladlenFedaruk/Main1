package Lesson11H1;

public class Main {
    public static void main(String[] args) {
        Content<String> st1=new Content<>("хуй1");
        Content<String> st2=new Content<>("хуй2");
        Content<String> st3=new Content<>("хуй3");
        Content<String> st4=new Content<>("хуй4");
        VladList<String> vl1=new VladList<>(1,st1);
        VladList<String> vl2=new VladList<>(2,st2);
        VladList<String> vl3=new VladList<>(3,st3);
        VladList<String> vl4=new VladList<>(4,st4);
        System.out.println(vl1);
        System.out.println(vl2);
        System.out.println(vl3);
        System.out.println(vl4);
        System.out.println(vl4.name);
    }
}
