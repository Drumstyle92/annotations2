import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Drumstyle92
 * annotation with target on methods and runtime retention policy.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DevAnnotation {
    /**
     *
     * @return
     * name of the developer who wrote the method.
     */
    String davName();

    /**
     *
     * @return
     * Surname of the developer who wrote the method.
     */
    String davSurname();

}
