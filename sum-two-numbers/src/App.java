public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Insert two numbers to sum: ");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());

        System.out.println("The sum of " + a + " and " + b + " is " + sum(a, b));

    }

    public static int sum(int a, int b){
        return a + b;
    }
}
