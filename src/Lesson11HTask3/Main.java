package Lesson11HTask3;

public class Main {
    public static void main(String[] args) {
        Content<String> string = new Content<>("kot");
        Content<Integer> int1 = new Content<>(2);
        System.out.println(string);
        string.setContent("vlad");
        System.out.println(string);
        int1.setContent(5);
        VladList vl = new VladList(string, 1 );
        vl.setIndex(string,2);
        System.out.println(vl);
        VladList vl2 = new VladList(string, 3 );
        System.out.println(vl2.getIndex(3));
        VladList vl3 = new VladList();
       vl2.getIndex(7);
System.out.println(vl2);
    }
}
