package themes;

/**
 * 统计输入字符串经过排列后可以得到的回文串的数量 eg: abba, abbcbba, aabbcccbba
 * @author hetao
 */
public class Palindrome {
	
	public static int palindrome(String s) {
		if(0 >= s.length() || 100 < s.length()) {
			return 0;
		} 
		
		final int MODULE_NUM = 1000000007;
		long remainder = 1; //余数
		int palindromeLen = s.length() >> 1;
		
		int[] cNums = new int[26];
		for(char c : s.toCharArray()) {
			cNums[c%'a']++;
		}

		int singleCharNum = 0;
		for(int i=0; i<cNums.length; i++) {
			if(cNums[i] == 1) {
				singleCharNum++;
			}else {
				if(cNums[i] % 2 != 0) {
					singleCharNum++;
				}
				cNums[i] /= 2;
			}
		}
		
		if(singleCharNum > 1) {
			return 0;
		}
		
		int[] elems = new int[palindromeLen+1];
		for(int i=palindromeLen; i>1; i--) {
			int temp = i;
			int j = 2;
			while(temp != 1 && j <= i) {
				if(temp%j == 0) {
					temp /= j;
					elems[j]++;
				}else {
					j++;
				}
			}
		}
		
		for(int cNum : cNums) {
			if(cNum > 1) {
				for(int i=cNum; i>1; i--) {
					int temp = i;
					int j = 2;
					while(temp != 1 && j <= i) {
						if(temp%j == 0) {
							temp /= j;
							elems[j]--;
						}else {
							j++;
						}
					}
				}
			}
		}
		
		for(int i=2; i<elems.length; i++) {
			for(int j=0; j<elems[i]; j++) {
				remainder *= i;
				if(remainder > MODULE_NUM) {
					remainder %= MODULE_NUM;
				}
			}
		}
		
		return (int) remainder;
	}

	public static void main(String[] args) {
		String s = "abcabcdd";
		System.out.println(s);
		long timeBegin = System.currentTimeMillis();
		int result = palindrome(s);
		long timeEnd = System.currentTimeMillis();
		System.out.println("the remainder num of palindrome: " + result + " time: " + (timeEnd-timeBegin) + "ms");
	}
}
