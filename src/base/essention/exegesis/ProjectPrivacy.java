package base.essention.exegesis;

import base.essention.BasicVariables;
import org.jetbrains.annotations.NotNull;

import java.lang.annotation.*;

/*
 * [ProjectPrivacy]
 * +---------------------------------------------------------------------------------------------------+
 * | Object        Category       *Author              *Level      AnnotationNecessity    Uniqueness   |
 * +---------------------------------------------------------------------------------------------------+
 * | Class         Test           William Pascal       0           true                   true         |
 * | Field         /              William Pascal       1           false                  false        |
 * | Method        /              William Pascal       1           false                  false        |
 * | Class         Utility        William Pascal       1           true                   false        |
 * | Enum          /              William Pascal       1           true                   false        |
 * | Record        /              William Pascal       1           true                   false        |
 * | Interface     /              William Pascal       2           true                   false        |
 * | Annotation    /              William Pascal       2           false                  false        |
 * | Constructor   /              William Pascal       2           false                  false        |
 * | Class         Abstract       William Pascal       2           true                   false        |
 * | Class         Extended       William Pascal       3           true                   false        |
 * | Class         Extensional    William Pascal       4           true                   false        |
 * | Class         Main           William Pascal       5           true                   true         |
 * | Class         Others         William Pascal       6           true                   false        |
 * | <N/A>         Other_Source   <N/A>                <N/A>       true                   false        |
 * +---------------------------------------------------------------------------------------------------+
 * ....................................................................................29thSep 2022.....
 * // *something means this is a field of this annotation, initiation AND/OR definition are/is required //
 */

/**
 * All in
 */
@Target (
        {
                ElementType.ANNOTATION_TYPE,
                ElementType.TYPE,
                ElementType.CONSTRUCTOR,
                ElementType.FIELD,
                ElementType.METHOD,
                ElementType.LOCAL_VARIABLE,
                ElementType.MODULE,
                ElementType.PACKAGE,
                ElementType.PARAMETER,
                ElementType.RECORD_COMPONENT,
                ElementType.TYPE_PARAMETER,
                ElementType.TYPE_USE
        }
)
@Documented
@Retention ( RetentionPolicy.RUNTIME )
public @interface ProjectPrivacy {

    @NotNull
    String author() default BasicVariables.STRING_ABOUT_PROJECT_AUTHOR_NAME;

    int level();
}
