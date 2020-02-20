/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author Cloud
 */
public class PasswordValidation extends UnoOnline{
   
    
    public boolean pwordValidCheck(String pword, boolean validation) {
    
    int specialCharCount = 0;
    
    for(int i=0;i<pword.length(); i++)
            {
                if(!(Character.isLetterOrDigit(pword.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
    
            if(specialCharCount>0 &&pword.length()>7)
            {
                validation =true;
            }
             return validation;

    }  
}
