public class NumberInWord {

//Write the main method so that the JVM knows where to execute the code
    public static void main(String[] args) {

        printNumberInWord(9); //Expected outcome ==> NINE
        printNumberInWord(5); //Expected outcome ==> FIVE
        printNumberInWord(2); //Expected outcome ==> TWO
        printNumberInWord(-1); //Expected outcome ==> OTHER
        printNumberInWord(100); //Expected outcome ==> OTHER

    }

    //Simple showcase of switch statment based of an int parameter
    public static void printNumberInWord(int number) {

        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
