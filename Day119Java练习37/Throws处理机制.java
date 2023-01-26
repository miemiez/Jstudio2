package Day119Java练习37;

public class Throws处理机制 {
	public static void main(String[] args) {
		/*
		 * f2方法【throws抛出异常】 -> f1方法【接收异常，并且可以继续throws抛出异常或者可以try-catch-finally处理异常】 ->
		 * main方法【接收异常，并且可以继续throws抛出异常或者可以try-catch-finally处理异常】 -> JVM【输出异常信息并且退出程序】
		 * 
		 * 在main方法上，如果程序员没有try-catch-finally处理异常，默认就是throws抛出异常
		 */
	}
}
