package Lesson11H1;

public class VladList<T> {
    Content<T> name;
    int index;

    public VladList(int index, Content<T> name) {
        this.index = index;
        this.name = name;
    }

    public VladList(int index) {
        this.index = index;
    }

    public Content<T> getName() {
        return name;
    }

    public void setName(Content<T> name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "VladList{" +
                " " + name +
                "[" + index +
                ']';
    }
}
