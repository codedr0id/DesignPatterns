package com.BuilderDesignPattern;

import com.BuilderDesignPattern.builders.ConcreteHouseBuilder;
import com.BuilderDesignPattern.builders.ConstructionEngineer;
import com.BuilderDesignPattern.builders.HouseBuilder;
import com.BuilderDesignPattern.builders.PrefabricatedHouseBuilder;
import com.BuilderDesignPattern.model.House;
import org.junit.jupiter.api.Test;

public class ConstructionEngineerTest {
    @Test
    public void testConstructHouse() {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: " + houseA + "\n");

        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: " + houseB);
    }
}
