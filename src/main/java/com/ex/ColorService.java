package com.ex;

import java.util.Iterator;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONObject;

@Path("/colors")
public class ColorService {
	

	/*method to get color of object by id to check if it has been updated correctly or not*/
	@GET
	@Path("/getColor/{param}")
	public Response getColor(@PathParam("param") Integer id) {
		
		ColoredObject obj = ColoredObject.myMap.get(id);
		String color = obj.getColor();
		String output = "color for " + id +" is:" + color;
		return Response.status(200).entity(output).build();

	}

	
	/* Get all the objects and their color*/
	@GET
	@Path("/getAll")
	@Produces("application/json")
	public Response getAllObjects() {
		
		JSONArray objects = new JSONArray();
		Iterator<Integer> iterate = ColoredObject.myMap.keySet().iterator();
		while(iterate.hasNext()){
			Integer k =  iterate.next();
			ColoredObject obj = ColoredObject.myMap.get(k);
			JSONObject jsonObj =  new JSONObject();
			jsonObj.put("id", obj.getId());
			jsonObj.put("color",obj.getColor());
			objects.put(jsonObj);
		}
		return Response.status(200).entity(objects.toString()).build();

	}
	
	/*update the color of the object after dragging it into column of different color */
	@POST
	@Path("/updateColor/{param1}/{param2}")
	@Produces("application/json")
	public Response updateColor(@PathParam("param1") Integer id, @PathParam("param2") String color) {
		
		if(ColoredObject.myMap.containsKey(id)){
			ColoredObject obj = ColoredObject.myMap.get(id);
			obj.setColor(color);
		}
		String output = "updated color for " + id +" is:" + color;
		return Response.status(200).entity(output).build();

	}
	
}


