public class PetManager {
    private int petCount = 0;
    private Pet[] pets;

    public PetManager(int numbersOfPets) {
        this.pets = new Pet[numbersOfPets];

    }

    public PetManager() {

    }

    public boolean addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                petCount++;
                return true;
            }
        }
        return false;
    }

    public boolean removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null && pets[i].equals(pet)) {

                // corre a la izq los elementos posteriores al eliminado por medio del for
                for (int j = i; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];

                }
                pets[pets.length - 1] = null;
                petCount--;
                return true;
            }

        }

        return false;
    }

    public boolean updatePets(Pet pet, int index) {
        if (index < 0 || index >= petCount) {
            return false;
        } else {
            pets[index] = pet;
            return true;

        }
    }

    public Pet[] getPets() {
        Pet[] petsList = new Pet[this.petCount];
        for (int i = 0; i < this.petCount; i++) {
            petsList[i] = this.pets[i];
        }
        return petsList;
    }

    public int getPetCount() {
        return petCount;
    }

    public void setArregloPet(Pet[] arregloPet) {
        this.pets = arregloPet;
    }

    public void setPetCount(int petCount) {
        this.petCount = petCount;
    }
}
