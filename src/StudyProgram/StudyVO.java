package StudyProgram;

public class StudyVO {
	private String memberCode; // 회원번호
	private String memberName; // 회원이름
	private String joinDate; // 가입날짜
	private int deposit; // 보증금
	
	private String studyDate; // 스터디날짜
	private String chapter; // 챕터정리
	private String task; // 과제
	private String chk1; // 중간점검
	private String chk2; // 최종점검
	private int fine; // 벌금
	private int balance; // 잔액
	
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public String getStudyDate() {
		return studyDate;
	}
	public void setStudyDate(String studyDate) {
		this.studyDate = studyDate;
	}
	public String getChapter() {
		return chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getChk1() {
		return chk1;
	}
	public void setChk1(String chk1) {
		this.chk1 = chk1;
	}
	public String getChk2() {
		return chk2;
	}
	public void setChk2(String chk2) {
		this.chk2 = chk2;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "StudyVO [memberCode=" + memberCode + ", memberName=" + memberName + ", joinDate=" + joinDate
				+ ", deposit=" + deposit + ", studyDate=" + studyDate + ", chapter=" + chapter + ", task=" + task
				+ ", chk1=" + chk1 + ", chk2=" + chk2 + ", fine=" + fine + ", balance=" + balance + "]";
	}

	
}
