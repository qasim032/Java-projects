public class forl {
    public static void main(String[] args) throws InterruptedException {

        int length = 100;

        String bar ;
        for (int i = 1; i <= length; i++) {
            bar = "";
            for (int j = 1; j <= i; j++)
                bar += "=";
            for (int k = i; k <= length; k++)
                bar += " ";
            System.out.print("\rTask 1 : [" + bar + "]" + i + "%");
            Thread.sleep(200);

        }
        System.out.println("\nTask completed!");
    }
}

