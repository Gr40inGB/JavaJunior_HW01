### Task1
```java
public class Main {
    public static void main(String[] args) {
//        double[] arr = {12.3, 2312.2, 0.0, 1231.0, 32.01};
//        System.out.println(getAverageForEvenNumbers(new BigDecimal(12)));
//        printAverageForEvenNumbers(new BigDecimal(12), 12, 0.21, 24L);
    }

    public static OptionalDouble getAverageForEvenNumbers(Number... numbers) {
        return Arrays.stream(numbers)
                .mapToDouble(Number::doubleValue)
                .filter(x -> x % 2 == 0)
                .average();
    }

    public static void printAverageForEvenNumbers(Number... numbers) {
        var result = getAverageForEvenNumbers(numbers);
        result.ifPresentOrElse(System.out::println, () -> System.out.println("No even elements"));
    }
}
```

### Task2

```java
 public void cardBalancing() {
    boolean proteins = foodstuffs.stream().anyMatch(Food::getProteins);
    boolean fats = foodstuffs.stream().anyMatch(Food::getFats);
    boolean carbohydrates = foodstuffs.stream().anyMatch(Food::getCarbohydrates);

    if (proteins && fats && carbohydrates) {
        System.out.println("Корзина уже сбалансирована по БЖУ.");
        return;
    }

    if (!proteins) {
        Optional<T> someProteins = market.getThings(clazz).stream()
                .filter(Food::getProteins)
                .findFirst();
        someProteins.ifPresent(foodstuffs::add);
    }
    if (!fats) {
        Optional<T> someFats = market.getThings(clazz).stream()
                .filter(Food::getFats)
                .findFirst();
        someFats.ifPresent(foodstuffs::add);
    }

    if (!carbohydrates) {
        Optional<T> someCarbs = market.getThings(clazz).stream()
                .filter(Food::getCarbohydrates)
                .findFirst();
        someCarbs.ifPresent(foodstuffs::add);
    }

    proteins = foodstuffs.stream().anyMatch(Food::getProteins);
    fats = foodstuffs.stream().anyMatch(Food::getFats);
    carbohydrates = foodstuffs.stream().anyMatch(Food::getCarbohydrates);

    if (proteins && fats && carbohydrates)
        System.out.println("Корзина сбалансирована по БЖУ.");
    else
        System.out.println("Невозможно сбалансировать корзину по БЖУ.");
}
```