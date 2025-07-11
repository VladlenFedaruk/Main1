package Lesson11HTask3;

public class VladList extends Content{
int index;

    public VladList(Content content, int index) {
        super(content);
        this.index=index;
    }

    public VladList() {
        super();
    }

    public Content getIndex(int index) {
        Content<String> content1 = new Content<>();
        content1.setContent("котики собачки");
        return  content1;
    }

    public void setIndex(Content content,int index) {
        this.index = index;
        this.content=content;

    }

    @Override
    public String toString() {
        return "{ "+content +
                ", index=" + index +
                '}';
    }

}

