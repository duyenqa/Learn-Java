class HelloWorld {
    public static int staticVariable = 50;
    public int instanceVariable = 0; 
    
    public static void main(String[] args) {
        HelloWorld obj1 = new HelloWorld();
        System.out.println(HelloWorld.staticVariable);
        
        obj1.instanceVariable = 10;
        System.out.println(obj1.instanceVariable);
    }
}
