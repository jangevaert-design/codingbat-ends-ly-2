public class EndsLy2 {
  public boolean endsLy(String str) {
    int len = str.length();

    if (len < 2) {
      return false;
    }

    return (str.substring(len - 2, len).equals("ly"));
  }

}
