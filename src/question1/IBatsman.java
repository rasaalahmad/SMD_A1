/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Win 10 Pro
 */
public interface IBatsman extends ICricketer{
    @Override
    public default void print()
    {
        
    }
    public default int getBatsmanRanking()
    {
        return 0;
    }
    
    public default void setBatsmanranking(int Batsmanranking) {
        
    }
}
