/*
Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice dove si cattura
l'eventuale eccezione.
 */
public class Main {
    public static void main(String[] args) {
        Integer nominator = 4;
        Integer denominator = null;
        checkNullability(nominator, denominator);
    }

    private static void checkNullability(Integer numerator, Integer denominator) {
        Integer result;
        try {
            result = numerator / denominator;
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Type of exception: " + e);
        } finally {
            System.out.println("Code finally executed");
        }
    }
}