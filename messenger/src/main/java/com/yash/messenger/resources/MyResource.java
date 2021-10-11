package com.yash.messenger.resources;
/**
 * CRUD Operation for the rest jax_rs
 * @author usha.more
 *
 */

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.messenger.model.Message;
import com.yash.messenger.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/messages")
/**
 * Gobally Declare produce and consumes ... @consumes only use when doing Post(Create),put(Update) operation
 * @author usha.more
 *
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

	MessageService messageservice = new MessageService();

	/**
	 * read data for all list
	 * 
	 * @return AllMessage
	 */
	@GET
	public List<Message> getMessage() {
		return messageservice.getAllMessages();
	}

	/* method level annotation */
	/**
	 * read data...(we can add data through POSTMAN App)
	 * 
	 * @param message
	 * @return addmessages
	 */
	@POST
	public Message addMessage(Message message) {
		return messageservice.addMessage(message);
	}

	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long id, Message message) {
		message.setId(id);
		return messageservice.updateMessage(message);
	}
	/**
	 * delete the id
	 * 
	 * @param id
	 */
	
	  @DELETE
	  @Path("/{messageId}") public void deleteMessage(@PathParam("messageId")long
	  id) { messageservice.removeMessage(id); }
	 

	/**
	 * read data for particular id
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long id) {
		return messageservice.getMessage(id);
		// return "Got path param" + messageId;
	}

}
