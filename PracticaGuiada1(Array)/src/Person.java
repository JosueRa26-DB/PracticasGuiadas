public class Person {
    private String name;
    private int age;
    private PetManager petManager;

    public Person() {

    }

    public Person(String name, int age, int numbersOfPets) {
        this.name = name;
        this.age = age;
        this.petManager = new PetManager(numbersOfPets);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.petManager = new PetManager(3);

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public PetManager getPetManager() {
        return petManager;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPetManager(PetManager petManager) {
        this.petManager = petManager;
    }

    // metodo que recibe un pet y llama el petManager para agregarlo al arreglo
    public boolean addPet(Pet pet) {
        return petManager.addPet(pet);
    }

    public boolean removePet(Pet pet) {
        return petManager.removePet(pet);
    }

    public Pet[] getPets(){
        return petManager.getPets();
    }
    
    public boolean updatePet(Pet pet , int index){
        return petManager.updatePets(pet, index);
    }

}
