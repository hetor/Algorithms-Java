/**   
 * Description: 
 * TODO(��һ�仰�������ļ���ʲô) 
 * Copyright (c) 2013
 * @author Administrator  
 * @date 2013��10��21�� ����4:28:08 
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
