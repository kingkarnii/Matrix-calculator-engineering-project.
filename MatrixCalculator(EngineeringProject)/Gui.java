import javax.swing.*;
import java.util.*;
public class Gui 
{// start of GUI class
    
    /*** creating GUI ***/
            
    /** Initializing Editable Fields **/
    
    /* initializing JFrame (gui frame) */
    public JFrame frmMain = new JFrame();
    
    /* initializing JTextField (operation icon) */
    public JTextField txtOperationIcon = new JTextField();
    
    /* initializing JButtons (operation buttons) */
    public JButton btnAddition = new JButton("+");
    public JButton btnSubtraction = new JButton("-");
    public JButton btnScalar = new JButton("*");
    public JButton btnMultiplication = new JButton("x");
    public JButton btnEnter = new JButton("Enter");
    public JButton btnClear = new JButton("Clear");
    public JButton btnExit = new JButton("Exit");
    
    /* initializing JTextFields (matrix size input) */
    public JTextField txtRowAmount = new JTextField();
    public JTextField txtColumnAmount = new JTextField();

    /* initializing JTextFields (matrix one value input) */
    public JTextField txtBoxOneA1 = new JTextField();
    public JTextField txtBoxOneA2 = new JTextField();
    public JTextField txtBoxOneA3 = new JTextField();
    public JTextField txtBoxOneB1 = new JTextField();
    public JTextField txtBoxOneB2 = new JTextField();
    public JTextField txtBoxOneB3 = new JTextField();
    public JTextField txtBoxOneC1 = new JTextField();
    public JTextField txtBoxOneC2 = new JTextField();
    public JTextField txtBoxOneC3 = new JTextField();

    /* initializing JTextFields (matrix two value input) */
    public JTextField txtBoxTwoA1 = new JTextField();
    public JTextField txtBoxTwoA2 = new JTextField();
    public JTextField txtBoxTwoA3 = new JTextField();
    public JTextField txtBoxTwoB1 = new JTextField();
    public JTextField txtBoxTwoB2 = new JTextField();
    public JTextField txtBoxTwoB3 = new JTextField();
    public JTextField txtBoxTwoC1 = new JTextField();
    public JTextField txtBoxTwoC2 = new JTextField();
    public JTextField txtBoxTwoC3 = new JTextField();

    /* initializing JTextFields (matrix result value output) */
    public JTextField txtBoxResultA1 = new JTextField();
    public JTextField txtBoxResultA2 = new JTextField();
    public JTextField txtBoxResultA3 = new JTextField();
    public JTextField txtBoxResultB1 = new JTextField();
    public JTextField txtBoxResultB2 = new JTextField();
    public JTextField txtBoxResultB3 = new JTextField();
    public JTextField txtBoxResultC1 = new JTextField();
    public JTextField txtBoxResultC2 = new JTextField();
    public JTextField txtBoxResultC3 = new JTextField();

