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
public interface IBowler extends ICricketer {

    @Override
    public default void print()
    {
    }
    public default int getBowlerRanking()
    {
        return 0;
    }
    
    public default void setBowlernranking(int Bowlernranking) {
        
    }
}
