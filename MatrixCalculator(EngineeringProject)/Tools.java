public class Tools 
{
/***********************************************************************            
    * Method name:
    * clearDimensions
    *
    * Description:
    * This method allows inputted value for matricies to be cleared when called.
    * 
    * Parameters:
    * Gui access.
    *
    * Restrictions:
    * No restrictions.
    *
    * Return:
    * A cleared program.
    *
    * Restrictions:
    * Use only Things learned in class.
    *
    ***********************************************************************/
    public void clearDimensions(Gui gui){
        
    /* setting JTextfield (box one clear) */
    gui.txtBoxOneA1.setEditable(false);
    gui.txtBoxOneA1.setText("");

    gui.txtBoxOneA2.setEditable(false);
    gui.txtBoxOneA2.setText("");

    gui.txtBoxOneA3.setEditable(false);
    gui.txtBoxOneA3.setText("");

    gui.txtBoxOneB1.setEditable(false);
    gui.txtBoxOneB1.setText("");

    gui.txtBoxOneB2.setEditable(false);
    gui.txtBoxOneB2.setText("");

    gui.txtBoxOneB3.setEditable(false);
    gui.txtBoxOneB3.setText("");

    gui.txtBoxOneC1.setEditable(false);
    gui.txtBoxOneC1.setText("");

    gui.txtBoxOneC2.setEditable(false);
    gui.txtBoxOneC2.setText("");

    gui.txtBoxOneC3.setEditable(false);
    gui.txtBoxOneC3.setText("");
        
    /* setting JTextfield (box two clear) */
    gui.txtBoxTwoA1.setEditable(false);
    gui.txtBoxTwoA1.setText("");

    gui.txtBoxTwoA2.setEditable(false);
    gui.txtBoxTwoA2.setText("");

    gui.txtBoxTwoA3.setEditable(false);
    gui.txtBoxTwoA3.setText("");

    gui.txtBoxTwoB1.setEditable(false);
    gui.txtBoxTwoB1.setText("");

    gui.txtBoxTwoB2.setEditable(false);
    gui.txtBoxTwoB2.setText("");

    gui.txtBoxTwoB3.setEditable(false);
    gui.txtBoxTwoB3.setText("");

    gui.txtBoxTwoC1.setEditable(false);
    gui.txtBoxTwoC1.setText("");

    gui.txtBoxTwoC2.setEditable(false);
    gui.txtBoxTwoC2.setText("");

    gui.txtBoxTwoC3.setEditable(false);
    gui.txtBoxTwoC3.setText("");

    /* setting JTextField (box resultant clear) */
    gui.txtBoxResultA1.setEditable(false);
    gui.txtBoxResultA1.setText("");

    gui.txtBoxResultA2.setEditable(false);
    gui.txtBoxResultA2.setText("");

    gui.txtBoxResultA3.setEditable(false);
    gui.txtBoxResultA3.setText("");

    gui.txtBoxResultB1.setEditable(false);
    gui.txtBoxResultB1.setText("");

    gui.txtBoxResultB2.setEditable(false);
    gui.txtBoxResultB2.setText("");

    gui.txtBoxResultB3.setEditable(false);
    gui.txtBoxResultB3.setText("");

    gui.txtBoxResultC1.setEditable(false);
    gui.txtBoxResultC1.setText("");

    gui.txtBoxResultC2.setEditable(false);
    gui.txtBoxResultC2.setText("");

    gui.txtBoxResultC3.setEditable(false);
    gui.txtBoxResultC3.setText("");

  }
       /***********************************************************************            
    * Method name:
    * isNumber
    *
    * Description:
    * This method checks if values saved in a string can be converted to an int.
    *
    * Parameters:
    * String value.
    *
    * Restrictions:
    * No restrictions.
    *
    * Return:
    * Weahter of not the program is able to parse the srting to an int.
    *
    * Restrictions:
    * Use only Things learned in class.
    *
    ***********************************************************************/
       public boolean isNumber(String strNumber){

       //constants needed to check all the elements

       final String DIGITS = "0123456789";

       final String SIGN = "+-";

       final String DOT = ".";

       //return false if the string is empty or null

       if (strNumber == null || strNumber.isEmpty()){

           return false;

       }

       //cound dots if there are any (decimal places)

       int countDots = 0;

       int index = strNumber.indexOf(DOT);

       int lastIndex = index; //store last index in case there are many

       //count dots store index of last dot

       for ( ;index >= 0;index = strNumber.indexOf(DOT, index + 1))

       {

            countDots++;

            lastIndex = index;

       }

       //if more than one dot return false

       if (countDots > 1){

           return false;

       }

       /*

       if there is one dot and is not the first or last in the string

       then it might be a good number

       */

       if (countDots == 1 && 

          (

              (

                  SIGN.indexOf(strNumber.charAt(0))!= -1 

                    && 

                  lastIndex == 1

              ) 

              || 

              lastIndex == 0 

              || 

              lastIndex == strNumber.length()-1)

             

           ){

           return false; //is not a valid format

       }

       

       //check first element if it is a sign - or + or digit

       char element = strNumber.charAt(0);

       if (DIGITS.indexOf(element) == -1)

            if (SIGN.indexOf(element) == -1)

                return false;

       //return false if there is just one sign with no digits

       if (strNumber.length() == 1 && DIGITS.indexOf(element) == -1)

            return false;

       //check the rest of the characters to ensure they are valid

       for (int i = 1; i < strNumber.length();i++){

           element = strNumber.charAt(i);

           if (DIGITS.indexOf(element) != -1) //is a digit

                continue;

           if (DOT.indexOf(element) != -1) { //is a dot

               continue;

            } else {

                return false; //is not a digit or dot

            }

       }

       return true; //passed all the tests!

   }
}