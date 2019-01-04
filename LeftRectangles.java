/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StepicTasks;

import java.util.function.DoubleUnaryOperator;

public class LeftRectangles {

//метод левых прямоугольников

    public static void qwe(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
      double n; // number of nodes
      double h=1;// step
      double I=0;
      double I1=0;
      n=(b-a)/h;
      for (int i=0;i<n;i++) {
          
          I+=f.applyAsDouble(a+i*h);
          
      }
     I=I*h;
      h=h/2;
      n=(b-a)/h;
      for (int i=0;i<n;i++) {
          
          I1+=f.applyAsDouble(a+i*h);
      }
      I1=I1*h;
      
      
      while ((I1-I>0.000000005)|(I-I1>0.000000000005)){
          h=h/2;
          n=(b-a)/h;
          
          I1=I;
      for (int i=0;i<n;i++) {
          
          I+=f.applyAsDouble(a+i*h);
          
      }
      I=I*h;
      }
        return I*h; // Integral
    }
}
        
        
        
        
        
        
        
    
    
