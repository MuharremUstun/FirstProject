package Demo;

import java.io.IOException;

public class OneMinuteClock {
    public static void main(String[] args) throws InterruptedException, IOException {

        for (int i = 0; i < 60; i++) {
            for (int j = 0; j < 60; j++) {
//                Runtime.getRuntime().exec("cls");
//                clearScreen();
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                if (i < 10) System.out.print("0");
                System.out.print(i + ":");
                if (j < 10) System.out.print("0");
                System.out.println(j);
                Thread.sleep(5);
            }
        }

    }
}

