public class Main {
    /*
    /Exercise 1: Write a program that prints the entire lyrics of “99 Bottles of Beer.”
    /Your program should include a recursive method
     */
    public static void main(String[] args) {

        bottlesOfBeer(100);

    }

    public static void bottlesOfBeer(int n){
        if (n == 0){
            System.out.println("""
                    No bottles of beer on the wall,
                    No bottles of beer,
                    ya’ can’t take one down, ya’ can’t pass it around,
                    ’cause there are no more bottles of beer on the wall!
                    """);
        }
        else{
            if(n == 2){
                System.out.println(n + " bottles of beer on the wall,\n" +
                        n + " bottles of beer,\nya’ take one down, " +
                        "ya’ pass it around,\n" + (n-1) + " bottle of beer on the wall.\n");
            }
            else if(n == 1){

                System.out.println(n + " bottle of beer on the wall,\n" +
                        n + " bottle of beer,\nya’ take one down, " +
                        "ya’ pass it around,\nNo bottles of beer on the wall.\n");
            }
            else{
                System.out.println(n + " bottles of beer on the wall,\n" +
                        n + " bottles of beer,\nya’ take one down, " +
                        "ya’ pass it around,\n" + (n-1) + " bottles of beer on the wall.\n");
            }
            bottlesOfBeer(n-1);
        }

    }

}