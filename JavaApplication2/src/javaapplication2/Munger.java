/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
/**
 *
 * @author rednibnafets
 */
public class Munger {
    private final int maxMunge = 55 ;
    private int[] mungarr ;
    
    public Munger() 
    {
        mungarr = new int[maxMunge] ;
        for( int i = 0 ; i < maxMunge ; i++ )
        {
            mungarr[i] = i ;
            
        }
    }
    
    public Munger display()    
    {
        for( int i = 0 ; i < maxMunge ; i++ )
        {
            System.out.println( mungarr[i]) ;
        }
        return this ; 
    }
    
}
