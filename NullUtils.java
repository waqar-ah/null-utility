import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * @author Waqar Ahmad
 *
 * @date Sep 19, 2021
 */

@Component
public class NullUtils {
	private NullUtils() {
	}

	/**
	 * This method returns true if the collection is null or is empty.
	 * 
	 * @param collection
	 * @return true | false
	 */
	public static boolean isEmpty(Collection<?> collection) {
		boolean empty = false;
		if (collection == null || collection.isEmpty()) {
			empty = true;
		}
		return empty;
	}

	/**
	 * This method returns true of the map is null or is empty.
	 * 
	 * @param map
	 * @return true | false
	 */
	public static boolean isEmpty(Map<?, ?> map) {
		boolean empty = false;
		if (map == null || map.isEmpty()) {
			empty = true;
		}
		return empty;
	}

	/**
	 * This method returns true if the object is null.
	 * 
	 * @param object
	 * @return true | false
	 */
	public static boolean isEmpty(Object object) {
		boolean empty = false;
		if (object == null) {
			empty = true;
		}
		return empty;
	}

	/**
	 * This method returns true if the input array is null or its length is zero.
	 * 
	 * @param array
	 * @return true | false
	 */
	public static boolean isEmpty(Object[] array) {
		boolean empty = false;
		if (array == null || array.length == 0) {
			empty = true;
		}
		return empty;
	}

	/**
	 * This method returns true if the input string is null or its length is zero.
	 * 
	 * @param string
	 * @return true | false
	 */
	public static boolean isEmpty(String string) {
		boolean empty = false;
		if (string == null || string.trim().length() == 0) {
			empty = true;
		}
		return empty;
	}

	/**
	 * This method returns true if the input string is exist in the Enum.
	 * 
	 * @param string
	 * @param EnumClass
	 * @return true | false
	 */
	public static <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
		for (E e : enumClass.getEnumConstants()) {
			if (e.name().equals(value)) {
				return true;
			}
		}
		return false;
	}

}
