package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class invoicedetail {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)

	private int  invoicedetailid;
	
	private int invoiceid;
	
	private int addonid;
	
	private int addonamount;

	@Override
	public String toString() {
		return "invoicedetail [invoicedetailid=" + invoicedetailid + ", invoiceid=" + invoiceid + ", addonid=" + addonid
				+ ", addonamount=" + addonamount + "]";
	}

	public invoicedetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public invoicedetail(int invoicedetailid, int invoiceid, int addonid, int addonamount) {
		super();
		this.invoicedetailid = invoicedetailid;
		this.invoiceid = invoiceid;
		this.addonid = addonid;
		this.addonamount = addonamount;
	}

	public int getInvoicedetailid() {
		return invoicedetailid;
	}

	public void setInvoicedetailid(int invoicedetailid) {
		this.invoicedetailid = invoicedetailid;
	}

	public int getInvoiceid() {
		return invoiceid;
	}

	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}

	public int getAddonid() {
		return addonid;
	}

	public void setAddonid(int addonid) {
		this.addonid = addonid;
	}

	public int getAddonamount() {
		return addonamount;
	}

	public void setAddonamount(int addonamount) {
		this.addonamount = addonamount;
	}
	
}
