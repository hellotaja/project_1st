package model;

public class MemberDTO {
private int memberNum;
private String name;
public int getMemberNum() {
	return memberNum;
}
public void setMemberNum(int memberNum) {
	this.memberNum = memberNum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public MemberDTO(int memberNum, String name) {
	super();
	this.memberNum = memberNum;
	this.name = name;
}

}
