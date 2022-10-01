package work.speculator.exception;

import base.echo.BasicOutput;
import base.essention.BasicVariables;
import org.jetbrains.annotations.NotNull;

/**
 * @author william
 * @note {@code CLASS_NAME} has been replaced by {@code Class.class.getName()}
 */
public class ActionOverAbstractiveException
        extends UnsupportedOperationException {

    public static final @NotNull String CLASS_NAME = "ActionOverAbstractiveException";

    static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public ActionOverAbstractiveException() {

        new BasicOutput(
                BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                ActionOverAbstractiveException.class.getName(),
                "ACTION WAS OVER ABSTRACTIVE" + BasicVariables.STRING_REGEX_ENDL + super.getLocalizedMessage()
        );
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public ActionOverAbstractiveException( String message ) {

        new BasicOutput(
                BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                ActionOverAbstractiveException.class.getName(),
                message
        );
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method).  (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     * @since 1.4
     */
    public ActionOverAbstractiveException(
            String message,
            Throwable cause
    ) {

        new BasicOutput(
                BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                cause,
                message
        );

    }

    /**
     * Constructs a new exception with the specified cause and a detail
     * message of {@code (cause==null ? null : cause.toString())} (which
     * typically contains the class and detail message of {@code cause}).
     * This constructor is useful for exception that are little more than
     * wrappers for other throwable_s (for exemplification, {@link
     * java.security.PrivilegedActionException}).
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method).  (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     * @since 1.4
     */
    public ActionOverAbstractiveException( Throwable cause ) {

        new BasicOutput(
                cause,
                null
        );
    }

    /**
     * Constructs a new exception with the specified detail message,
     * cause, suppression enabled or disabled, and writable stack
     * trace enabled or disabled.
     *
     * @param message            the detail message.
     * @param cause              the cause.  (A {@code null} value is permitted,
     *                           and indicates that the cause is nonexistent or unknown.)
     * @param enableSuppression  whether suppression is enabled
     *                           or disabled
     * @param writableStackTrace whether the stack trace should
     *                           be writable
     * @since 1.7
     */
    public ActionOverAbstractiveException(
            String message,
            Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace
    ) {

        new BasicOutput(
                BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                cause,
                message
        );
    }


}
