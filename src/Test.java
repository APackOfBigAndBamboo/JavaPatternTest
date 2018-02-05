import DecoratorPattern.Circle;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;


public class Test {
    public static void main(String[] args) {
        String xmbhcbzxcwy ="huangdawei-ss  ".trim();

        StringBuffer  buffer=new StringBuffer("hello");
        System.out.println(buffer.reverse());
        String temp=xmbhcbzxcwy .substring(xmbhcbzxcwy .length()-3,xmbhcbzxcwy .length());
        if ("-SS".equalsIgnoreCase(temp));
        {
            xmbhcbzxcwy =xmbhcbzxcwy .substring(0,xmbhcbzxcwy .length()-3);
        }
//        if ("-SQ".equals(temp)||"-SS".equals(temp)||"-ss".equals(temp)||"-sq".equals(temp)){
//            xmbhcbzxcwy =xmbhcbzxcwy .substring(0,xmbhcbzxcwy .length()-3);
//        }
        System.out.println(xmbhcbzxcwy );
        Circle a=new Circle();
        Circle b=new Circle();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
        System.out.println(a==b);

    }
}
