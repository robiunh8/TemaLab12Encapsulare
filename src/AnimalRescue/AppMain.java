package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Animal cusi= new Animal();
        cusi.setAge(1);
        cusi.setName("Cusi");
        cusi.setFavoriteActivity("Running in the park");
        cusi.setFavoriteFOOD("bones");
        cusi.setHealthState(10);
        cusi.setHappinessLevel(10);
        cusi.setHungerLevel(5);
        System.out.println("The animal's name is: "+ cusi.getName());
        System.out.println("It has "+ cusi.getAge() +" year");
        System.out.println("It's health state is "+ cusi.getHealthState());
        System.out.println("On a scale from 1 to 10 it's hunger level is: "+ cusi.getHungerLevel());
        System.out.println("It's happiness level is: "+ cusi.getHappinessLevel());
        System.out.println("It's favorite food is "+ cusi.getFavoriteFOOD());
        System.out.println(cusi.getFavoriteActivity() +" is it's favorite activity");


        Adopter gesi= new Adopter();
        gesi.setNameofAdopter("Gesi");
        gesi.setMoneyforanimal(150);
        System.out.println(cusi.getName() +" is adopted by "+gesi.getNameofAdopter());
        System.out.println(gesi.getNameofAdopter()+" paid "+gesi.getMoneyforanimal()+" lei for it's vaccination");


        AnimalFood animalFood= new AnimalFood();
        animalFood.setFoodAvailable(18);
        animalFood.setPriceOfFood(10);
        animalFood.setQuantityOfFood(20);
        animalFood.setNameOfAnimalFood("kibble");
        System.out.println("It ate a little bowl of "+ animalFood.getNameOfAnimalFood() +" today");
        System.out.println("The price for a bag of "+ animalFood.getNameOfAnimalFood() +" is "+ animalFood.getPriceOfFood() +" lei");
        System.out.println("There are "+ animalFood.getQuantityOfFood());
        System.out.println("The remainder of "+ animalFood.getNameOfAnimalFood() +" is "+ animalFood.getFoodAvailable());


        RecreationalActivity walk= new RecreationalActivity();
        walk.setNameofRecActivity("going for a walk");
        System.out.println("Tommorrow it is "+walk.getNameofRecActivity());


        Veterinarian vet= new Veterinarian();
        vet.setNameOfVet("Bob");
        vet.setVetSpecialty("nutrition");
        System.out.println("The vet's name is "+vet.getNameOfVet());
        System.out.println("His specialty is in "+vet.getVetSpecialty());
    }
}