    public void frame()
    { // start of GUI frame
        
        /** program frame **/
        
        /* inserting JFrame */
            frmMain.setSize(350, 580);
            frmMain.setLayout(null);
        

        /** title input **/

        /* inserting JLabel (program title) */
        JLabel lblTitle = new JLabel("Matrix Calculator");
        lblTitle.setBounds(115, 5, 120, 20);
        frmMain.add(lblTitle);
        

        /** matrices size determination **/

        /* inserting JLabel (rows title) */
        JLabel lblRows = new JLabel("Rows:");
        lblRows.setBounds(0, 35, 100, 20);
        frmMain.add(lblRows);

        /* inserting JTextField (row amount input) */
        txtRowAmount.setBounds(0, 55, 150, 20);
        txtRowAmount.setEditable(true);
        frmMain.add(txtRowAmount);

        /* inserting JLabel (columns title) */
        JLabel lblColumns = new JLabel("Columns:");
        lblColumns.setBounds(200, 35, 100, 20);
        frmMain.add(lblColumns);
        
        /* inserting JTextField (column amount input) */
        txtColumnAmount.setBounds(200, 55, 150, 20);
        txtColumnAmount.setEditable(true);
        frmMain.add(txtColumnAmount);

        /* inserting JextFields (matrix one input) */
        txtBoxOneA1.setBounds(0, 105, 50, 50);
        txtBoxOneA1.setEditable(false);
        frmMain.add(txtBoxOneA1);
        txtBoxOneA1.setHorizontalAlignment(JTextField.CENTER);

        txtBoxOneA2.setBounds(50, 105, 50, 50);
        txtBoxOneA2.setEditable(false);
        frmMain.add(txtBoxOneA2);
        txtBoxOneA2.setHorizontalAlignment(JTextField.CENTER);

        txtBoxOneA3.setBounds(100, 105, 50, 50);
        txtBoxOneA3.setEditable(false);
        frmMain.add(txtBoxOneA3);
        txtBoxOneA3.setHorizontalAlignment(JTextField.CENTER);

        txtBoxOneB1.setBounds(0, 155, 50, 50);
        txtBoxOneB1.setEditable(false);
        frmMain.add(txtBoxOneB1);
        txtBoxOneB1.setHorizontalAlignment(JTextField.CENTER);

        txtBoxOneB2.setBounds(50, 155, 50, 50);
        txtBoxOneB2.setEditable(false);
        frmMain.add(txtBoxOneB2);
        txtBoxOneB2.setHorizontalAlignment(JTextField.CENTER);

        txtBoxOneB3.setBounds(100, 155, 50, 50);
        txtBoxOneB3.setEditable(false);
        frmMain.add(txtBoxOneB3);
        txtBoxOneB3.setHorizontalAlignment(JTextField.CENTER);

        txtBoxOneC1.setBounds(0, 205, 50, 50);
        txtBoxOneC1.setEditable(false);
        frmMain.add(txtBoxOneC1);
        txtBoxOneC1.setHorizontalAlignment(JTextField.CENTER);

        txtBoxOneC2.setBounds(50, 205, 50, 50);
        txtBoxOneC2.setEditable(false);
        frmMain.add(txtBoxOneC2);
        txtBoxOneC2.setHorizontalAlignment(JTextField.CENTER);

        txtBoxOneC3.setBounds(100, 205, 50, 50);
        txtBoxOneC3.setEditable(false);
        frmMain.add(txtBoxOneC3);
        txtBoxOneC3.setHorizontalAlignment(JTextField.CENTER);

        /* inserting JextFields (matrix two input) */
        txtBoxTwoA1.setBounds(200, 105, 50, 50);
        txtBoxTwoA1.setEditable(false);
        frmMain.add(txtBoxTwoA1);
        txtBoxTwoA1.setHorizontalAlignment(JTextField.CENTER);

        txtBoxTwoA2.setBounds(250, 105, 50, 50);
        txtBoxTwoA2.setEditable(false);
        frmMain.add(txtBoxTwoA2);
        txtBoxTwoA2.setHorizontalAlignment(JTextField.CENTER);

        txtBoxTwoA3.setBounds(300, 105, 50, 50);
        txtBoxTwoA3.setEditable(false);
        frmMain.add(txtBoxTwoA3);
        txtBoxTwoA3.setHorizontalAlignment(JTextField.CENTER);

        txtBoxTwoB1.setBounds(200, 155, 50, 50);
        txtBoxTwoB1.setEditable(false);
        frmMain.add(txtBoxTwoB1);
        txtBoxTwoB1.setHorizontalAlignment(JTextField.CENTER);

        txtBoxTwoB2.setBounds(250, 155, 50, 50);
        txtBoxTwoB2.setEditable(false);
        frmMain.add(txtBoxTwoB2);
        txtBoxTwoB2.setHorizontalAlignment(JTextField.CENTER);

        txtBoxTwoB3.setBounds(300, 155, 50, 50);
        txtBoxTwoB3.setEditable(false);
        frmMain.add(txtBoxTwoB3);
        txtBoxTwoB3.setHorizontalAlignment(JTextField.CENTER);

        txtBoxTwoC1.setBounds(200, 205, 50, 50);
        txtBoxTwoC1.setEditable(false);
        frmMain.add(txtBoxTwoC1);
        txtBoxTwoC1.setHorizontalAlignment(JTextField.CENTER);

        txtBoxTwoC2.setBounds(250, 205, 50, 50);
        txtBoxTwoC2.setEditable(false);
        frmMain.add(txtBoxTwoC2);
        txtBoxTwoC2.setHorizontalAlignment(JTextField.CENTER);

        txtBoxTwoC3.setBounds(300, 205, 50, 50);
        txtBoxTwoC3.setEditable(false);
        frmMain.add(txtBoxTwoC3);
        txtBoxTwoC3.setHorizontalAlignment(JTextField.CENTER);


        /** operations input **/

        /* inserting JTextField (operation icon) */
        txtOperationIcon.setBounds(160, 165, 30, 30);
        txtOperationIcon.setEditable(false);
        frmMain.add(txtOperationIcon);
        txtOperationIcon.setHorizontalAlignment(JTextField.CENTER);
        
        /* inserting JLabel (operations title) */
        JLabel lblOperations = new JLabel("Opertations:");
        lblOperations.setBounds(0, 270, 100, 20);
        frmMain.add(lblOperations);

        /* inserting JButton (addition button) */
        btnAddition.setBounds(0, 290, 80, 80);
        frmMain.add(btnAddition);

        /* inserting JButton (subtraction button) */
        btnSubtraction.setBounds(90, 290, 80, 80);
        frmMain.add(btnSubtraction);

        /* inserting JButton (scalar button) */
        btnScalar.setBounds(180, 290, 80, 80);
        frmMain.add(btnScalar);

        /* inserting JButton (multiplication button) */
        btnMultiplication.setBounds(270, 290, 80, 80);
        frmMain.add(btnMultiplication);

        /* inserting JButton (enter button) */
        btnEnter.setBounds(0, 80, 350, 20);
        frmMain.add(btnEnter); 

        /* inserting JButton (clear button) */
        btnClear.setBounds(200, 460, 150, 50);
        frmMain.add(btnClear);

        /* inserting JButton (exit button) */
        btnExit.setBounds(200, 510, 150, 50);
        frmMain.add(btnExit);


        /** resultant matrix **/

        /* inserting JLabel (result title) */
        JLabel lblResult = new JLabel("Result:");
        lblResult.setBounds(0, 390, 100, 20);
        frmMain.add(lblResult);

        /* inserting JextFields (resultant matrix output) */
        txtBoxResultA1.setBounds(0, 410, 50, 50);
        txtBoxResultA1.setEditable(false);
        frmMain.add(txtBoxResultA1);

        txtBoxResultA2.setBounds(50, 410, 50, 50);
        txtBoxResultA2.setEditable(false);
        frmMain.add(txtBoxResultA2);

        txtBoxResultA3.setBounds(100, 410, 50, 50);
        txtBoxResultA3.setEditable(false);
        frmMain.add(txtBoxResultA3);

        txtBoxResultB1.setBounds(0, 460, 50, 50);
        txtBoxResultB1.setEditable(false);
        frmMain.add(txtBoxResultB1);

        txtBoxResultB2.setBounds(50, 460, 50, 50);
        txtBoxResultB2.setEditable(false);
        frmMain.add(txtBoxResultB2);

        txtBoxResultB3.setBounds(100, 460, 50, 50);
        txtBoxResultB3.setEditable(false);
        frmMain.add(txtBoxResultB3);

        txtBoxResultC1.setBounds(0, 510, 50, 50);
        txtBoxResultC1.setEditable(false);
        frmMain.add(txtBoxResultC1);

        txtBoxResultC2.setBounds(50, 510, 50, 50);
        txtBoxResultC2.setEditable(false);
        frmMain.add(txtBoxResultC2);

        txtBoxResultC3.setBounds(100, 510, 50, 50);
        txtBoxResultC3.setEditable(false);
        frmMain.add(txtBoxResultC3);

        /** visibility (making frame visible) **/
        frmMain.setVisible(true);
        
    } // end of GUI frame
}