public class Song{
  
  public static void main(String[] args){
    int bottleCount = 10;
    String word = "bottles";

    while(bottleCount>0){
      if(bottleCount==1){
        word = "bottle";
      }
      System.out.println(bottleCount + " green " + word + " hanging on the wall,");
      System.out.println(bottleCount + " green " + word + " hanging on the wall,");
      System.out.println("And if one green bottle should accidentally fall,");
      bottleCount--;
      if(bottleCount>1){
        System.out.println("There will be " + bottleCount + " green " + word + " hanging on the wall,");
      }else{
      System.out.println("There will be no green bottles hanging on the wall,");
      }
    }
  }
}