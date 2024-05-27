import javax.swing.*;
import java.util.*;
public class Text {
    
    public void dataReader(Gui gui){
        
        /*creating a scanner*/
        Scanner sc1 = new Scanner(System.in);
        
        /* creating a prompt to close GUI */
        System.out.println("Would you like to close the GUI (Yes: 1 | No: 2).");
        
        /* recording user response */
        int closeGraphics = sc1.nextInt();
        
        /* utilizing user response */
        if(closeGraphics == 1){
            gui.frmMain.setVisible(false);
            System.out.println("\n" + "Please enter the name of your matrix file:");
            
        }else{
            System.out.println("Understood.");
        }
        
        /* understanding the file being accessed */
        String fileName = sc1.next();
        
        /* creating a scanner capale of working in the file */
        Scanner sc2 = new Scanner(Text.class.getResourceAsStream(fileName));
        final int MAX_CHARS = 100;
        
        /* finding the frist matrix */        
        sc2.findWithinHorizon("Matrix 1:", MAX_CHARS);
        sc2.nextLine();

        /* stroring information from file */
        
        
        int oneA1 = sc2.nextInt();
        int oneA2 = sc2.nextInt();
        int oneA3 = sc2.nextInt();
        sc2.nextLine();
        int oneB1 = sc2.nextInt();
        int oneB2 = sc2.nextInt();
        int oneB3 = sc2.nextInt();
        sc2.nextLine();
        int oneC1 = sc2.nextInt();
        int oneC2 = sc2.nextInt();
        int oneC3 = sc2.nextInt();

        /* finding second matrix */
        sc2.findWithinHorizon("Matrix 2:", MAX_CHARS);
        sc2.nextLine();
        int twoA1 = sc2.nextInt();
        int twoA2 = sc2.nextInt();
        int twoA3 = sc2.nextInt();
        sc2.nextLine();
        int twoB1 = sc2.nextInt();
        int twoB2 = sc2.nextInt();
        int twoB3 = sc2.nextInt();
        sc2.nextLine();
        int twoC1 = sc2.nextInt();
        int twoC2 = sc2.nextInt();
        int twoC3 = sc2.nextInt();

        /* displaying extracted information and confirming */
        System.out.println("\n" + "Matrix 1:\n" + oneA1 + " " + oneA2 + " " + oneA3 + "\n" + 
                           oneB1 + " " + oneB2 + " " + oneB3 + "\n" + 
                           oneC1 + " " + oneC2 + " " + oneC3 + "\n" + 
                           "Matrix 2:\n" + twoA1 + " " + twoA2 + " " + twoA3 + "\n" + 
                           twoB1 + " " + twoB2 + " " + twoB3 + "\n" + 
                           twoC1 + " " + twoC2 + " " + twoC3 + "\n\n" + "Is this information correct? (Yes: 1 | No: 2)");
        
        /* obtaining information from confirmation */
        int dataCheck = sc1.nextInt();
        
        /* prompting what operation is wished to be used */
        if(dataCheck == 1){
            System.out.println("\n" + "Would you like to: Add: 1 | Subtract: 2 | Scalar: 3 | Multiply: 4");
        }else{
            System.out.println("\n" + "Please correct the file and try again.");
        }
        
        /* obtaining information for wished operation */
        int operationSelection = sc1.nextInt();
        
        /* addition function */
        if(operationSelection == 1){
        
            int resultA1 = oneA1 + twoA1;
            int resultA2 = oneA2 + twoA2;
            int resultA3 = oneA3 + twoA3;
            int resultB1 = oneB1 + twoB1;
            int resultB2 = oneB2 + twoB2;
            int resultB3 = oneB3 + twoB3;
            int resultC1 = oneC1 + twoC1;
            int resultC2 = oneC2 + twoC2;
            int resultC3 = oneC3 + twoC3;
            
            System.out.println("\n" + "Matrix Result:" + "\n" 
                               + resultA1 + " " + resultA2 + " " + resultA3 + "\n"
                               + resultB1 + " " + resultB2 + " " + resultB3 + "\n"
                               + resultC1 + " " + resultC2 + " " + resultC3 + "\n");
        
        /* subtraction function */
        }else if(operationSelection == 2){
        
            int resultA1 = oneA1 - twoA1;
            int resultA2 = oneA2 - twoA2;
            int resultA3 = oneA3 - twoA3;
            int resultB1 = oneB1 - twoB1;
            int resultB2 = oneB2 - twoB2;
            int resultB3 = oneB3 - twoB3;
            int resultC1 = oneC1 - twoC1;
            int resultC2 = oneC2 - twoC2;
            int resultC3 = oneC3 - twoC3;
            
            System.out.println("\n" + "Matrix Result:" + "\n" 
                               + resultA1 + " " + resultA2 + " " + resultA3 + "\n"
                               + resultB1 + " " + resultB2 + " " + resultB3 + "\n"
                               + resultC1 + " " + resultC2 + " " + resultC3 + "\n");
        
        /* scalar function */
        }else if(operationSelection == 3){
            
            System.out.println("\n" + "Enter a scalar value:");
            int textScalarValue = sc1.nextInt();
            System.out.println("\n" + "Select a matrix ( 1 | 2 ):");
            int textMatrixSelection = sc1.nextInt();
            
            if(textMatrixSelection == 1){
            int resultA1 = oneA1 * textScalarValue;
            int resultA2 = oneA2 * textScalarValue;
            int resultA3 = oneA3 * textScalarValue;
            int resultB1 = oneB1 * textScalarValue;
            int resultB2 = oneB2 * textScalarValue;
            int resultB3 = oneB3 * textScalarValue;
            int resultC1 = oneC1 * textScalarValue;
            int resultC2 = oneC2 * textScalarValue;
            int resultC3 = oneC3 * textScalarValue;
            
            System.out.println("\n" + "Matrix Result:" + "\n" 
                               + resultA1 + " " + resultA2 + " " + resultA3 + "\n"
                               + resultB1 + " " + resultB2 + " " + resultB3 + "\n"
                               + resultC1 + " " + resultC2 + " " + resultC3 + "\n");
        
            }else{
            int resultA1 = twoA1 * textScalarValue;
            int resultA2 = twoA2 * textScalarValue;
            int resultA3 = twoA3 * textScalarValue;
            int resultB1 = twoB1 * textScalarValue;
            int resultB2 = twoB2 * textScalarValue;
            int resultB3 = twoB3 * textScalarValue;
            int resultC1 = twoC1 * textScalarValue;
            int resultC2 = twoC2 * textScalarValue;
            int resultC3 = twoC3 * textScalarValue;
            
            System.out.println("\n" + "Matrix Result:" + "\n" 
                               + resultA1 + " " + resultA2 + " " + resultA3 + "\n"
                               + resultB1 + " " + resultB2 + " " + resultB3 + "\n"
                               + resultC1 + " " + resultC2 + " " + resultC3 + "\n");
        
            }
        
        /* multiplication function */
        }else if(operationSelection == 4){
            int resultA1 = oneA1 * twoA1;
            int resultA2 = oneA2 * twoA2;
            int resultA3 = oneA3 * twoA3;
            int resultB1 = oneB1 * twoB1;
            int resultB2 = oneB2 * twoB2;
            int resultB3 = oneB3 * twoB3;
            int resultC1 = oneC1 * twoC1;
            int resultC2 = oneC2 * twoC2;
            int resultC3 = oneC3 * twoC3;
            
            System.out.println("\n" + "Matrix Result:" + "\n" 
                               + resultA1 + " " + resultA2 + " " + resultA3 + "\n"
                               + resultB1 + " " + resultB2 + " " + resultB3 + "\n"
                               + resultC1 + " " + resultC2 + " " + resultC3 + "\n");
        }
        
        
        
    }
}