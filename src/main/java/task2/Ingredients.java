package task2;

public enum Ingredients {
    MOZZARELLA(45),
    PIECZARKI(4),
    SALAMI(89),
    CEBULA(5),
    POMIDOR(32),
    PAPRYKA(5),
    SELER(45);

    int calories;

    Ingredients(int calories) {
        this.calories = calories;
    }
}
