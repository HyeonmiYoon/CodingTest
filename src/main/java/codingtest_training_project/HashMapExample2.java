package codingtest_training_project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* #���α׷��ӽ� - ��ȭ��ȣ ���
		
		���� ����
		��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
		��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.

		������ : 119
		���ؿ� : 97 674 223
		������ : 11 9552 4421
		��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.

		���� ����
		phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
		�� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
		���� ��ȭ��ȣ�� �ߺ��ؼ� ������� �ʽ��ϴ�.
		
		����� ����
		phone_book	return
		["119", "97674223", "1195524421"]	false
		["123","456","789"]	true
		["12","123","1235","567","88"]	false
		
		����� �� ����
		����� �� #1
		�տ��� ������ ���� �����ϴ�.

		����� �� #2
		�� ��ȣ�� �ٸ� ��ȣ�� ���λ��� ��찡 �����Ƿ�, ���� true�Դϴ�.

		����� �� #3
		ù ��° ��ȭ��ȣ, ��12���� �� ��° ��ȭ��ȣ ��123���� ���λ��Դϴ�. ���� ���� false�Դϴ�. */
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		Solution solution = new Solution();
		System.out.println(solution.solution1(phone_book));

	}
	
	static class Solution {
		public boolean solution1(String[] phone_book) { //Hash�� ������� ���� ���
		    boolean answer = true;
	        Arrays.sort(phone_book); //ȿ������ ���� �迭�� ������ �ش�
	        
	        for(int i = 0; i < phone_book.length-1; i++) {
	            if(phone_book[i+1].startsWith(phone_book[i])) { //�迭�� ���� ��Ұ� ���� ��ҷ� �����ϴ�(���ξ�)�� ���
	                answer = false; //answer�� false�� �־��ְ�
	                break; //�ݺ��� ����������
	            }
	        }
	        
		    return answer;
		}
		
		public boolean solution2(String[] participant, String[] completion) { //Hash�� ����� ���
			boolean answer = true;
			
			
		    
		    return answer;
		}
	}

}

