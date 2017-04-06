package io.swagger.api;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Human;
import io.swagger.model.Region;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T13:50:22.207Z")

@Api(value = "human", description = "the human API")
public interface HumanApi {

	@ApiOperation(value = "get an array of Human by params", notes = "get an array of Human by name, sex ", response = Region.class, responseContainer = "List", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An array of Region", response = Region.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Region.class) })
	@RequestMapping(value = "/human", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<Region>> humanGet(
			@ApiParam(value = "name of human") @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "sex of human") @RequestParam(value = "sex", required = false) String sex);

	@ApiOperation(value = "update lucky by index", notes = "update lucky by index ", response = Human.class, tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Human that has been created", response = Human.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Human.class) })
	@RequestMapping(value = "/human/{index}", produces = { "application/json" }, method = RequestMethod.PUT)
	ResponseEntity<Human> humanindexPut(
			@ApiParam(value = "index of human", required = true) @PathVariable("index") Integer index,
			@NotNull @ApiParam(value = "the new lucky", required = true) @RequestParam(value = "lucky", required = true) Double lucky);

	@ApiOperation(value = "create a human instance", notes = "this is a description of create human instance ", response = Human.class, tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Human that has been created", response = Human.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Human.class) })
	@RequestMapping(value = "/human", produces = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<Human> humanPost(
			@ApiParam(value = "description of create", required = true) @RequestBody Human human);

}
