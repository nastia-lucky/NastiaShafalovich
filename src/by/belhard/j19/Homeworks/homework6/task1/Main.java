package by.belhard.j19.Homeworks.homework6.task1;

public class Main {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.play();

        Kitty k = new Kitty();
        k.play();

        Dog d = new Dog();
        d.play();

        Human h1 = new Human(f);
        h1.playWithOwnPet();

        h1.playWithAnyPet(k);
    }


}
