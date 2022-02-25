package pt.capgemini.allanborges.restaurantapi;

import java.util.UUID;

public class TransactionIdGenerator {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }
}
