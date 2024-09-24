class HelloWorld {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 0;
            int c = a / b;
        }catch(Exception e ){
            System.out.println("Exception");
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
    }
}
