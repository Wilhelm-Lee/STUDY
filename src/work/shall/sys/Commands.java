package work.shall.sys;

import base.essention.exegesis.ProjectPrivacy;
import base.essention.exemplification.AbstractCommands;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import work.speculator.exception.ActionOverAbstractiveException;

import static base.essention.BasicVariables.CHARACTER_COMMON_SYMBOLS_SPACE;
import static base.essention.BasicVariables.STRING_REGEX_ENDL;

/**
 * @author william
 * This class is the instance of AbstractCommands
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
@ProjectPrivacy (level = 3)
public class Commands
        extends AbstractCommands {

    /**
     * Initiate by name
     *
     * @param name name of new Commands
     */
    public Commands( @NotNull String name ) {
        super( name );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name     name of new Commands
     * @param ancestry ancestry of new Commands
     */
    public Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry
    ) {
        super(
                name,
                ancestry
        );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name       name of new Commands
     * @param ancestry   ancestry of new Commands
     * @param successors successors of new Commands
     */
    public Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors
    ) {
        super(
                name,
                ancestry,
                successors
        );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name       name of new Commands
     * @param ancestry   ancestry of new Commands
     * @param successors successors of new Commands
     */
    public Commands(
            @NotNull String name,
            @NotNull Commands ancestry,
            @NotNull Commands[] successors
    ) {
        super(
                name,
                ancestry,
                successors
        );
    }

    /**
     * Initiate by name & successors
     *
     * @param name       name of new Commands
     * @param successors successors of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors
    ) {
        super(
                name,
                successors
        );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator AbstractCommands of new Commands
     */
    public Commands( @NotNull AbstractCommands initiator ) {
        super( initiator );
    }

    /**
     * Initiate by name
     *
     * @param name    name of new Commands
     * @param comment comment of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull String comment
    ) {
        super(
                name,
                comment
        );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name     name of new Commands
     * @param ancestry ancestry of new Commands
     * @param comment  comment of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull String comment
    ) {
        super(
                name,
                ancestry,
                comment
        );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name       name of new Commands
     * @param ancestry   ancestry of new Commands
     * @param successors successors of new Commands
     * @param comment    comment of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment
    ) {
        super(
                name,
                ancestry,
                successors,
                comment
        );
    }

    /**
     * Initiate by name & successors
     *
     * @param name       name of new Commands
     * @param successors successors of new Commands
     * @param comment    comment of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment
    ) {
        super(
                name,
                successors,
                comment
        );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator AbstractCommands of new Commands
     * @param comment   comment of new Commands
     */
    protected Commands(
            @NotNull AbstractCommands initiator,
            @NotNull String comment
    ) {
        super(
                initiator,
                comment
        );
    }

    /**
     * Initiate by name
     *
     * @param name           name of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    public Commands(
            @NotNull String name,
            boolean isAsSubCommand
    ) {
        super(
                name,
                isAsSubCommand
        );
    }

    /**
     * Initiate by name
     *
     * @param name           name of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    public Commands(
            @NotNull String name,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        super(
                name,
                comment,
                isAsSubCommand
        );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    public Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            boolean isAsSubCommand
    ) {
        super(
                name,
                ancestry,
                isAsSubCommand
        );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    public Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        super(
                name,
                ancestry,
                comment,
                isAsSubCommand
        );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    public Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            boolean isAsSubCommand
    ) {
        super(
                name,
                ancestry,
                successors,
                isAsSubCommand
        );
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
    public Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        super(
                name,
                ancestry,
                successors,
                comment,
                isAsSubCommand
        );
    }

    /**
     * Initiate by name & successors
     *
     * @param name           name of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    public Commands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            boolean isAsSubCommand
    ) {
        super(
                name,
                successors,
                isAsSubCommand
        );
    }

    /**
     * Initiate by name & successors
     *
     * @param name           name of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    public Commands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        super(
                name,
                successors,
                comment,
                isAsSubCommand
        );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator      AbstractCommands of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    public Commands(
            @NotNull AbstractCommands initiator,
            boolean isAsSubCommand
    ) {
        super(
                initiator,
                isAsSubCommand
        );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator      AbstractCommands of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     */
    public Commands(
            @NotNull AbstractCommands initiator,
            @NotNull String comment,
            boolean isAsSubCommand
    ) {
        super(
                initiator,
                comment,
                isAsSubCommand
        );
    }

    /**
     * Initiate by name
     *
     * @param name       name of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            int readLength
    ) {
        super( name, readLength );
    }

    /**
     * Initiate by name
     *
     * @param name       name of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull String comment,
            int readLength
    ) {
        super( name, comment, readLength );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name       name of new AbstractCommands
     * @param ancestry   ancestry of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            int readLength
    ) {
        super( name, ancestry, readLength );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name       name of new AbstractCommands
     * @param ancestry   ancestry of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull String comment,
            int readLength
    ) {
        super( name, ancestry, comment, readLength );
    }

    /**
     * Initiate by name & ancestry & successors
     *
     * @param name       name of new AbstractCommands
     * @param ancestry   ancestry of new AbstractCommands
     * @param successors successors of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            int readLength
    ) {
        super( name, ancestry, successors, readLength );
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
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            int readLength
    ) {
        super( name, ancestry, successors, comment, readLength );
    }

    /**
     * Initiate by name & successors
     *
     * @param name       name of new AbstractCommands
     * @param successors successors of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            int readLength
    ) {
        super( name, successors, readLength );
    }

    /**
     * Initiate by name & successors
     *
     * @param name       name of new AbstractCommands
     * @param successors successors of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            int readLength
    ) {
        super( name, successors, comment, readLength );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator  AbstractCommands of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected Commands(
            @NotNull AbstractCommands initiator,
            int readLength
    ) {
        super( initiator, readLength );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator  AbstractCommands of new AbstractCommands
     * @param comment    comment of new AbstractCommands
     * @param readLength readLength of new Commands
     */
    protected Commands(
            @NotNull AbstractCommands initiator,
            @NotNull String comment,
            int readLength
    ) {
        super( initiator, comment, readLength );
    }

    /**
     * Initiate by name
     *
     * @param name           name of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( name, isAsSubCommand, readLength );
    }

    /**
     * Initiate by name
     *
     * @param name           name of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( name, comment, isAsSubCommand, readLength );
    }

    /**
     * Initiate by name & ancestry
     *
     * @param name           name of new AbstractCommands
     * @param ancestry       ancestry of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( name, ancestry, isAsSubCommand, readLength );
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
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( name, ancestry, comment, isAsSubCommand, readLength );
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
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( name, ancestry, successors, isAsSubCommand, readLength );
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
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands ancestry,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( name, ancestry, successors, comment, isAsSubCommand, readLength );
    }

    /**
     * Initiate by name & successors
     *
     * @param name           name of new AbstractCommands
     * @param successors     successors of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( name, successors, isAsSubCommand, readLength );
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
    protected Commands(
            @NotNull String name,
            @NotNull AbstractCommands[] successors,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( name, successors, comment, isAsSubCommand, readLength );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator      AbstractCommands of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected Commands(
            @NotNull AbstractCommands initiator,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( initiator, isAsSubCommand, readLength );
    }

    /**
     * Initiate by legally existed AbstractCommands
     *
     * @param initiator      AbstractCommands of new AbstractCommands
     * @param comment        comment of new AbstractCommands
     * @param isAsSubCommand isAsSubCommand of new Commands
     * @param readLength     readLength of new Commands
     */
    protected Commands(
            @NotNull AbstractCommands initiator,
            @NotNull String comment,
            boolean isAsSubCommand,
            int readLength
    ) {
        super( initiator, comment, isAsSubCommand, readLength );
    }

    /**
     * @return comment of this Commands
     */
    @Override
    public @NotNull String getComment() {
        return super.getComment();
    }

    /**
     * <p>You should not use this method without any class-substances<p/>
     *
     * <p>This method exists for more abstractive classes to base on<p/>
     *
     * @throws ActionOverAbstractiveException In this class only due to the reason above
     */
    @Override
    protected void behaviour()
            throws ActionOverAbstractiveException {

        throw new ActionOverAbstractiveException(
                "This method cannot be called without being instanced by any variables." +
                STRING_REGEX_ENDL + "Behaviour did not define within " +
                Commands.class.getName() );
    }

    /**
     * <p>You should not use this method without any class-substances<p/>
     *
     * <p>This method exists for more abstractive classes to base on<p/>
     *
     * @param nextCommand Behaviour of this AbstractCommands command
     * @throws ActionOverAbstractiveException In this class only due to the reason above
     */
    @Override
    protected void behaviour( @NotNull AbstractCommands nextCommand )
            throws ActionOverAbstractiveException {

        throw new ActionOverAbstractiveException(
                "This method cannot be called without being instanced by any variables." +
                STRING_REGEX_ENDL + "Behaviour did not define within " +
                Commands.class.getName() + CHARACTER_COMMON_SYMBOLS_SPACE +
                nextCommand.getName() );
    }

    /**
     * @return valuate whether {@code isAsSubCommand} is true or not
     */
    @Override
    protected boolean evaluateIsAsSubCommand(
            @NotNull Commands theOneBeforeIt,
            int indexOutOfInputCommandsArray
    ) {
        /* if this one is the first in the array OR the one before it is DONE then false */
        return
                indexOutOfInputCommandsArray != 0 &&
                !( theOneBeforeIt.getName().equalsIgnoreCase( CommandSet.DONE.getName() ) );
    }

    @Override
    public @NotNull String getName() {
        return super.getName();
    }

    @Override
    public @Nullable AbstractCommands getAncestry() {
        return super.getAncestry();
    }

    @Override
    public @Nullable AbstractCommands[] getSuccessors() {
        return super.getSuccessors();
    }
}
