class HelloWorld {
    public static int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    
    public static void main(String[] args) {
        System.out.println(HelloWorld.add(5, 3));
        
        HelloWorld obj = new HelloWorld();
        System.out.println(obj.subtract(6,4));
    }
}
