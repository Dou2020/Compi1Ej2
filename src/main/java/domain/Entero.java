package domain;

/**
 *
 * @author douglas2021
 */
public class Entero {
 private int column;
 private int line;
 private String value;

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    

    public Entero(int column, int line, String value) {
        this.column = column;
        this.line = line;
        this.value = value;
    }
 
}
