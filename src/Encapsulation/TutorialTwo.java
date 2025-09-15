package Encapsulation;

class Lindokuhle{
    private int age;
    private String name;

    public void setAge(int a){
        age=a;
    }

    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }




}

public class TutorialTwo {
    public static void main(String[] args) {
        Lindokuhle lee = new  Lindokuhle();
       lee.setAge(10);
       lee.setName("Lindo");
       System.out.println(lee.getName()+" "+lee.getAge());

    }
}
