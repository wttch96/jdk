package java.io;

/**
 * 不支持字符编码集.
 *
 * @author Asmus Freytag
 * @since JDK1.1
 */
public class UnsupportedEncodingException
    extends IOException {

  private static final long serialVersionUID = -4274276298326136670L;

  /**
   * Constructs an UnsupportedEncodingException without a detail message.
   */
  public UnsupportedEncodingException() {
    super();
  }

  /**
   * Constructs an UnsupportedEncodingException with a detail message.
   *
   * @param s Describes the reason for the exception.
   */
  public UnsupportedEncodingException(String s) {
    super(s);
  }
}
