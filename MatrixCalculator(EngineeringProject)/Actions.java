import javax.swing.*;
import java.util.*;
public class Actions 
{
  
  /* creting an instance of Tools */
  Tools tools = new Tools();

    /***********************************************************************            
    * Method name:
    * enterButton
    *
    * Description:
    * This method allows inputted value for amount of rows and columns longitude and latitude to be calculated
    * and use it to make certain textboxes visible and editable.
    *
    * Parameters:
    * GUI enter button.
    *
    * Restrictions:
    * No restrictions.
    *
    * Return:
    * The correct textboxes that have been specified by the user.
    *
    * Restrictions:
    * Use only Things learned in class.
    *
    ***********************************************************************/
  public void enterButton(Gui gui){
    gui.btnEnter.addActionListener( e -> {
      
      /* recieving JLabel (row input value) */
      String rowAmountWord = gui.txtRowAmount.getText();
      int rowAmount = Integer.parseInt(rowAmountWord);
            
      /* recieving JLabel (column input value) */
      String columnAmountWord = gui.txtColumnAmount.getText();
      int columnAmount = Integer.parseInt(columnAmountWord);
            
      /* creating Integer (creating a grid) */
      int matrixDimensions = rowAmount * columnAmount;

      switch(matrixDimensions){

        case 1: tools.clearDimensions(gui);
                gui.txtBoxOneA1.setEditable(true);
                gui.txtBoxTwoA1.setEditable(true);
        break;

        case 2: tools.clearDimensions(gui);
                if(rowAmount == 2){
                  
                  gui.txtBoxOneA1.setEditable(true);
                  gui.txtBoxOneB1.setEditable(true);
                                            
                  gui.txtBoxTwoA1.setEditable(true);
                  gui.txtBoxTwoB1.setEditable(true);

                }else{
                  
                  gui.txtBoxOneA1.setEditable(true);
                  gui.txtBoxOneA2.setEditable(true);
                                            
                  gui.txtBoxTwoA1.setEditable(true);
                  gui.txtBoxTwoA2.setEditable(true);

                }
                break;

        case 3: tools.clearDimensions(gui);
                if(rowAmount == 3){
                  
                  gui.txtBoxOneA1.setEditable(true);
                  gui.txtBoxOneB1.setEditable(true);
                  gui.txtBoxOneC1.setEditable(true);
                                            
                  gui.txtBoxTwoA1.setEditable(true);
                  gui.txtBoxTwoB1.setEditable(true);
                  gui.txtBoxTwoC1.setEditable(true);
                                          
                }else{
                  
                  gui.txtBoxOneA1.setEditable(true);
                  gui.txtBoxOneA2.setEditable(true);
                  gui.txtBoxOneA3.setEditable(true);
                                            
                  gui.txtBoxTwoA1.setEditable(true);
                  gui.txtBoxTwoA2.setEditable(true);
                  gui.txtBoxTwoA3.setEditable(true);

                }
                break;

        case 4: tools.clearDimensions(gui);
                if(rowAmount == 4 || columnAmount == 4){
                
                  JOptionPane.showMessageDialog(null, "Limit for the program is a 3x3 matrix...");

                
                }else{
                          
                  gui.txtBoxOneA1.setEditable(true);
                  gui.txtBoxOneA2.setEditable(true);
                  gui.txtBoxOneB1.setEditable(true);
                  gui.txtBoxOneB2.setEditable(true);
                        
                  gui.txtBoxTwoA1.setEditable(true);
                  gui.txtBoxTwoA2.setEditable(true);
                  gui.txtBoxTwoB1.setEditable(true);
                  gui.txtBoxTwoB2.setEditable(true);

                }
                break;

        case 6: tools.clearDimensions(gui);
                if(rowAmount == 3){

                  gui.txtBoxOneA1.setEditable(true);
                  gui.txtBoxOneB1.setEditable(true);
                  gui.txtBoxOneC1.setEditable(true);
                  gui.txtBoxOneA2.setEditable(true);
                  gui.txtBoxOneB2.setEditable(true);
                  gui.txtBoxOneC2.setEditable(true);
                                            
                  gui.txtBoxTwoA1.setEditable(true);
                  gui.txtBoxTwoB1.setEditable(true);
                  gui.txtBoxTwoC1.setEditable(true);
                  gui.txtBoxTwoA2.setEditable(true);
                  gui.txtBoxTwoB2.setEditable(true);
                  gui.txtBoxTwoC2.setEditable(true);
                
                }else{
                
                  gui.txtBoxOneA1.setEditable(true);
                  gui.txtBoxOneA2.setEditable(true);
                  gui.txtBoxOneA3.setEditable(true);
                  gui.txtBoxOneB1.setEditable(true);
                  gui.txtBoxOneB2.setEditable(true);
                  gui.txtBoxOneB3.setEditable(true);
                                            
                  gui.txtBoxTwoA1.setEditable(true);
                  gui.txtBoxTwoA2.setEditable(true);
                  gui.txtBoxTwoA3.setEditable(true);
                  gui.txtBoxTwoB1.setEditable(true);
                  gui.txtBoxTwoB2.setEditable(true);
                  gui.txtBoxTwoB3.setEditable(true);
              
                }
                break;
                
        case 9: tools.clearDimensions(gui);
                gui.txtBoxOneA1.setEditable(true);
                gui.txtBoxOneA2.setEditable(true);
                gui.txtBoxOneA3.setEditable(true);
                gui.txtBoxOneB1.setEditable(true);
                gui.txtBoxOneB2.setEditable(true);
                gui.txtBoxOneB3.setEditable(true);
                gui.txtBoxOneC1.setEditable(true);
                gui.txtBoxOneC2.setEditable(true);
                gui.txtBoxOneC3.setEditable(true);

                gui.txtBoxTwoA1.setEditable(true);
                gui.txtBoxTwoA2.setEditable(true);
                gui.txtBoxTwoA3.setEditable(true);
                gui.txtBoxTwoB1.setEditable(true);
                gui.txtBoxTwoB2.setEditable(true);
                gui.txtBoxTwoB3.setEditable(true);
                gui.txtBoxTwoC1.setEditable(true);
                gui.txtBoxTwoC2.setEditable(true);
                gui.txtBoxTwoC3.setEditable(true);
                break;

        default: JOptionPane.showMessageDialog(null, "Limit for the program is a 3x3 matrix...");
      }
    }
    );
  }

/***********************************************************************            
    * Method name:
    * additionButton
    *
    * Description:
    * This method allows inputted value for matricies to be added together and columns longitude and latitude to be calculated
    * and use it to produce a result in the resultant matrix.
    *
    * Parameters:
    * GUI addition button.
    *
    * Restrictions:
    * No restrictions.
    *
    * Return:
    * The correct values in the resultant matrix that have been specified by the user.
    *
    * Restrictions:
    * Use only Things learned in class.
    *
    ***********************************************************************/
public void additionButton(Gui gui) {
  gui.btnAddition.addActionListener(e -> {
    
    /* setting icon */
    gui.txtOperationIcon.setText("+");
    
    /* retreived informtion for matrix one */
    
    String boxOneA1Word = gui.txtBoxOneA1.getText();
    int boxOneA1 = 0;
    if(tools.isNumber(boxOneA1Word)){
    boxOneA1 = Integer.parseInt(boxOneA1Word);}

    String boxOneA2Word = gui.txtBoxOneA2.getText();
    int boxOneA2 = 0;
    if(tools.isNumber(boxOneA2Word)){
    boxOneA2 = Integer.parseInt(boxOneA2Word);}
    
    String boxOneA3Word = gui.txtBoxOneA3.getText();
    int boxOneA3 = 0;
    if(tools.isNumber(boxOneA3Word)){
    boxOneA3 = Integer.parseInt(boxOneA3Word);}
    
    String boxOneB1Word = gui.txtBoxOneB1.getText();
    int boxOneB1 = 0;
    if(tools.isNumber(boxOneB1Word)){
    boxOneB1 = Integer.parseInt(boxOneB1Word);}

    String boxOneB2Word = gui.txtBoxOneB2.getText();
    int boxOneB2 = 0;
    if(tools.isNumber(boxOneB2Word)){
    boxOneB2 = Integer.parseInt(boxOneB2Word);}

    String boxOneB3Word = gui.txtBoxOneB3.getText();
    int boxOneB3 = 0;
    if(tools.isNumber(boxOneB3Word)){
    boxOneB3 = Integer.parseInt(boxOneB3Word);}

    String boxOneC1Word = gui.txtBoxOneC1.getText();
    int boxOneC1 = 0;
    if(tools.isNumber(boxOneC1Word)){
    boxOneC1 = Integer.parseInt(boxOneC1Word);}

    String boxOneC2Word = gui.txtBoxOneC2.getText();
    int boxOneC2 = 0;
    if(tools.isNumber(boxOneC2Word)){
    boxOneC2 = Integer.parseInt(boxOneC2Word);}

    String boxOneC3Word = gui.txtBoxOneC3.getText();
    int boxOneC3 = 0;
    if(tools.isNumber(boxOneC3Word)){
    boxOneC3 = Integer.parseInt(boxOneC3Word);}

    /* retreived informtion for matrix two */
    
    String boxTwoA1Word = gui.txtBoxTwoA1.getText();
    int boxTwoA1 = 0;
    if(tools.isNumber(boxTwoA1Word)){
    boxTwoA1 = Integer.parseInt(boxTwoA1Word);}

    String boxTwoA2Word = gui.txtBoxTwoA2.getText();
    int boxTwoA2 = 0;
    if(tools.isNumber(boxTwoA2Word)){
    boxTwoA2 = Integer.parseInt(boxTwoA2Word);}
    
    String boxTwoA3Word = gui.txtBoxTwoA3.getText();
    int boxTwoA3 = 0;
    if(tools.isNumber(boxTwoA3Word)){
    boxTwoA3 = Integer.parseInt(boxTwoA3Word);}
    
    String boxTwoB1Word = gui.txtBoxTwoB1.getText();
    int boxTwoB1 = 0;
    if(tools.isNumber(boxTwoB1Word)){
    boxTwoB1 = Integer.parseInt(boxTwoB1Word);}

    String boxTwoB2Word = gui.txtBoxTwoB2.getText();
    int boxTwoB2 = 0;
    if(tools.isNumber(boxTwoB2Word)){
    boxTwoB2 = Integer.parseInt(boxTwoB2Word);}

    String boxTwoB3Word = gui.txtBoxTwoB3.getText();
    int boxTwoB3 = 0;
    if(tools.isNumber(boxTwoB3Word)){
    boxTwoB3 = Integer.parseInt(boxTwoB3Word);}

    String boxTwoC1Word = gui.txtBoxTwoC1.getText();
    int boxTwoC1 = 0;
    if(tools.isNumber(boxTwoC1Word)){
    boxTwoC1 = Integer.parseInt(boxTwoC1Word);}

    String boxTwoC2Word = gui.txtBoxTwoC2.getText();
    int boxTwoC2 = 0;
    if(tools.isNumber(boxTwoC2Word)){
    boxTwoC2 = Integer.parseInt(boxTwoC2Word);}

    String boxTwoC3Word = gui.txtBoxTwoC3.getText();
    int boxTwoC3 = 0;
    if(tools.isNumber(boxTwoC3Word)){
    boxTwoC3 = Integer.parseInt(boxTwoC3Word);}

    
    /* addition function */

    String boxResultA1 = "" + (boxOneA1 + boxTwoA1);
    String boxResultA2 = "" + (boxOneA2 + boxTwoA2);
    String boxResultA3 = "" + (boxOneA3 + boxTwoA3);
    String boxResultB1 = "" + (boxOneB1 + boxTwoB1);
    String boxResultB2 = "" + (boxOneB2 + boxTwoB2);
    String boxResultB3 = "" + (boxOneB3 + boxTwoB3);
    String boxResultC1 = "" + (boxOneC1 + boxTwoC1);
    String boxResultC2 = "" + (boxOneC2 + boxTwoC2);
    String boxResultC3 = "" + (boxOneC3 + boxTwoC3);

    gui.txtBoxResultA1.setText("" + boxResultA1);
    gui.txtBoxResultA2.setText("" + boxResultA2);
    gui.txtBoxResultA3.setText("" + boxResultA3);
    gui.txtBoxResultB1.setText("" + boxResultB1);
    gui.txtBoxResultB2.setText("" + boxResultB2);
    gui.txtBoxResultB3.setText("" + boxResultB3);
    gui.txtBoxResultC1.setText("" + boxResultC1);
    gui.txtBoxResultC2.setText("" + boxResultC2);
    gui.txtBoxResultC3.setText("" + boxResultC3);

  });
}
/***********************************************************************            
    * Method name:
    * additionButton
    *
    * Description:
    * This method allows inputted value for matricies to be subtracted from one another to be calculated
    * and use it to produce a result in the resultant matrix.
    *
    * Parameters:
    * GUI subtraction button.
    *
    * Restrictions:
    * No restrictions.
    *
    * Return:
    * The correct values in the resultant matrix that have been specified by the user.
    *
    * Restrictions:
    * Use only Things learned in class.
    *
    ***********************************************************************/
    public void subtractionButton(Gui gui){
    gui.btnSubtraction.addActionListener( e -> {
      
        /* setting icon */
        gui.txtOperationIcon.setText("-");

        /* retreived informtion for matrix one */
    
        String boxOneA1Word = gui.txtBoxOneA1.getText();
        int boxOneA1 = 0;
        if(tools.isNumber(boxOneA1Word)){
        boxOneA1 = Integer.parseInt(boxOneA1Word);}
        
        String boxOneA2Word = gui.txtBoxOneA2.getText();
        int boxOneA2 = 0;
        if(tools.isNumber(boxOneA2Word)){
        boxOneA2 = Integer.parseInt(boxOneA2Word);}
        
        String boxOneA3Word = gui.txtBoxOneA3.getText();
        int boxOneA3 = 0;
        if(tools.isNumber(boxOneA3Word)){
        boxOneA3 = Integer.parseInt(boxOneA3Word);}
    
        String boxOneB1Word = gui.txtBoxOneB1.getText();
        int boxOneB1 = 0;
        if(tools.isNumber(boxOneB1Word)){
        boxOneB1 = Integer.parseInt(boxOneB1Word);}
        
        String boxOneB2Word = gui.txtBoxOneB2.getText();
        int boxOneB2 = 0;
        if(tools.isNumber(boxOneB2Word)){
        boxOneB2 = Integer.parseInt(boxOneB2Word);}

        String boxOneB3Word = gui.txtBoxOneB3.getText();
        int boxOneB3 = 0;
        if(tools.isNumber(boxOneB3Word)){
        boxOneB3 = Integer.parseInt(boxOneB3Word);}
    
        String boxOneC1Word = gui.txtBoxOneC1.getText();
        int boxOneC1 = 0;
        if(tools.isNumber(boxOneC1Word)){
        boxOneC1 = Integer.parseInt(boxOneC1Word);}

        String boxOneC2Word = gui.txtBoxOneC2.getText();
        int boxOneC2 = 0;
        if(tools.isNumber(boxOneC2Word)){
        boxOneC2 = Integer.parseInt(boxOneC2Word);}

        String boxOneC3Word = gui.txtBoxOneC3.getText();
        int boxOneC3 = 0;
        if(tools.isNumber(boxOneC3Word)){
        boxOneC3 = Integer.parseInt(boxOneC3Word);}

        /* retreived informtion for matrix two */
    
        String boxTwoA1Word = gui.txtBoxTwoA1.getText();
        int boxTwoA1 = 0;
        if(tools.isNumber(boxTwoA1Word)){
        boxTwoA1 = Integer.parseInt(boxTwoA1Word);}

        String boxTwoA2Word = gui.txtBoxTwoA2.getText();
        int boxTwoA2 = 0;
        if(tools.isNumber(boxTwoA2Word)){
        boxTwoA2 = Integer.parseInt(boxTwoA2Word);}
    
        String boxTwoA3Word = gui.txtBoxTwoA3.getText();
        int boxTwoA3 = 0;
        if(tools.isNumber(boxTwoA3Word)){
        boxTwoA3 = Integer.parseInt(boxTwoA3Word);}
    
        String boxTwoB1Word = gui.txtBoxTwoB1.getText();
        int boxTwoB1 = 0;
        if(tools.isNumber(boxTwoB1Word)){
        boxTwoB1 = Integer.parseInt(boxTwoB1Word);}

        String boxTwoB2Word = gui.txtBoxTwoB2.getText();
        int boxTwoB2 = 0;
        if(tools.isNumber(boxTwoB2Word)){
        boxTwoB2 = Integer.parseInt(boxTwoB2Word);}

        String boxTwoB3Word = gui.txtBoxTwoB3.getText();
        int boxTwoB3 = 0;
        if(tools.isNumber(boxTwoB3Word)){
        boxTwoB3 = Integer.parseInt(boxTwoB3Word);}

        String boxTwoC1Word = gui.txtBoxTwoC1.getText();
        int boxTwoC1 = 0;
        if(tools.isNumber(boxTwoC1Word)){
        boxTwoC1 = Integer.parseInt(boxTwoC1Word);}

        String boxTwoC2Word = gui.txtBoxTwoC2.getText();
        int boxTwoC2 = 0;
        if(tools.isNumber(boxTwoC2Word)){
        boxTwoC2 = Integer.parseInt(boxTwoC2Word);}

        String boxTwoC3Word = gui.txtBoxTwoC3.getText();
        int boxTwoC3 = 0;
        if(tools.isNumber(boxTwoC3Word)){
        boxTwoC3 = Integer.parseInt(boxTwoC3Word);}

        /* initializing variables for result matrix */
    
        int boxResultA1;
        int boxResultA2;
        int boxResultA3;
        int boxResultB1;
        int boxResultB2;
        int boxResultB3;
        int boxResultC1;
        int boxResultC2;
        int boxResultC3;
      
        /* subtraction function */
        boxResultA1 = boxOneA1 - boxTwoA1;
        boxResultA2 = boxOneA2 - boxTwoA2;
        boxResultA3 = boxOneA3 - boxTwoA3;
        boxResultB1 = boxOneB1 - boxTwoB1;
        boxResultB2 = boxOneB2 - boxTwoB2;
        boxResultB3 = boxOneB3 - boxTwoB3;
        boxResultC1 = boxOneC1 - boxTwoC1;
        boxResultC2 = boxOneC2 - boxTwoC2;
        boxResultC3 = boxOneC3 - boxTwoC3;

      /* displaying answer */
        
    gui.txtBoxResultA1.setText("" + boxResultA1);
    gui.txtBoxResultA2.setText("" + boxResultA2);
    gui.txtBoxResultA3.setText("" + boxResultA3);
    gui.txtBoxResultB1.setText("" + boxResultB1);
    gui.txtBoxResultB2.setText("" + boxResultB2);
    gui.txtBoxResultB3.setText("" + boxResultB3);
    gui.txtBoxResultC1.setText("" + boxResultC1);
    gui.txtBoxResultC2.setText("" + boxResultC2);
    gui.txtBoxResultC3.setText("" + boxResultC3);

    });
  }

/***********************************************************************            
    * Method name:
    * scalarButton
    *
    * Description:
    * This method allows inputted value for matricies to be multiplied by a constant value in each cell
    * and use it to produce a result in the resultant matrix.
    *
    * Parameters:
    * GUI scalar button.
    *
    * Restrictions:
    * No restrictions.
    *
    * Return:
    * The correct values in the resultant matrix that have been specified by the user.
    *
    * Restrictions:
    * Use only Things learned in class.
    *
    ***********************************************************************/
public void scalarButton(Gui gui){
    gui.btnScalar.addActionListener( e -> {

    /* setting icon */
    gui.txtOperationIcon.setText("*");

    /* picking sclalar quantity */
    int scalarValue = Integer.parseInt(JOptionPane.showInputDialog("Input a scalar value:"));
    int matrixSelection = Integer.parseInt(JOptionPane.showInputDialog("Select which matrix (Type: 1 or 2)"));

    /* retreived informtion for matrix one */
    
    String boxOneA1Word = gui.txtBoxOneA1.getText();
    int boxOneA1 = 0;
    if(tools.isNumber(boxOneA1Word)){
    boxOneA1 = Integer.parseInt(boxOneA1Word);}

    String boxOneA2Word = gui.txtBoxOneA2.getText();
    int boxOneA2 = 0;
    if(tools.isNumber(boxOneA2Word)){
    boxOneA2 = Integer.parseInt(boxOneA2Word);}
    
    String boxOneA3Word = gui.txtBoxOneA3.getText();
    int boxOneA3 = 0;
    if(tools.isNumber(boxOneA3Word)){
    boxOneA3 = Integer.parseInt(boxOneA3Word);}
    
    String boxOneB1Word = gui.txtBoxOneB1.getText();
    int boxOneB1 = 0;
    if(tools.isNumber(boxOneB1Word)){
    boxOneB1 = Integer.parseInt(boxOneB1Word);}

    String boxOneB2Word = gui.txtBoxOneB2.getText();
    int boxOneB2 = 0;
    if(tools.isNumber(boxOneB2Word)){
    boxOneB2 = Integer.parseInt(boxOneB2Word);}

    String boxOneB3Word = gui.txtBoxOneB3.getText();
    int boxOneB3 = 0;
    if(tools.isNumber(boxOneB3Word)){
    boxOneB3 = Integer.parseInt(boxOneB3Word);}
    
    String boxOneC1Word = gui.txtBoxOneC1.getText();
    int boxOneC1 = 0;
    if(tools.isNumber(boxOneC1Word)){
    boxOneC1 = Integer.parseInt(boxOneC1Word);}

    String boxOneC2Word = gui.txtBoxOneC2.getText();
    int boxOneC2 = 0;
    if(tools.isNumber(boxOneC2Word)){
    boxOneC2 = Integer.parseInt(boxOneC2Word);}

    String boxOneC3Word = gui.txtBoxOneC3.getText();
    int boxOneC3 = 0;
    if(tools.isNumber(boxOneC3Word)){
    boxOneC3 = Integer.parseInt(boxOneC3Word);}

    /* retreived informtion for matrix two */
    
    String boxTwoA1Word = gui.txtBoxTwoA1.getText();
    int boxTwoA1 = 0;
    if(tools.isNumber(boxTwoA1Word)){
    boxTwoA1 = Integer.parseInt(boxTwoA1Word);}

    String boxTwoA2Word = gui.txtBoxTwoA2.getText();
    int boxTwoA2 = 0;
    if(tools.isNumber(boxTwoA2Word)){
    boxTwoA2 = Integer.parseInt(boxTwoA2Word);}
    
    String boxTwoA3Word = gui.txtBoxTwoA3.getText();
    int boxTwoA3 = 0;
    if(tools.isNumber(boxTwoA3Word)){
    boxTwoA3 = Integer.parseInt(boxTwoA3Word);}
    
    String boxTwoB1Word = gui.txtBoxTwoB1.getText();
    int boxTwoB1 = 0;
    if(tools.isNumber(boxTwoB1Word)){
    boxTwoB1 = Integer.parseInt(boxTwoB1Word);}

    String boxTwoB2Word = gui.txtBoxTwoB2.getText();
    int boxTwoB2 = 0;
    if(tools.isNumber(boxTwoB2Word)){
    boxTwoB2 = Integer.parseInt(boxTwoB2Word);}

    String boxTwoB3Word = gui.txtBoxTwoB3.getText();
    int boxTwoB3 = 0;
    if(tools.isNumber(boxTwoB3Word)){
    boxTwoB3 = Integer.parseInt(boxTwoB3Word);}

    
    String boxTwoC1Word = gui.txtBoxTwoC1.getText();
    int boxTwoC1 = 0;
    if(tools.isNumber(boxTwoC1Word)){
    boxTwoC1 = Integer.parseInt(boxTwoC1Word);}

    String boxTwoC2Word = gui.txtBoxTwoC2.getText();
    int boxTwoC2 = 0;
    if(tools.isNumber(boxTwoC2Word)){
    boxTwoC2 = Integer.parseInt(boxTwoC2Word);}

    String boxTwoC3Word = gui.txtBoxTwoC3.getText();
    int boxTwoC3 = 0;
    if(tools.isNumber(boxTwoC3Word)){
    boxTwoC3 = Integer.parseInt(boxTwoC3Word);}
    

    /* initializing variables for result matrix */
    
    int boxResultA1;
    int boxResultA2;
    int boxResultA3;
    int boxResultB1;
    int boxResultB2;
    int boxResultB3;
    int boxResultC1;
    int boxResultC2;
    int boxResultC3;
    
    /* scalar function */

    if(matrixSelection == 1){
      boxResultA1 = boxOneA1 * scalarValue;
      boxResultA2 = boxOneA2 * scalarValue;
      boxResultA3 = boxOneA3 * scalarValue;
      boxResultB1 = boxOneB1 * scalarValue;
      boxResultB2 = boxOneB2 * scalarValue;
      boxResultB3 = boxOneB3 * scalarValue;
      boxResultC1 = boxOneC1 * scalarValue;
      boxResultC2 = boxOneC2 * scalarValue;
      boxResultC3 = boxOneC3 * scalarValue;

/* setting answer for matrix 1 */

      gui.txtBoxResultA1.setText("" + boxResultA1);
    gui.txtBoxResultA2.setText("" + boxResultA2);
    gui.txtBoxResultA3.setText("" + boxResultA3);
    gui.txtBoxResultB1.setText("" + boxResultB1);
    gui.txtBoxResultB2.setText("" + boxResultB2);
    gui.txtBoxResultB3.setText("" + boxResultB3);
    gui.txtBoxResultC1.setText("" + boxResultC1);
    gui.txtBoxResultC2.setText("" + boxResultC2);
    gui.txtBoxResultC3.setText("" + boxResultC3);
    }else{
      boxResultA1 = boxTwoA1 * scalarValue;
      boxResultA2 = boxTwoA2 * scalarValue;
      boxResultA3 = boxTwoA3 * scalarValue;
      boxResultB1 = boxTwoB1 * scalarValue;
      boxResultB2 = boxTwoB2 * scalarValue;
      boxResultB3 = boxTwoB3 * scalarValue;
      boxResultC1 = boxTwoC1 * scalarValue;
      boxResultC2 = boxTwoC2 * scalarValue;
      boxResultC3 = boxTwoC3 * scalarValue;

/* setting answer for matrix 2 */
      gui.txtBoxResultA1.setText("" + boxResultA1);
    gui.txtBoxResultA2.setText("" + boxResultA2);
    gui.txtBoxResultA3.setText("" + boxResultA3);
    gui.txtBoxResultB1.setText("" + boxResultB1);
    gui.txtBoxResultB2.setText("" + boxResultB2);
    gui.txtBoxResultB3.setText("" + boxResultB3);
    gui.txtBoxResultC1.setText("" + boxResultC1);
    gui.txtBoxResultC2.setText("" + boxResultC2);
    gui.txtBoxResultC3.setText("" + boxResultC3);
    }

    });
  }

/***********************************************************************            
    * Method name:
    * multiplycationButton
    *
    * Description:
    * This method allows inputted value for matricies to be multiplied together and columns longitude and latitude to be calculated
    * and use it to produce a result in the resultant matrix.
    *
    * Parameters:
    * GUI multiplication button.
    *
    * Restrictions:
    * No restrictions.
    *
    * Return:
    * The correct values in the resultant matrix that have been specified by the user.
    *
    * Restrictions:
    * Use only Things learned in class.
    *
    ***********************************************************************/
  public void multiplicationButton(Gui gui){
    gui.btnMultiplication.addActionListener( e -> {

      /* setting icon */
    gui.txtOperationIcon.setText("x");

    /* retreived informtion for matrix one */
    
    String boxOneA1Word = gui.txtBoxOneA1.getText();
        int boxOneA1 = 0;
        if(tools.isNumber(boxOneA1Word)){
        boxOneA1 = Integer.parseInt(boxOneA1Word);}
        
        String boxOneA2Word = gui.txtBoxOneA2.getText();
        int boxOneA2 = 0;
        if(tools.isNumber(boxOneA2Word)){
        boxOneA2 = Integer.parseInt(boxOneA2Word);}
        
        String boxOneA3Word = gui.txtBoxOneA3.getText();
        int boxOneA3 = 0;
        if(tools.isNumber(boxOneA3Word)){
        boxOneA3 = Integer.parseInt(boxOneA3Word);}
    
        String boxOneB1Word = gui.txtBoxOneB1.getText();
        int boxOneB1 = 0;
        if(tools.isNumber(boxOneB1Word)){
        boxOneB1 = Integer.parseInt(boxOneB1Word);}
        
        String boxOneB2Word = gui.txtBoxOneB2.getText();
        int boxOneB2 = 0;
        if(tools.isNumber(boxOneB2Word)){
        boxOneB2 = Integer.parseInt(boxOneB2Word);}

        String boxOneB3Word = gui.txtBoxOneB3.getText();
        int boxOneB3 = 0;
        if(tools.isNumber(boxOneB3Word)){
        boxOneB3 = Integer.parseInt(boxOneB3Word);}
    
        String boxOneC1Word = gui.txtBoxOneC1.getText();
        int boxOneC1 = 0;
        if(tools.isNumber(boxOneC1Word)){
        boxOneC1 = Integer.parseInt(boxOneC1Word);}

        String boxOneC2Word = gui.txtBoxOneC2.getText();
        int boxOneC2 = 0;
        if(tools.isNumber(boxOneC2Word)){
        boxOneC2 = Integer.parseInt(boxOneC2Word);}

        String boxOneC3Word = gui.txtBoxOneC3.getText();
        int boxOneC3 = 0;
        if(tools.isNumber(boxOneC3Word)){
        boxOneC3 = Integer.parseInt(boxOneC3Word);}

        /* retreived informtion for matrix two */
    
        String boxTwoA1Word = gui.txtBoxTwoA1.getText();
        int boxTwoA1 = 0;
        if(tools.isNumber(boxTwoA1Word)){
        boxTwoA1 = Integer.parseInt(boxTwoA1Word);}

        String boxTwoA2Word = gui.txtBoxTwoA2.getText();
        int boxTwoA2 = 0;
        if(tools.isNumber(boxTwoA2Word)){
        boxTwoA2 = Integer.parseInt(boxTwoA2Word);}
    
        String boxTwoA3Word = gui.txtBoxTwoA3.getText();
        int boxTwoA3 = 0;
        if(tools.isNumber(boxTwoA3Word)){
        boxTwoA3 = Integer.parseInt(boxTwoA3Word);}
    
        String boxTwoB1Word = gui.txtBoxTwoB1.getText();
        int boxTwoB1 = 0;
        if(tools.isNumber(boxTwoB1Word)){
        boxTwoB1 = Integer.parseInt(boxTwoB1Word);}

        String boxTwoB2Word = gui.txtBoxTwoB2.getText();
        int boxTwoB2 = 0;
        if(tools.isNumber(boxTwoB2Word)){
        boxTwoB2 = Integer.parseInt(boxTwoB2Word);}

        String boxTwoB3Word = gui.txtBoxTwoB3.getText();
        int boxTwoB3 = 0;
        if(tools.isNumber(boxTwoB3Word)){
        boxTwoB3 = Integer.parseInt(boxTwoB3Word);}

        String boxTwoC1Word = gui.txtBoxTwoC1.getText();
        int boxTwoC1 = 0;
        if(tools.isNumber(boxTwoC1Word)){
        boxTwoC1 = Integer.parseInt(boxTwoC1Word);}

        String boxTwoC2Word = gui.txtBoxTwoC2.getText();
        int boxTwoC2 = 0;
        if(tools.isNumber(boxTwoC2Word)){
        boxTwoC2 = Integer.parseInt(boxTwoC2Word);}

        String boxTwoC3Word = gui.txtBoxTwoC3.getText();
        int boxTwoC3 = 0;
        if(tools.isNumber(boxTwoC3Word)){
        boxTwoC3 = Integer.parseInt(boxTwoC3Word);}

        /* initializing variables for result matrix */
    
        int boxResultA1;
        int boxResultA2;
        int boxResultA3;
        int boxResultB1;
        int boxResultB2;
        int boxResultB3;
        int boxResultC1;
        int boxResultC2;
        int boxResultC3;
      
        /* subtraction function */
        boxResultA1 = boxOneA1 * boxTwoA1;
        boxResultA2 = boxOneA2 * boxTwoA2;
        boxResultA3 = boxOneA3 * boxTwoA3;
        boxResultB1 = boxOneB1 * boxTwoB1;
        boxResultB2 = boxOneB2 * boxTwoB2;
        boxResultB3 = boxOneB3 * boxTwoB3;
        boxResultC1 = boxOneC1 * boxTwoC1;
        boxResultC2 = boxOneC2 * boxTwoC2;
        boxResultC3 = boxOneC3 * boxTwoC3;

      /* displaying answer */
        
    gui.txtBoxResultA1.setText("" + boxResultA1);
    gui.txtBoxResultA2.setText("" + boxResultA2);
    gui.txtBoxResultA3.setText("" + boxResultA3);
    gui.txtBoxResultB1.setText("" + boxResultB1);
    gui.txtBoxResultB2.setText("" + boxResultB2);
    gui.txtBoxResultB3.setText("" + boxResultB3);
    gui.txtBoxResultC1.setText("" + boxResultC1);
    gui.txtBoxResultC2.setText("" + boxResultC2);
    gui.txtBoxResultC3.setText("" + boxResultC3);

    });
  }

/***********************************************************************            
    * Method name:
    * clearButton
    *
    * Description:
    * This method allows inputted value for matricies to be cleared so the fields are empty.
    *
    * Parameters:
    * GUI clear button.
    *
    * Restrictions:
    * No restrictions.
    *
    * Return:
    * Empty fields.
    *
    * Restrictions:
    * Use only Things learned in class.
    *
    ***********************************************************************/
  public void clearButton(Gui gui){
    gui.btnClear.addActionListener( e -> {

      tools.clearDimensions(gui);
      
    });
  }

/***********************************************************************            
    * Method name:
    * exitButton
    *
    * Description:
    * This method allows the program to be exited.
    *
    * Parameters:
    * GUI exit button.
    *
    * Restrictions:
    * No restrictions.
    *
    * Return:
    * An exited program.
    * 
    * Restrictions:
    * Use only Things learned in class.
    *
    ***********************************************************************/
  public void exitButton(Gui gui){
    gui.btnExit.addActionListener( e -> {

      System.exit(0);
      
    });
  }

}