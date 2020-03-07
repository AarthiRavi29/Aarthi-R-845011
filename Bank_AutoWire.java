package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bank_AutoWire {
String bankname;
String mgrname;
@Autowired//Default

	@Qualifier(value="b1")
	Branch b20;
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getMgrname() {
		return mgrname;
	}
	public void setMgrname(String mgrname) {
		this.mgrname = mgrname;
	}
	public Branch getB20() {
		return b20;
	}
	public void setB20(Branch b20) {
		this.b20 = b20;
	}
	
	

}


