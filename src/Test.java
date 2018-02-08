
public class Test {
    public static void main(String[] args) {
        String xmbhcbzxcwy = (null+"").trim();
        String a = "aa"+"";
        System.out.println(a.length());
        System.out.println(xmbhcbzxcwy.length());
        if (xmbhcbzxcwy!=null&&xmbhcbzxcwy.length() > 3) {

            String temp = xmbhcbzxcwy.substring(xmbhcbzxcwy.length() - 3, xmbhcbzxcwy.length());
            if ("-SS".equalsIgnoreCase(temp)) {
                xmbhcbzxcwy = xmbhcbzxcwy.substring(0, xmbhcbzxcwy.length() - 3);
            }
        }
        System.out.println(xmbhcbzxcwy);
    }
}
