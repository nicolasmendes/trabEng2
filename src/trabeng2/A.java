/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabeng2;

/**
 *
 * @author NICOLAS
 */
public class A {

private int A1;
private float A2;

    private String A3;

    public String getA3() {
        return A3;
    }

    public void setA3(String A3) {
        this.A3 = A3;
    }


 public int getA1() {
        return A1;
    }

    public void setA1(int A1) {
        this.A1 = A1;
    }
    public float getA2() {
        return A2;
    }

    public void setA2(float A2) {
        this.A2 = A2;
    }
    
   public static float somar( int a, float b ) {      
      return a + b;      
   }    
  
   public static void main(String args[]) {  
       int A1 =2;
       float A2=3;
        float result = somar(A1, A2);    
   }    
}  
    

 
    
}
