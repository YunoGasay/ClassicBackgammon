package game;

enum Color {WHITE, BLACK, EMPTY}
public class Chips {
    private int num;
    private Color color = Color.EMPTY;

    public Chips (int number) {
        switch (number) {
            case 0:
                this.num = 15;
                this.color = Color.WHITE;
                break;
            case 12:
                this.num = 15;
                this.color = Color.BLACK;
                break;
            default:
                this.num = 0;
                break;
        }
    }
    public void setChips(int num, Color color) {this.num = num; this.color = color;
    }
    public boolean Black() {
        return this.color == Color.BLACK;
    }

    public boolean White() {
        return this.color == Color.WHITE;
    }

    public int getNum() {
        return(num);
    }

    public Color getColor() {
        return(color);
    }

    public void addChecker(Color color) {
        if (!color.equals(this.color) && !this.color.equals(Color.EMPTY))
            return;
        if (this.color.equals(Color.EMPTY))
            this.color = color;
        num++;
    }

    public void removeChecker() {
        if (num == 1)
            color = Color.EMPTY;
        num--;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Chips)) return false;
        Chips other = (Chips) o;
        return other.color == color && other.num == num;
    }
}
