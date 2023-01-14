package task2;

import java.util.Arrays;
import java.util.List;

public class Menu {
    private List<Pizza> pizzaList;

    public Menu() {
        List<Ingredients> ingredients1 = Arrays.asList(Ingredients.CEBULA, Ingredients.PAPRYKA, Ingredients.PIECZARKI);
        List<Ingredients> ingredients2 = Arrays.asList(Ingredients.CEBULA, Ingredients.POMIDOR, Ingredients.MOZZARELLA);
        List<Ingredients> ingredients3 = Arrays.asList(Ingredients.CEBULA, Ingredients.SALAMI, Ingredients.SELER);
        List<Ingredients> ingredients4 = Arrays.asList(Ingredients.POMIDOR, Ingredients.SELER, Ingredients.MOZZARELLA);
        List<Ingredients> ingredients5 = Arrays.asList(Ingredients.POMIDOR, Ingredients.PAPRYKA, Ingredients.MOZZARELLA);
        List<Ingredients> ingredients6 = Arrays.asList(Ingredients.POMIDOR, Ingredients.SALAMI, Ingredients.PIECZARKI);
        List<Ingredients> ingredients7 = Arrays.asList(Ingredients.PIECZARKI, Ingredients.PAPRYKA, Ingredients.POMIDOR);
        List<Ingredients> ingredients8 = Arrays.asList(Ingredients.SALAMI, Ingredients.PAPRYKA, Ingredients.PIECZARKI);
        List<Ingredients> ingredients9 = Arrays.asList(Ingredients.SELER, Ingredients.PAPRYKA, Ingredients.PIECZARKI);
        List<Ingredients> ingredients10 = Arrays.asList(Ingredients.MOZZARELLA, Ingredients.SALAMI, Ingredients.PIECZARKI);

        Pizza Margherita = new Pizza("Margherita", ingredients1);
        Pizza Marinara = new Pizza("Marinara", ingredients2);
        Pizza Prosciutto = new Pizza("Prosciutto", ingredients3);
        Pizza Quattro = new Pizza("Quattro", ingredients4);
        Pizza Capricciosa = new Pizza("Capricciosa", ingredients5);
        Pizza Formaggi = new Pizza("Formaggi", ingredients6);
        Pizza Ortolana = new Pizza("Ortolana", ingredients7);
        Pizza Diavola = new Pizza("Diavola", ingredients8);
        Pizza Boscaiola = new Pizza("Boscaiola", ingredients9);
        Pizza Frutti = new Pizza("Frutti", ingredients10);

        pizzaList = Arrays.asList(Margherita, Marinara, Prosciutto, Quattro, Capricciosa, Formaggi, Ortolana, Diavola, Boscaiola, Frutti);
    }

    public void printVeganPizza() {
        pizzaList.stream().filter(pizza -> pizza.vegan)
                .forEach(element -> System.out.println(element.name));
    }

    public void printAllergensPizza() {
        pizzaList.stream().filter(pizza -> pizza.ingredients.contains(Ingredients.SELER))
                .forEach(element -> System.out.println(element.name));
    }

    public boolean isPizzaVeganWithTomatoPepper() {
        return pizzaList.stream().anyMatch(pizza -> pizza.isVegan() &&
                pizza.ingredients.contains(Ingredients.PAPRYKA) && pizza.ingredients.contains(Ingredients.POMIDOR));
    }

    public boolean isMozzarellaPresentAllPizza() {
        return pizzaList.stream().allMatch(pizza -> pizza.ingredients.contains(Ingredients.MOZZARELLA));
    }

    public void printMinCaloriesPizza() {
        pizzaList.stream().min((pizza1, pizza2) -> pizza1.calories - pizza2.calories).stream()
                .forEach(pizza -> System.out.println(pizza.name));
    }

    public void printMaxCaloriesPizza() {
        pizzaList.stream().max((pizza1, pizza2) -> pizza1.calories - pizza2.calories).stream()
                .forEach(pizza -> System.out.println(pizza.name));
    }

    private class Pizza {
        private String name;
        private List<Ingredients> ingredients;
        private boolean vegan;
        private int calories;

        private Pizza(String name, List<Ingredients> ingredients) {
            this.name = name;
            this.ingredients = ingredients;
            this.calories = getCalories();
            this.vegan = isVegan();
        }

        private boolean isVegan() {
            return ingredients.stream().noneMatch(element -> element == Ingredients.SALAMI);
        }

        private int getCalories() {
            int calories = 0;
            for (Ingredients ingredient : ingredients) {
                calories = calories + ingredient.calories;
            }
            return calories;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "name='" + name + '\'' +
                    ", ingredients=" + ingredients +
                    ", vegan=" + vegan +
                    ", calories=" + calories +
                    '}';
        }
    }
}
