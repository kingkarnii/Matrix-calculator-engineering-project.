public class Main
{
    public static void main(String[] args)
    {
        
        /* creating an instance of Gui class */
        Gui display = new Gui();
        display.frame();


        /* creating an instance of Actions class */
        Actions act = new Actions();

        /* calling enterButton */
        act.enterButton(display);

        /* calling additionButton */
        act.additionButton(display);

        /* calling subtractionButton */
        act.subtractionButton(display);

        /* calling scalarButton */
        act.scalarButton(display);

        /* calling multiplicationButton */
        act.multiplicationButton(display);

        /* calling clearButton */
        act.clearButton(display);
        
        /* calling exitButton */
        act.exitButton(display);
        
        
        /* creating an instance of Text class */
        Text txt = new Text();
        txt.dataReader(display);

    }
}