public class Triangle {
    private int a;
    private int b;
    private int c;
    public Triangle(int a, int b, int c) throws IncorrectSidesException {
        if(a+b<= c || b+c<=a || a+c<=b)
            throw new IncorrectSidesException("Triangle can not be created");
    }
}
