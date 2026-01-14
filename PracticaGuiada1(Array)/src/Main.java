public class Main {
    public static void main(String[] args) {

        /*
         * int[] numbers = {10,20,30,40,50};
         * String[] fruits = new String[3];
         * 
         * System.out.println(numbers[2]);
         * System.out.println(fruits[2]); // da null porque no hay valores dentro del
         * arreglo en esa posicion
         * 
         * for (Pet pet : person.getPets()) {
         * System.out.println(pet.getPetName());
         * }
         */

        Person person = new Person("Josue", 18, 4);
        Pet pet1 = new Pet("ponky", "dog");
        Pet pet2 = new Pet("luna", "cat");

        // agregar mascotas
        if (person.addPet(pet1)) {
            IOManager.printMessage("dog added successfully");
        } else {
            IOManager.printMessage("Failed to add pet");
        }

        // mostrar los nombres de las mascotas
        for (Pet pet : person.getPetManager().getPets()) {
            if (pet != null) {
                IOManager.printMessage(pet.getPetName());
            }
        }

        // eliminar la mascota
        if (person.removePet(pet1)) {
            IOManager.printMessage("Pet removed successfully");
        } else {
            IOManager.printMessage("Failed to remove pet");
        }

        //Ver si hay mascotas en la lista y mostrar su nombre
        if (person.getPets().length == 0) {
            IOManager.printMessage("No fets found");
        } else {
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());

            }
        }

        //Se actualiza la mascota en el indice
        if (person.updatePet(pet2, 0)) {
            IOManager.printMessage("pet updated successfully"); 
        }else{
            IOManager.printMessage("Failed to update pet");

        }

          //Ver si hay mascotas en la lista y mostrar su nombre
        if (person.getPets().length == 0) {
            IOManager.printMessage("No fets found");
        } else {
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());

            }
        }

    }
}
