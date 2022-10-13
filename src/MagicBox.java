import java.util.Random;

public class MagicBox<T> {
    // protected T item;
    protected T[] items;

    public MagicBox(int amount) {
        this.items = (T[]) new Object[amount];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; ++i) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int countNULL = 0;
        int randomInt = 0;
        for (T itm : items) {
            if (itm == null) {
                countNULL++;
            }
        }

        if (countNULL == 0) {
            Random random = new Random();
            randomInt = random.nextInt(items.length);
        } else {
            throw new RuntimeException("Волшебная коробка не полна пустых ячеек осталось " + countNULL + " !");
        }
        return items[randomInt];

    }

}
