package com.iluwatar.query_object;

import java.util.Collection;

import static com.iluwatar.query_object.SimpleDatabase.initializeDataset;

public class App {
    public static void main(String[] args) {
        final SimpleDatabase<Kingdom> database = initializeDataset();

        final KingdomRepository<Kingdom> customerRepository = new KingdomRepository<>(database.entities);

        QueryObject<Kingdom> queryObject = new KingdomsWithTotalDefenseLessThan(110);
        Collection<Kingdom> resultCustomers = customerRepository.query(queryObject);
        for (Kingdom kingdom:resultCustomers){
            System.out.println(kingdom.getKingdomName() + " has less than 50 total defense power.\n");
        }

        queryObject = new KingdomsWithTotalStrengthLargerThan(30);
        resultCustomers = customerRepository.query(queryObject);
        for (Kingdom kingdom:resultCustomers){
            System.out.println(kingdom.getKingdomName() + " has more than 30 total strength.\n");
        }
    }


}
