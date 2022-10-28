package hw7;
//M -> D -> C => L - > X -> V-> I => descending order 
//Count from right to left
//next character is smaller -> subtract
//if bigger, next character can be repeated 3 times, exp. XXXV

public class RomanToInt {

	int romanToInt(String string) {
		int currentValue = 0, nextCharValue = 0;
		for (int i = string.length() - 1; i >= 0; i--) {
			switch (string.charAt(i)) {
			case 'I':
				nextCharValue = 1;
				break;
			case 'V':
				nextCharValue = 5;
				break;
			case 'X':
				nextCharValue = 10;
				break;
			case 'L':
				nextCharValue = 50;
				break;
			case 'C':
				nextCharValue = 100;
				break;
			case 'D':
				nextCharValue = 500;
				break;
			case 'M':
				nextCharValue = 1000;
				break;
			}
			if (3 * nextCharValue < currentValue) {
				currentValue = currentValue - nextCharValue;
			} else {
				currentValue = currentValue + nextCharValue;
			}
		}
		return currentValue;
	}

	public static void main(String args[]) {
		RomanToInt number = new RomanToInt();

		String str = "MCMXCIV";
		System.out.println("Value " + str + " is " + number.romanToInt(str));
	}
}
//O(n)
//dòng 35 phải nhân số từ 2<x<5 để tránh lỗi khi có 3 chữ cái lặp lại như ví dụ XXXV 
//thì func sẽ về true thay vì false và sẽ bị trừ mất giá trị.
// function chỉ đúng khi đánh đúng thứ tự của số Roman từ M đến I. 
//Ví dụ nếu điền IM thì sẽ bị sẽ ra 999 nhưng IM lại ko phải số Roman, chưa tìm được cách khăc phục