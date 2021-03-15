
package oop;

    public class HotDogRunner {
    public static void main(String[] args){
        HotDog h1 = new HotDog(101,0);
        HotDog h2 = new HotDog(102,0);
        HotDog h3 = new HotDog(103,0);
        h1.justSold();
        h1.display();
        h2.justSold();
        h2.display();
        h3.justSold();
        h3.justSold();
        h3.display();
    }
}
