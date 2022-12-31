import java.util.Scanner;

//LOGICALL OPERATORS
public class logical {
    public class Main {
        public static void main(String[] args) {
            ;
            boolean hasaHighIncome = false;
            boolean hasGoodCredit = true;
            System.out.println(hasaHighIncome || hasGoodCredit);
        }
    }

    public static void main(String[] args) {
        ;
        int temp = 4;
        if (temp > 30)
            System.out.println("It's a hot day");
        else if (temp > 20) {
            System.out.println("it's a nice day");
        } else
            System.out.println("it's cold");
    }

    public class Main {
        public static void main(String[] args) {
            ;
            int income = 120_000;
            boolean hasHighIncome = (income > 100_000);
            System.out.println(hasHighIncome);
        }
    }

    public class happy {
        public static void main(String[] args) {
            ;
            int income = 120_000;
            String className;
            if (income > 100_000)
                System.out.println("first");
            else
                System.out.println("economy");
        }

        public class Main {
            public static void main(String[] args) {
                ;
                int income = 120_000;
                String className = income > 100_000 ? "first" : "economy";
                System.out.println(className);//TERNARY OPERATOR
//IF STATMENT
                class dictator {
                    public static void main(String[] args) {
                        ;
                        String roll = "Admin";
                        if (roll == "Admin")
                            System.out.println("you are admin");
                        else if (roll == "Moderator") {
                            System.out.println("you are Moderator");
                        } else
                            System.out.println("you are a guest");
//SWITCH STATMENENT
                        class unitary {
                            public static void main(String[] args) {
                                String roll = "Admin";
                                switch (roll) {
                                    case ("Admin"):
                                        ;
                                        System.out.println("you are admin");
                                        break;
                                    case ("Moderator"):
                                        ;
                                        System.out.println("you are Moderator");
                                        break;
                                    default:
                                        System.out.println("you are a guest");
                                }
                            }
                        }
//getting input from user
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Number: ");
                        int number = scanner.nextInt();
                        if ((number % 5 == 0 && number % 3 == 0)) {
                            System.out.println("Fizzbuzz");
                        } else if (number % 3 == 0) {
                            System.out.println("Buzz");
                        } else if (number % 5 == 0) {
                            System.out.println("Fizz");
                        } else {
                            System.out.println(number);
                        }
// FOR LOOP
                        for (int i = 5; i > 0; i--)
                            System.out.println("HELLO WORLD" + i);
                        //while loop
                        int i = 0;
                        while (i > 0) ;
                        {
                            System.out.println("HELLO WORLD" + i);
                        }
                        i--;
                    }
                }
            }
        }
    }
}