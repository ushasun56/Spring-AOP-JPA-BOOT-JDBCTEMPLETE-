package com.yash.messenger.service;
/**
 *service class implimented
 * @author usha.more
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yash.messenger.database.DatabaseClass;
import com.yash.messenger.model.Message;
       

public class MessageService 
{
	private Map<Long,Message> messages = DatabaseClass.getMessages();
     public MessageService() {
    	 messages.put(1l, new Message(1,"hello world","soham"));
    	 messages.put(2l, new Message(1,"hello jersey","swati"));
    	 
     }
	/**
	 * 
	 * @return list
	 */
	public List<Message> getAllMessages(){
		/*Message m1 = new Message(1,"hello","usha");
		Message m2 = new Message(1,"restapi","usha");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;*/
		 return new ArrayList<Message>(messages.values());
	 }
	/**
	 * 
	 * @param id
	 * @return id with getmessage
	 */
	 
	 public Message getMessage(long id) {
		 return messages.get(id);
	 }
	 /**
	  * 
	  * @param message
	  * @return addmessage
	  */
	 public Message  addMessage(Message message) {
		 message.setId(messages.size() + 1);
		 messages.put(message.getId(), message);
		 return message;
	 }
	 /**
	  * updatemessage
	  * @param message
	  * @return
	  */
	 public Message updateMessage(Message message) {
		 if(message.getId()<= 0) {
			 return null;
			 
		 }
		 messages.put(message.getId(), message);
		return message;
	 }
      /**
       * delete method 
       * @param id
       * @return
       */
	 public Message removeMessage(long id) {
		return messages.remove(id);
	 }
}
 