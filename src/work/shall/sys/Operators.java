package work.shall.sys;

import base.essention.exemplification.AbstractCommands;
import org.jetbrains.annotations.NotNull;

/**
 * @author william
 * This class is the instance of AbstractCommands
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
public class Operators
        extends AbstractCommands {


    /**
     * Initiate
     *
     * @param name initiate name of this command
     */
    protected Operators( @NotNull String name ) {
        super( name );
    }

    /**
     * Initiate
     *
     * @param name        initiate name of this command
     * @param subCommands initiate sub-commands of this command
     */
    protected Operators(
            @NotNull String name,
            @NotNull AbstractCommands subCommands
    ) {
        super(
                name,
                subCommands
        );
    }

    /**
     * Initiate
     *
     * @param initiation initiate by another command
     */
    protected Operators( @NotNull AbstractCommands initiation ) {
        super( initiation );
    }
}
