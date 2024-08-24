public class control {
    public static void main(String[] args) {
        
        int[] arr=new int[5];

        try{
            
            try{
                System.out.println(arr[8]);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            int a=20/0;
            System.out.println("this is never exeuted");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this is the finally block always executed\n");
        }

        System.out.println("now program continuation is start from here you can read it\n");
    }
}
