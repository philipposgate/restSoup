package org.philip.restSoup;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.json.JSONObject;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponses;
import com.wordnik.swagger.annotations.ApiResponse;

@Path("")
@Produces({"application/json"})
@Api(value = "/restSoup", description = "RestSoup API")
public class RootRESTServices {

	@GET
	  @ApiOperation(value = "GET test", 
	    notes = "Returns a simple GET response"
	  )
	  @ApiResponses(value = { @ApiResponse(code = 200, message = "Success!"), @ApiResponse(code = 500, message = "Error!") })
	public String get()
	{
		return getTime().toString(4);
	}
	
	private JSONObject getTime()
	{
		JSONObject o = new JSONObject();
		o.put("datetime", new Date().toString());
		return o;
	}
	
}
