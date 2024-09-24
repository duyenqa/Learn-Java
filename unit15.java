class HelloWorld {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 0;
            int c = a / b;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }finally{
            System.out.println("Done!");
        }
    }
}
