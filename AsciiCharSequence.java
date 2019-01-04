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
public class AsciiCharSequence 
                  implements CharSequence   {
    private byte [] B;
    public AsciiCharSequence(byte [] B) {
        this.B=new byte [B.length];
        System.arraycopy(B, 0, this.B, 0, B.length);
    }
    @Override
    public int length() {
        return B.length;
    }
    @Override
        public char charAt(int index){
            return (char)B[index];
        }
        @Override
        public AsciiCharSequence subSequence(int start, int end){
            byte [] B1=new byte [end-start];
            for (int i=0;i<end-start;i++){
                B1[i]=B[start+i];
            }
            AsciiCharSequence A= new  AsciiCharSequence (B1);
            return A;
        }
        @Override 
        public String toString(){
            String s = new String(B);
            return s;
        }
}
