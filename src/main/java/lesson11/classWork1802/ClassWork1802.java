package lesson11.classWork1802;

import lesson11.model.Clothes;

import java.util.Scanner;

public class ClassWork1802 {
        private final static int CLOTHES_FACTORY_TYPE = 1;
        private final static int FURNITURE_FACTORY_TYPE = 2;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int type = 0;
            int value = 0;
            System.out.println("What Factory you need create:\n1 - For ClothesFactory\n2 - For FurnitureFactory");
            int factoryType = scanner.nextInt();

            if (factoryType == CLOTHES_FACTORY_TYPE) {
                ClothesFactory clothesFactory = new ClothesFactory();
                System.out.println("What type of clothes you need:\n1 - For Dress\n2 - For Shirt");
                type = scanner.nextInt();

                System.out.println("How many clothes you need?");
                value = scanner.nextInt();

                Clothes[] clothes = clothesFactory.createClothes(type, value);
                System.out.println("Clothes length is: " + clothes.length);

            } else if (factoryType == FURNITURE_FACTORY_TYPE) {
                //TODO: Implement at home
            }
        }
    }

