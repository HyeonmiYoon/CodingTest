package codingtest_training_project;
import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		
		 /* ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

		�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

		���ѻ���
		������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
		completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
		�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
		������ �߿��� ���������� ���� �� �ֽ��ϴ�.
		����� ��
		participant	completion	return
		["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
		["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
		["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
		
		����� �� ����
		���� #1
		"leo"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

		���� #2
		"vinko"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

		���� #3
		"mislav"�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�. */
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"}; //������
		String[] completion = {"stanko", "ana", "mislav"}; //������

		Solution solution = new Solution();
		System.out.println(solution.solution(participant, completion));
	}
	
	static class Solution {
		public String solution(String[] participant, String[] completion) {
		    String answer = "";
		    HashMap<String, Integer> hs = new HashMap<>(); //�̸��� Key, index�� Value�� �ϴ� HashMap ����
		    
		    for(String name : participant) { //�����ڸ�ŭ �ݺ��ϸ鼭 hs�� �� ����(�̶�, ������ �̸��� Key�� �ϴ� hashMap �̰�, index�� 1�� �������Ѽ� value�� ��´� 
		        hs.put(name, hs.getOrDefault(name, 0) + 1); 
		    }
		    
		    for(String name : completion) {  //�����ڸ�ŭ �ݺ��ϸ鼭 hs�� �� ����(�̶�, ������ �̸��� Key�� �ϴ� hashMap �̰�, index�� 1�� ���ҽ��Ѽ� value�� ��´�
		        hs.put(name, hs.get(name) - 1);
		    }
		    
		    Iterator<Map.Entry<String, Integer>> iter = hs.entrySet().iterator(); //hashMap Iterator ��ü ����

		    while(iter.hasNext()){
		        Map.Entry<String, Integer> entry = iter.next();
		        if (entry.getValue() != 0){ //�����ڿ��� �ְ�, �����ڿ��� �ִ� ��� value�� 1�� ���ҽ��� 0���� ��������Ƿ� 1�� �ƴϸ� ������ ��Ͽ� ����
		            answer = entry.getKey();
		            break;
		        }
		    }
		    
		    return answer;
		}
	}
}


