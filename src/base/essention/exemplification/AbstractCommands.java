package base.essention.exemplification;

import base.essention.exegesis.ProjectPrivacy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import work.shall.sys.Commands;
import work.speculator.exception.ActionOverAbstractiveException;

import static base.essention.BasicVariables.*;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
@ProjectPrivacy (level = 2)
public abstract class AbstractCommands {

    protected static final int DEFAULT_ARRAY_INITIATION_LENGTH = 10;
    private final @NotNull String name;
    protected int readLength;
    private @Nullable AbstractCommands ancestry;
    private @Nullable AbstractCommands[] successors;
    private String comment;
    private boolean isAsSubCommand;

    /**
     * Initiate by name
     *
     * @param name name of new AbstractCommands
     */
    protected AbstractCommands( @NotNull String name ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( null );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by name
     *
     * @param name    name of new AbstractCommands
     * @param comment comment of new AbstractCommands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull String comment
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( null );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name     name of new AbstractCommands
     * @param ancestry ancestry of new AbstractCommands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( null );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name     name of new AbstractCommands
     * @param ancestry ancestry of new AbstractCommands
     * @param comment  comment of new AbstractCommands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull String comment
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( null );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name       name of new AbstractCommands
     * @param ancestry   ancestry of new AbstractCommands
     * @param successors successors of new AbstractCommands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( successors );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name       name of new AbstractCommands
     * @param ancestry   ancestry of new AbstractCommands
     * @param successors successors of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( successors );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & successors
     *
     * @param name       name of new AbstractCommands
     * @param successors successors of new AbstractCommands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( successors );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & successors
     *
     * @param name       name of new AbstractCommands
     * @param successors successors of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( successors );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator AbstractCommands of new AbstractCommands
     */
    protected AbstractCommands(
            @NotNull AbstractCommands initiator
    ) {
        if ( initiator.getAncestry() == null ) {
            setAncestry( null );
        }

        if ( initiator.getSuccessors() == null ) {
            setSuccessors( null );
        }

        this.name = initiator.getName();
        setAncestry( initiator.getAncestry() );
        setSuccessors( initiator.getSuccessors() );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator AbstractCommands of new AbstractCommands
     * @param comment   comment of new AbstractCommands
     */
    protected AbstractCommands(
            @NotNull AbstractCommands initiator,
            @NotNull String comment
    ) {
        if ( initiator.getAncestry() == null ) {
            setAncestry( null );
        }

        if ( initiator.getSuccessors() == null ) {
            setSuccessors( null );
        }

        this.name = initiator.getName();
        setAncestry( initiator.getAncestry() );
        setSuccessors( initiator.getSuccessors() );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( 2 );
    }

    /**
     * Initiate by name
     *
     * @param name           name of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            boolean isAsSubCommand
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( null );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    /**
     * Initiate by name
     *
     * @param name           name of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( null );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            boolean isAsSubCommand
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( null );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( null );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            boolean isAsSubCommand
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( successors );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( successors );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & successors
     *
     * @param name           name of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            boolean isAsSubCommand
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( successors );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    /**
     * Initiate by name & successors
     *
     * @param name           name of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( successors );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator      AbstractCommands of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull AbstractCommands initiator,
            boolean isAsSubCommand
    ) {
        if ( initiator.getAncestry() == null ) {
            setAncestry( null );
        }

        if ( initiator.getSuccessors() == null ) {
            setSuccessors( null );
        }

        this.name = initiator.getName();
        setAncestry( initiator.getAncestry() );
        setSuccessors( initiator.getSuccessors() );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator      AbstractCommands of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    protected AbstractCommands(
            @NotNull AbstractCommands initiator,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        if ( initiator.getAncestry() == null ) {
            setAncestry( null );
        }

        if ( initiator.getSuccessors() == null ) {
            setSuccessors( null );
        }

        this.name = initiator.getName();
        setAncestry( initiator.getAncestry() );
        setSuccessors( initiator.getSuccessors() );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( 2 );
    }

    ///////////////////////////////////////

    /**
     * Initiate by name
     *
     * @param name       name of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            int readLength
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( null );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by name
     *
     * @param name       name of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull String comment,
            int readLength
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( null );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name       name of new AbstractCommands
     * @param ancestry   ancestry of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            int readLength
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( null );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name       name of new AbstractCommands
     * @param ancestry   ancestry of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull String comment,
            int readLength
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( null );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name       name of new AbstractCommands
     * @param ancestry   ancestry of new AbstractCommands
     * @param successors successors of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            int readLength
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( successors );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name       name of new AbstractCommands
     * @param ancestry   ancestry of new AbstractCommands
     * @param successors successors of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            int readLength
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( successors );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & successors
     *
     * @param name       name of new AbstractCommands
     * @param successors successors of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            int readLength
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( successors );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & successors
     *
     * @param name       name of new AbstractCommands
     * @param successors successors of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            int readLength
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( successors );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator  AbstractCommands of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull AbstractCommands initiator,
            int readLength
    ) {
        if ( initiator.getAncestry() == null ) {
            setAncestry( null );
        }

        if ( initiator.getSuccessors() == null ) {
            setSuccessors( null );
        }

        this.name = initiator.getName();
        setAncestry( initiator.getAncestry() );
        setSuccessors( initiator.getSuccessors() );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator  AbstractCommands of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull AbstractCommands initiator,
            @NotNull String comment,
            int readLength
    ) {
        if ( initiator.getAncestry() == null ) {
            setAncestry( null );
        }

        if ( initiator.getSuccessors() == null ) {
            setSuccessors( null );
        }

        this.name = initiator.getName();
        setAncestry( initiator.getAncestry() );
        setSuccessors( initiator.getSuccessors() );
        setComment( comment );
        setAsSubCommand( false );
        setReadLength( readLength );
    }

    /**
     * Initiate by name
     *
     * @param name           name of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            boolean isAsSubCommand,
            int readLength
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( null );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * Initiate by name
     *
     * @param name           name of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( null );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            boolean isAsSubCommand,
            int readLength
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( null );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( null );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            boolean isAsSubCommand,
            int readLength
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( successors );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        this.name = name;
        setAncestry( ancestry );
        setSuccessors( successors );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & successors
     *
     * @param name           name of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            boolean isAsSubCommand,
            int readLength
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( successors );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * Initiate by name & successors
     *
     * @param name           name of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        this.name = name;
        setAncestry( null );
        setSuccessors( successors );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator      AbstractCommands of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull AbstractCommands initiator,
            boolean isAsSubCommand,
            int readLength
    ) {
        if ( initiator.getAncestry() == null ) {
            setAncestry( null );
        }

        if ( initiator.getSuccessors() == null ) {
            setSuccessors( null );
        }

        this.name = initiator.getName();
        setAncestry( initiator.getAncestry() );
        setSuccessors( initiator.getSuccessors() );
        setComment( STRING_DEFAULT_COMMANDS_COMMENT );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator      AbstractCommands of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected AbstractCommands(
            @NotNull AbstractCommands initiator,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        if ( initiator.getAncestry() == null ) {
            setAncestry( null );
        }

        if ( initiator.getSuccessors() == null ) {
            setSuccessors( null );
        }

        this.name = initiator.getName();
        setAncestry( initiator.getAncestry() );
        setSuccessors( initiator.getSuccessors() );
        setComment( comment );
        setAsSubCommand( isAsSubCommand );
        setReadLength( readLength );
    }

    /**
     * <p>You should not use this method without any class-substances<p/>
     *
     * <p>This method exists for more abstractive classes to base on<p/>
     *
     * @throws ActionOverAbstractiveException In this class only due to the reason above
     */
    protected void behaviour()
            throws ActionOverAbstractiveException {

        throw new ActionOverAbstractiveException(
                "This method cannot be called without being instanced by any variables." +
                STRING_REGEX_ENDL + "Behaviour did not define within " +
                AbstractCommands.class.getName() );
    }

    /**
     * <p>You should not use this method without any class-substances<p/>
     *
     * <p>This method exists for more abstractive classes to base on<p/>
     *
     * @param nextCommand Specific behaviour of this AbstractCommands command
     * @throws ActionOverAbstractiveException In this class only due to the reason above
     */
    protected void behaviour( @NotNull AbstractCommands nextCommand )
            throws ActionOverAbstractiveException {

        throw new ActionOverAbstractiveException(
                "This method cannot be called without being overridden by any sub-classes." +
                STRING_REGEX_ENDL + "Behaviour was not defined within " +
                AbstractCommands.class.getName() + CHARACTER_COMMON_SYMBOLS_SPACE +
                nextCommand.getName() );
    }

    /**
     * @return valuate whether {@code isAsSubCommand} is true or not
     * @throws ActionOverAbstractiveException same as super class
     */
    protected boolean evaluateIsAsSubCommand(
            @NotNull Commands theOneBeforeIt,
            int indexOutOfInputCommandsArray
    )
            throws ActionOverAbstractiveException {
        throw new ActionOverAbstractiveException(
                "This method cannot be called without being overridden by any sub-classes." +
                STRING_REGEX_ENDL + "Behaviour was not defined within " +
                AbstractCommands.class.getName() );
    }

    public @NotNull String getName() {
        return name;
    }

    public @Nullable AbstractCommands getAncestry() {
        return ancestry;
    }

    private void setAncestry( @Nullable AbstractCommands ancestry ) {
        this.ancestry = ancestry;
    }

    public @NotNull String getComment() {
        return comment;
    }

    private void setComment( @NotNull String comment ) {
        this.comment = comment;
    }

    public @Nullable AbstractCommands[] getSuccessors() {
        if ( successors == null ) {
            return new @NotNull AbstractCommands[ DEFAULT_ARRAY_INITIATION_LENGTH ];
        }
        return successors;
    }

    private void setSuccessors( @Nullable AbstractCommands[] successors ) {
        this.successors = successors;
    }

    /**
     * @return isAsSubCommand
     */
    public boolean getIsAsSubCommand() {
        return this.isAsSubCommand;
    }

    private void setAsSubCommand( boolean isAsSubCommand ) {
        this.isAsSubCommand = isAsSubCommand;
    }

    public void setIsAsSubCommands( boolean isAsSubCommand ) {
        this.isAsSubCommand = isAsSubCommand;
    }

    public int getReadLength() {
        return this.readLength;
    }

    private void setReadLength( int readLength ) {
        this.readLength = readLength;
    }
}
