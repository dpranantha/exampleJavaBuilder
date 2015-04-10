package builder;

public class BuilderPatternJuiceIterator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Creating object using Builder pattern in java
        String names[] = { "orange", "banana", "kiwi" };
        NameRepository fruits = new NameRepository.Builder().names(names).build();
        Juice triple = new Juice.Builder().fruit(fruits).sugar(40).water(100).build();
        // Juice is ready to drink :)
        System.out.println(triple);
    }

}
