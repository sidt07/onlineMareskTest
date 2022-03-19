package com.maerskrsk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	
	@Id
	@Column
	private int bookid;
	
	
	@Column
	private String bookingRef;
	
	public String getBookingRef() {
		return "94558c91-f344-4ddd-b160-2c64625f7d29";
	}

	public void setBookingRef(String bookingRef) {
		this.bookingRef = bookingRef;
	}

	@Column
	private ContainerType containerType;

	@Column
	private String bookname;

	@Column
	private String origin;

	@Column
	private int containerSize;
	@Column
	private String destination;
	@Column
	private int quantity;

	public ContainerType getContainerType() {
		return containerType;
	}

	public void setContainerType(ContainerType containerType) {
		this.containerType = containerType;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getContainerSize() {
		return containerSize;
	}

	public void setContainerSize(int containerSize) {
		this.containerSize = containerSize;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Books(ContainerType containerType, String bookname, String origin, int containerSize, String destination,
			int quantity) {
		super();
		this.containerType = containerType;
		this.bookname = bookname;
		this.origin = origin;
		this.containerSize = containerSize;
		this.destination = destination;
		this.quantity = quantity;
	}

}