package java.io;

/**
 * 字符转换异常的基类.
 *
 * @author Asmus Freytag
 * @since JDK1.1
 */
public class CharConversionException extends java.io.IOException {

  private static final long serialVersionUID = -8680016352018427031L;

  /**
   * This provides no detailed message.
   */
  public CharConversionException() {
  }

  /**
   * This provides a detailed message.
   *
   * @param s the detailed message associated with the exception.
   */
  public CharConversionException(String s) {
    super(s);
  }
}
