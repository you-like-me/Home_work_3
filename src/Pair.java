/*
 * Напишите обабщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst() и getSecond() для получения значений пары, а также
 * переопределение метода toString(), возвращающее строковое представление пары
 */
public class Pair<T, E> {
    T first;
    E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "first: " + getFirst() + ", Second: " + getSecond();
    }

}