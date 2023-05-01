abstract class Book {
    protected String title;

    public abstract void setTitle(String title);

    public String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    public void setTitle(String title) {
        this.title = title;
    }
}
public class Activity5 {
    public static void main(String[] args){
//Initialize title of the book
        String title = "Famous Five";
        //Create object for MyBook
        Book newNovel = new MyBook();
        //Set title
        newNovel.setTitle(title);

        //Print result
        System.out.println("The title is: " + newNovel.getTitle());

    }
}