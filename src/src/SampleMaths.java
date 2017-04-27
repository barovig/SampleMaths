/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author semargl
 */
public class SampleMaths {
    
    int ia;
    int ib;
    double da;
    double db;
    
    public <T extends Number> double add(T a, T b, Class c){
        
        if(c == Double.class){
            double n1 = a.doubleValue();
            double n2 = b.doubleValue();
            return n1 + n2; 
        }
        
        if(c == Integer.class){
            int n1 = a.intValue();
            int n2 = b.intValue();
            return n1 + n2;             
        }
        
        return Double.NaN;
    }
    
        public <T extends Number> double multiply(T a, T b, Class c){
        
        if(c == Double.class){
            double n1 = a.doubleValue();
            double n2 = b.doubleValue();
            return n1 * n2; 
        }
        
        if(c == Integer.class){
            int n1 = a.intValue();
            int n2 = b.intValue();
            return n1 * n2;             
        }
        
        return Double.NaN;
    }
    
    
    
}
