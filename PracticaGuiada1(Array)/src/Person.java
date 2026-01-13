public class Person {
    private String name;
    private int age;
    private PetManager petManager;

    public Person() {
        
    }

    public Person(String name, int age, int numbersOfPets, PetManager petManager) {
        this.name = name;
        this.age = age;
        this.petManager = petManager;
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

    public boolean addPet(Pet pet){
        return petManager.addPet(pet);
    }
    
}
