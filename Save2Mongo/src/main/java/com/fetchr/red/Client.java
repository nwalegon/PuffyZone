package com.fetchr.red;

import org.springframework.data.annotation.Id;


public class Client 

{
	
	@Id
	private String id;
	private String token;
	//private
	
	private boolean order_uploaded = false;
    private String order_uploaded_url;
    
    private boolean order_picked = false;
    private String order_picked_url;
 
 private boolean order_scheduled = false;
    private String order_scheduled_url;
    
    private boolean order_received = false;
    private String order_received_url;
    
    private boolean order_shelved = false;
    private String order_shelved_url;
    
    private boolean order_ready_to_dispatch = false;
    private String order_ready_to_dispatch_url;
    
    private boolean order_dispatched = false;
    private String order_dispatched_url;
    
    private boolean order_not_delivered = false;
    private String order_not_delivered_url;
    
    private boolean order_delivered = false;
    private String order_delivered_url;
    
    private boolean order_returned = false;
    private String order_returned_url;
    
    private boolean order_hold_on = false;
    private String order_hold_on_url;
    
    private boolean order_ready_for_returned = false;
    private String order_ready_for_returned_url;
    
    private boolean order_suspended = false;
    private String order_suspended_url;
    
    private boolean order_missing = false;
    private String order_missing_url;
    
    private boolean order_cancelled = false;
    private String order_cancelled_url;
    
    private boolean order_not_scheduled = false;
    private String order_not_scheduled_url;
    
    private boolean order_on_hold = false;
    private String order_on_hold_url;
    
