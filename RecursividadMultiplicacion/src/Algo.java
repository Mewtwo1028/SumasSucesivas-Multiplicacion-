/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osmar
 */
public class Algo {
    
    int aux = 1;
    int ans = 0;
    String numeros;  
    

    public int SumasSucesivas(int num)
    {
    
        if (aux <= 10)
        {
            ans += num;
            numeros += ("\n"+num+"*"+aux+"="+ans);
        }
        else
        {
            return ans;
        }
        aux++;
        return SumasSucesivas(num);
        
        
    }
    
}
