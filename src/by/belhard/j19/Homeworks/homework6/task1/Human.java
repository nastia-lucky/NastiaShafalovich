package by.belhard.j19.Homeworks.homework6.task1;

public class Human {

    private Pet ownPet;

    public Human(Pet ownPet) {
        this.ownPet = ownPet;
    }

    public void playWithOwnPet() {
        ownPet.play();
    }

    public void playWithAnyPet(Pet pet) {
        pet.play();
    }
}
