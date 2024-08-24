public class thro{
   
    public static void validate(int age){

        if(age<18){
            throw new ArithmeticException("this guy is not elligible to give the vote");
        }
        else{
            System.out.println("this guy is elligible to give the vote");
        }
    }
    public static void main(String[] args) throws ArithmeticException{
        validate((15));
    }
}
