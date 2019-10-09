package model;

public class Line {
    private static final char[] lines = {'A','B','C','D','E','F','G','H'};
    private char line;

    public Line(char line) {
        this.line = Character.toUpperCase(line);
    }

    public static char[] getLines() {
        return lines;
    }

    public void setLine(char line) {
        this.line = line;
    }

    public char getLine() {
        return line;
    }

    public boolean isLine(){
        for ( char line : lines ) {
            if (line == this.line) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Character.toString(line);
    }
}
