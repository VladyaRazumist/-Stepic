/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StepicTasks;

/**
 *
 * @author леха
 */
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    @Override
     public int hashCode(){
     int result;
    long temp;
    temp = Double.doubleToLongBits(re);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(im);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
     }
     @Override
     public boolean equals(Object obj)
     {
         if (this==obj) 
                 return true;
         if (obj==null)
                 return false;
         if (this.getClass()!=obj.getClass())
                 return false;
         ComplexNumber CN=(ComplexNumber)obj;
         if (im!=CN.im)
                 return false;
         if (re!=CN.re)
                 return false;
         return true;
         
         
     }
     }
    
    

