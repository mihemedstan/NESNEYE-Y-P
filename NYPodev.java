import java.util.Random;
import java.math.*;

class MyUtils{
     MyUtils(){
     
    }
    public static float UCGENİNCEVRESİ(float a,float b,float c){
         return a+b+c;
     }
     public static float UCGENİNALANİ(float a,float b,float c){
         float p = (a + b +c )/ 2;
         return (float)Math.sqrt(p*((p-a)*(p-b)*(p-c)));
     }
     
     private static  int Random_NextInt(int min,int max){
        Random rnd=new Random();
        return rnd.nextInt((max-min)+1)-min;
    }
     
    public static  double[] did(double[] arr){
        double[] result = new double[arr.length];
        for (int i =0;i<arr.length;i++){
            result[i] = (double)Random_NextInt(-100, 100);
            
        }
        
        int index = 0;
        for (int i = 0;i< arr.length; i++){
            result[index] = f1(result[i]);
            index += 2;
            if(index< arr.length) {
            	break;
            }
            
        }
 
        index = 1;
        for (int i = 1; i< arr.length; i++){
         
            result[index] = f2(result[i]);
            index += 2;
            if(index < arr.length) {
            	break;
            }
            
        }
        
        
        return result;
    }
    private static double f1(double x){
        
        return 3*x - 2 * Math.exp(x) + Math.sqrt(x);
    }
    
    private static double f2(double x){
        
        return 1 / 1+ Math.exp(x);
    }
    public static float cokgencevresi(float a, float b, float c, float d)
    {
        return a + b + c + d;
    }
    public static float cokgencevresi(float a, float b, float c, float d, float e)
    {
        return a + b + c + d + e;
    }
    public static float cokgencevresi(float a, float b, float c, float d, float e, float f)
    {
        return a + b + c + d + e + f;
    }
    
    public static float cokgenalani(float kenaruzunlugu, int kenarsayisi)
    {
       float polygon_alani = kenarsayisi * (kenaruzunlugu*kenaruzunlugu) / (4 * (float)Math.tan(Math.PI / kenarsayisi));
       return polygon_alani;
    }
}
    


public class Main
{
	static void printArr(double[]arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+"|");
		}
	}
	public static void main(String[] args) {
		MyUtils var = new MyUtils();
		System.out.println(var.UCGENİNCEVRESİ(1,2,3));
		double[] arr = new double[10];
		printArr(var.did(arr));
		
		
	}
}
