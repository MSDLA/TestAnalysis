package textcounter;


class TextCounter {

    private int lineCount;
    private int charCount;

    public void countLine(String line) {
        lineCount++;
        charCount += line.length();
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharCount() {
        return charCount;
    }
}

