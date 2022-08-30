package xyz.apex.forge.commonality;

import net.minecraftforge.api.distmarker.OnlyIn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to display to the developer which physical side is available to.
 * <p>
 * This does not do any of the ASM code stripping that {@link OnlyIn} does.
 * <br>
 * Exists purely for readability.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PACKAGE, ElementType.ANNOTATION_TYPE})
public @interface SideOnly
{
	Side value() default Side.COMMON;

	enum Side
	{
		CLIENT, // physical client
		COMMON, // common | both
		SERVER // physical server
	}
}