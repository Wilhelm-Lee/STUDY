package work.speculator.exception;

import base.echo.BasicOutput;
import base.essention.BasicVariables;

/**
 * @author william
 */

public class IdNotMatchException
        extends Exception {

    public static final String CLASS_NAME = "IdNotMatchException";

    static final long serialVersionUID = 1L;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public IdNotMatchException() {

        super();
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public IdNotMatchException( String message ) {

        new BasicOutput(
                BasicVariables.STRING_BASIC_OUTPUT_LOG_TYPE_ERROR,
                IdNotMatchException.class.getName(),
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
    public IdNotMatchException(
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
    public IdNotMatchException( Throwable cause ) {

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
    public IdNotMatchException(
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