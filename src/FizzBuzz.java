public class FizzBuzz {

    public static void main(String[] args) throws InterruptedException {

        // Løkken går gennem tallene fra 1 til 100
        for (int i = 1; i <= 15; i++) {
            Thread.sleep(1000); // Vent 1 sekund mellem hver iteration

            // Hvis tallet kan divideres med både 3 og 5,
            // skriver vi "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

                // Hvis tallet kan divideres med 3,
                // skriver vi "Fizz"
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

                // Hvis tallet kan divideres med 5,
                // skriver vi "Buzz"
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

                // Hvis ingen af de andre betingelser passer,
                // skriver vi selve tallet
            } else {
                System.out.println(i);
            }
        }
    }
}
