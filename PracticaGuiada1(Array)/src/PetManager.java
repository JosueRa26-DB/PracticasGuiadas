public class PetManager {
    private int petCount;
    private Pet[] arregloPet;

    public PetManager(int numbersOfPets) {
        this.arregloPet = new Pet[numbersOfPets];
        
    }
    public PetManager() {

    }

    public boolean addPet(Pet pet){
    for (int i = 0; i < arregloPet.length; i++) {
        if (arregloPet[i] == null) {
            arregloPet[i] = pet;
            petCount++;
            return true;
        }
    }
    return false;
    }
}
