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
import io.swagger.model.Region;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T13:50:22.207Z")

@Api(value = "region", description = "the region API")
public interface RegionApi {

	@ApiOperation(value = "get an array region by level", notes = "get an array of region by level ", response = Region.class, responseContainer = "List", tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An array of region", response = Region.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Region.class) })
	@RequestMapping(value = "/region", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<List<Region>> regionGet(
			@NotNull @ApiParam(value = "the level of region", required = true) @RequestParam(value = "level", required = true) Integer level);

	@ApiOperation(value = "delete a Region by index", notes = "delete a Region by index ", response = Region.class, tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Region that has been created", response = Region.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Region.class) })
	@RequestMapping(value = "/region/{index}", produces = { "application/json" }, method = RequestMethod.DELETE)
	ResponseEntity<Region> regionindexDelete(
			@ApiParam(value = "get region of index", required = true) @PathVariable("index") Integer index);

	@ApiOperation(value = "update a region with index", notes = "update a region with index ", response = Object.class, tags = {})
	@ApiResponses(value = { @ApiResponse(code = 200, message = "An Region of update result", response = Object.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Object.class) })
	@RequestMapping(value = "/region/{index}", produces = { "application/json" }, method = RequestMethod.PUT)
	ResponseEntity<Object> regionindexPut(
			@ApiParam(value = "get region of index", required = true) @PathVariable("index") Integer index,
			@ApiParam(value = "update instance", required = true) @RequestBody Region region);

	@ApiOperation(value = "regions", notes = "region such as country, city, street, number. ", response = Region.class, tags = {
			"Products", })
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "An Region that has been created", response = Region.class),
			@ApiResponse(code = 200, message = "Unexpected error", response = Region.class) })
	@RequestMapping(value = "/region", produces = { "application/json" }, method = RequestMethod.POST)
	ResponseEntity<Region> regionPost(@ApiParam(value = "region.", required = true) @RequestBody Region region);

}
