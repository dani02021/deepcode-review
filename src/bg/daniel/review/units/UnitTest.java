package bg.daniel.review.units;

public abstract class UnitTest {
    abstract void load();

    abstract int getTime();

    abstract long getFreeMemory();
    abstract long getTotalMemory();

    abstract void displayResults();
}
