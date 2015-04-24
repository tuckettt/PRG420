import java.lang.management.ManagementFactory;


public class GetProcess {
    
    public static void main(String args[]) {
	
	System.out.println(ManagementFactory.getRuntimeMXBean().getName());
	
	
    }

}
