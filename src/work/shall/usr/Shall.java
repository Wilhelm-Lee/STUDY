package work.shall.usr;

import base.essention.BasicFunctions;
import base.execute.ProcessIO;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
public class Shall {

    private String inputLine;

    public String getInputLine() {
        return inputLine;
    }

    public void setInputLine( String inputLine ) {
        this.inputLine = inputLine;
    }

    public Shall() {
        BasicFunctions.greetings();
        setInputLine( new ProcessIO.ProcessInput().getInputResult() );

/* TODO:
        ProcessFile.FileCreator fileCreator = new ProcessFile.FileCreator();
        final File history = new File( BasicVariables. )
        fileCreator.onCreate(  )
*/
    }

}
