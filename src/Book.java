public class Book implements Displayadle{
    String name;
    String author;
    int data;

    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setData(int data){
        this.data = data;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getData(){
        return this.data;
    }

    @Override
    public void display() {
        System.out.println ("Инфо о книге: " +  getData () + " " + getName ()  + " " + getAuthor ());

    }
}
