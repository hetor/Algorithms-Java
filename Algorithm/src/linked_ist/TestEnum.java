/**   
 * Description: 
 * 测试枚举 
 * Copyright (c) 2013
 * @author hetao  
 * @date 2013年10月21日 下午4:28:08 
 * @version V1.0
 */
package linked_ist;

public enum TestEnum {
	
	abc("a","b");
	
	private String a;
	private String b;
	
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	private TestEnum(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
}