    private boolean order_ready_for_return = false;
    private String order_ready_for_return_url;
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isOrder_uploaded() {
		return order_uploaded;
	}
	public void setOrder_uploaded(boolean order_uploaded) {
		this.order_uploaded = order_uploaded;
	}
	public String getOrder_uploaded_url() {
		return order_uploaded_url;
	}
	public void setOrder_uploaded_url(String order_uploaded_url) {
		this.order_uploaded_url = order_uploaded_url;
	}
	public boolean isOrder_picked() {
		return order_picked;
	}
	public void setOrder_picked(boolean order_picked) {
		this.order_picked = order_picked;
	}
	public String getOrder_picked_url() {
		return order_picked_url;
	}
	public void setOrder_picked_url(String order_picked_url) {
		this.order_picked_url = order_picked_url;
	}
	public boolean isOrder_scheduled() {
		return order_scheduled;
	}
	public void setOrder_scheduled(boolean order_scheduled) {
		this.order_scheduled = order_scheduled;
	}
	public String getOrder_scheduled_url() {
		return order_scheduled_url;
	}
	public void setOrder_scheduled_url(String order_scheduled_url) {
		this.order_scheduled_url = order_scheduled_url;
	}
	public boolean isOrder_received() {
		return order_received;
	}
	public void setOrder_received(boolean order_received) {
		this.order_received = order_received;
	}
	public String getOrder_received_url() {
		return order_received_url;
	}
	public void setOrder_received_url(String order_received_url) {
		this.order_received_url = order_received_url;
	}
	public boolean isOrder_shelved() {
		return order_shelved;
	}
	public void setOrder_shelved(boolean order_shelved) {
		this.order_shelved = order_shelved;
	}
	public String getOrder_shelved_url() {
		return order_shelved_url;
	}
	public void setOrder_shelved_url(String order_shelved_url) {
		this.order_shelved_url = order_shelved_url;
	}
	public boolean isOrder_ready_to_dispatch() {
		return order_ready_to_dispatch;
	}
	public void setOrder_ready_to_dispatch(boolean order_ready_to_dispatch) {
		this.order_ready_to_dispatch = order_ready_to_dispatch;
	}
	public String getOrder_ready_to_dispatch_url() {
		return order_ready_to_dispatch_url;
	}
	public void setOrder_ready_to_dispatch_url(String order_ready_to_dispatch_url) {
		this.order_ready_to_dispatch_url = order_ready_to_dispatch_url;
	}
	public boolean isOrder_dispatched() {
		return order_dispatched;
	}
	public void setOrder_dispatched(boolean order_dispatched) {
		this.order_dispatched = order_dispatched;
	}
	public String getOrder_dispatched_url() {
		return order_dispatched_url;
	}
	public void setOrder_dispatched_url(String order_dispatched_url) {
		this.order_dispatched_url = order_dispatched_url;
	}
	public boolean isOrder_not_delivered() {
		return order_not_delivered;
	}
	public void setOrder_not_delivered(boolean order_not_delivered) {
		this.order_not_delivered = order_not_delivered;
	}
	public String getOrder_not_delivered_url() {
		return order_not_delivered_url;
	}
	public void setOrder_not_delivered_url(String order_not_delivered_url) {
		this.order_not_delivered_url = order_not_delivered_url;
	}
	public boolean isOrder_delivered() {
		return order_delivered;
	}
	public void setOrder_delivered(boolean order_delivered) {
		this.order_delivered = order_delivered;
	}
	public String getOrder_delivered_url() {
		return order_delivered_url;
	}
	public void setOrder_delivered_url(String order_delivered_url) {
		this.order_delivered_url = order_delivered_url;
	}
	public boolean isOrder_returned() {
		return order_returned;
	}
	public void setOrder_returned(boolean order_returned) {
		this.order_returned = order_returned;
	}
	public String getOrder_returned_url() {
		return order_returned_url;
	}
	public void setOrder_returned_url(String order_returned_url) {
		this.order_returned_url = order_returned_url;
	}
	public boolean isOrder_hold_on() {
		return order_hold_on;
	}
	public void setOrder_hold_on(boolean order_hold_on) {
		this.order_hold_on = order_hold_on;
	}
	public String getOrder_hold_on_url() {
		return order_hold_on_url;
	}
	public void setOrder_hold_on_url(String order_hold_on_url) {
		this.order_hold_on_url = order_hold_on_url;
	}
	public boolean isOrder_ready_for_returned() {
		return order_ready_for_returned;
	}
	public void setOrder_ready_for_returned(boolean order_ready_for_returned) {
		this.order_ready_for_returned = order_ready_for_returned;
	}
	public String getOrder_ready_for_returned_url() {
		return order_ready_for_returned_url;
	}
	public void setOrder_ready_for_returned_url(String order_ready_for_returned_url) {
		this.order_ready_for_returned_url = order_ready_for_returned_url;
	}
	public boolean isOrder_suspended() {
		return order_suspended;
	}
	public void setOrder_suspended(boolean order_suspended) {
		this.order_suspended = order_suspended;
	}
	public String getOrder_suspended_url() {
		return order_suspended_url;
	}
	public void setOrder_suspended_url(String order_suspended_url) {
		this.order_suspended_url = order_suspended_url;
	}
	public boolean isOrder_missing() {
		return order_missing;
	}
	public void setOrder_missing(boolean order_missing) {
		this.order_missing = order_missing;
	}
	public String getOrder_missing_url() {
		return order_missing_url;
	}
	public void setOrder_missing_url(String order_missing_url) {
		this.order_missing_url = order_missing_url;
	}
	public boolean isOrder_cancelled() {
		return order_cancelled;
	}
	public void setOrder_cancelled(boolean order_cancelled) {
		this.order_cancelled = order_cancelled;
	}
	public String getOrder_cancelled_url() {
		return order_cancelled_url;
	}
	public void setOrder_cancelled_url(String order_cancelled_url) {
		this.order_cancelled_url = order_cancelled_url;
	}
	public boolean isOrder_not_scheduled() {
		return order_not_scheduled;
	}
	public void setOrder_not_scheduled(boolean order_not_scheduled) {
		this.order_not_scheduled = order_not_scheduled;
	}
	public String getOrder_not_scheduled_url() {
		return order_not_scheduled_url;
	}
	public void setOrder_not_scheduled_url(String order_not_scheduled_url) {
		this.order_not_scheduled_url = order_not_scheduled_url;
	}
	public boolean isOrder_on_hold() {
		return order_on_hold;
	}
	public void setOrder_on_hold(boolean order_on_hold) {
		this.order_on_hold = order_on_hold;
	}
	public String getOrder_on_hold_url() {
		return order_on_hold_url;
	}
	public void setOrder_on_hold_url(String order_on_hold_url) {
		this.order_on_hold_url = order_on_hold_url;
	}
	public boolean isOrder_ready_for_return() {
		return order_ready_for_return;
	}
	public void setOrder_order_ready_for_return(boolean order_order_ready_for_return) {
		this.order_ready_for_return = order_order_ready_for_return;
	}
	public String getOrder_order_ready_for_return_url() {
		return order_ready_for_return_url;
	}
	public void setOrder_order_ready_for_return_url(String order_order_ready_for_return_url) {
		this.order_ready_for_return_url = order_order_ready_for_return_url;
	}
		
	
	

}
