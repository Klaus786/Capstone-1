/*
* Klaus Traubner 218009496
* 7 April 2022
* FoodDistributorFactory.java
* FoodDistributorFactory
* */

package za.ac.mycput.Factory;
import za.ac.mycput.Entity.FoodDistributor;

public class FoodDistributorFactory {

    public static FoodDistributor buildfoodDistributor   (String Name,
                                                          String Address,
                                                          long distributionNo)
    {
        return new FoodDistributor.Builder()
                .Name(Name)
                .Address(Address)
                .distributorNo(distributionNo)
                .build();
    }

    public static FoodDistributor.Builder copyFromFoodDistributor(FoodDistributor foodDistributor){
        return new FoodDistributor.Builder().copy(foodDistributor);
    }

}
