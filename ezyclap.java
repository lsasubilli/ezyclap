public class MyClass {
    public static void main(String args[]) {
      int count = 0;
      int[] randomArray = {1,2,3,4,5};
      
      
      for(int i = 0; i<randomArray.length; i++){
          if(randomArray[i]==1 || randomArray[i]==3 ){
              count++;
          }
          
        
      }
      System.out.println(count);
      if(count>1){
          
        System.out.println("False");
      }else{
          
          
          System.out.println("True");
         }
    }
}
