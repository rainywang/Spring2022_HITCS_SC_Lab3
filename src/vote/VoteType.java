package vote;

import java.util.HashMap;
import java.util.Map;

//immutable
public class VoteType {

	// keyΪѡ������valueΪѡ������Ӧ�ķ���
	private Map<String, Integer> options = new HashMap<>();

	// Rep Invariants
	// TODO
	// Abstract Function
	// TODO
	// Safety from Rep Exposure
	// TODO

	private boolean checkRep() {
		// TODO
		return false;
	}

	/**
	 * ����һ��ͶƱ���Ͷ���
	 * 
	 * ����������Ƹ÷��������õĲ���
	 */
	public VoteType(/* TODO */) {
		// TODO
	}

	/**
	 * ���������ض��﷨������ַ���������һ��ͶƱ���Ͷ���
	 * 
	 * @param regex ��ѭ�ض��﷨�ġ�����ͶƱ������Ϣ���ַ�����������12�ٿ��ǣ�
	 */
	public VoteType(String regex) {
		// TODO
	}

	/**
	 * �ж�һ��ͶƱѡ���Ƿ�Ϸ�������Poll�ж�ѡƱ�ĺϷ��Լ�飩
	 * 
	 * ���磬ͶƱ�˸�����ͶƱѡ���ǡ�Strongly reject������options�в��������ѡ�������ǷǷ���
	 * 
	 * ���ܸĶ��÷����Ĳ���
	 * 
	 * @param option һ��ͶƱѡ��
	 * @return �Ϸ���true������false
	 */
	public boolean checkLegality(String option) {
		// TODO
		return false;
	}

	/**
	 * ����һ��ͶƱѡ��õ����Ӧ�ķ���
	 * 
	 * ���磬ͶƱ�˸�����ͶƱѡ���ǡ�֧�֡�����ѯ�õ����Ӧ�ķ�����1
	 * 
	 * ���ܸĶ��÷����Ĳ���
	 * 
	 * @param option һ��ͶƱ��ȡֵ
	 * @return ��ѡ������Ӧ�ķ���
	 */
	public int getScoreByOption(String option) {
		// TODO
		return 0;
	}

	@Override
	public int hashCode() {
		// TODO
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO
		return false;
	}
}
