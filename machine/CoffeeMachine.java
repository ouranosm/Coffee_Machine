package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int money = 550;
        int cups = 9;
        boolean stop = false;

        //machineState(water, milk, beans, money, cups);

        while (stop == false) {

            //scanner.reset();

            System.out.println("Write action (buy, fill, take, remaining, exit): ");

            String choice = scanner.nextLine();
            //scanner.nextLine();
            boolean back = false;


            switch (choice) {
                case "buy":
                    while (back == false) {
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                        String c = scanner.nextLine();
                        //scanner.nextLine();
                        switch (c) {
                            case "1":
                                if (water >= 250 && beans >= 16 && cups >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water -= 250;
                                    beans -= 16;
                                    money += 4;
                                    cups -= 1;
                                } else if (water < 250) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (beans < 16) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                back = true;
                                break;

                            case "2":
                                if (water >= 350 && beans >= 20 && milk >= 75 && cups >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water -= 350;
                                    milk -= 75;
                                    beans -= 20;
                                    money += 7;
                                    cups -= 1;
                                } else if (water < 350) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (beans < 20) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                } else if (milk < 75) {
                                    System.out.println("Sorry, not enough milk!");
                                }
                                back = true;
                                break;

                            case "3":
                                if (water >= 200 && beans >= 12 && milk >= 100 && cups >= 1) {
                                    System.out.println("I have enough resources, making you a coffee!");
                                    water -= 200;
                                    milk -= 100;
                                    beans -= 12;
                                    money += 6;
                                    cups -= 1;
                                } else if (water < 200) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (beans < 12) {
                                    System.out.println("Sorry, not enough beans!");
                                } else if (cups < 1) {
                                    System.out.println("Sorry, not enough cups!");
                                } else if (milk < 100) {
                                    System.out.println("Sorry, not enough milk!");
                                }
                                back = true;
                                break;

                            case "back":
                                break;
                        }
                        break;
                    }breakS

                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add: ");
                    cups += scanner.nextInt();
                    scanner.nextLine();
                    break;

                case "take":
                    System.out.println("I gave you " + money + "$");
                    money = 0;
                    break;

                case "remaining":
                    machineState(water, milk, beans, money, cups);
                    break;

                case "exit":
                    stop = true;
                    break;
            }
        }

        //machineState(water, milk, beans, money, cups);
        //scanner.nextLine();
    }

    public static void printInstructions(int n) {
        System.out.println("For " + n + " cups of coffee you will need:");
        System.out.println(n * 200 + " ml of water");
        System.out.println(n * 50 + " ml of milk");
        System.out.println(n * 15 + " m of coffee beans");
    }

    public static void checkAvailability(int water, int milk, int beans, int n) {
        int a = Math.min(Math.min(water / 200, milk / 50), beans / 15);
        if (n == a) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (a > n) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (a - 1) + " more than that)");
        } else {
            System.out.println("No, I can make only " + a + " cup(s) of coffee");
        }
    }

    public static void machineState(int water, int milk, int beans, int money, int cups) {
        System.out.println("The coffee machine has:\n" +
                 + water + " ml of water\n" +
                + milk + " ml of milk\n" +
                + beans + " g of coffee beans\n" +
                + cups + " disposable cups\n" +
                "$" + money + " of money");
    }

    public static void enoughResources(int c, int water, int beans, int milk, int cups) {
        switch (c) {
            case 1:
                if (water >= 250 && beans >= 16 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                } else if(water < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if ( beans < 16) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                break;

            case 2:
                if (water >= 350 && beans >= 20 && milk >= 75 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                } else if(water < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if ( beans < 20) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                }
                break;

            case 3:
                if (water >= 200 && beans >= 12 && milk >= 100 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                } else if(water < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if ( beans < 12) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                }
                break;
        }
    }
}
