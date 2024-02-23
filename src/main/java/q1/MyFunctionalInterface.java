package q1;

@FunctionalInterface
public interface MyFunctionalInterface {
    int sum(int a,int b);

   default int max(int a ,int b){
       return a;
   }

}
@FunctionalInterface
 interface MyFunction extends MyFunctionalInterface{
}
