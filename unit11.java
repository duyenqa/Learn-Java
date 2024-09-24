class HelloWorld {
    public static void main(String[] args) {
        try{
            System.out.println("Executing try block code");
            throw new Exception("My error message");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
