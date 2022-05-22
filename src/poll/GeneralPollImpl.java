package poll;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;

import auxiliary.Voter;
import pattern.SelectionStrategy;
import pattern.StatisticsStrategy;
import vote.VoteType;
import vote.Vote;

public class GeneralPollImpl<C> implements Poll<C> {

	// ͶƱ�������
	private String name;
	// ͶƱ������ʱ��
	private Calendar date;
	// ��ѡ���󼯺�
	private List<C> candidates;
	// ͶƱ�˼��ϣ�keyΪͶƱ�ˣ�valueΪ���ڱ���ͶƱ����ռȨ��
	private Map<Voter, Double> voters;
	// ��ѡ���ĺ�ѡ�����������
	private int quantity;
	// ����ͶƱ����õ�ͶƱ���ͣ��Ϸ�ѡ����Զ�Ӧ�ķ�����
	private VoteType voteType;
	// ����ѡƱ����
	protected Set<Vote> votes;
	// ��Ʊ�����keyΪ��ѡ����valueΪ��÷�
	protected Map<C, Double> statistics;
	// ��ѡ�����keyΪ��ѡ����valueΪ������λ��
	private Map<C, Double> results;

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
	 * ���캯��
	 */
	public GeneralPollImpl() {
		// TODO
	}

	@Override
	public void setInfo(String name, Calendar date, VoteType type, int quantity) {
		// TODO
	}

	@Override
	public void addVoters(Map<Voter, Double> voters) {
		// TODO
	}

	@Override
	public void addCandidates(List<C> candidates) {
		// TODO
	}

	@Override
	public void addVote(Vote<C> vote) {
		// �˴�Ӧ���ȼ���ѡƱ�ĺϷ��Բ���ǣ�Ϊ������չ���޸�rep
		// TODO
	}

	@Override
	public void statistics(StatisticsStrategy ss) {
		// �˴�Ӧ���ȼ�鵱ǰ��ӵ�е�ѡƱ�ĺϷ���
		// TODO
	}

	@Override
	public void selection(SelectionStrategy ss) {
		// TODO
	}

	@Override
	public String result() {
		// TODO
		return null;
	}
}
