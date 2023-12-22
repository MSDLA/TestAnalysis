package textcounter;

import java.util.Scanner;

class TextReader {

    private TextCounter counter;

    public TextReader() {
        this.counter = new TextCounter();
    }

    public void readText() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv din text (skriv 'stop' för att avsluta):");

        while (true) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("stop")) {
                break;
            }

            counter.countLine(line);
        }

        System.out.println("Antal rader: " + counter.getLineCount());
        System.out.println("Antal tecken: " + counter.getCharCount());
    }
}

