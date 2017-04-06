package io.swagger.api;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Region;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T13:50:22.207Z")

@Controller
public class RegionApiController implements RegionApi {

	public ResponseEntity<List<Region>> regionGet(
			@NotNull @ApiParam(value = "the level of region", required = true) @RequestParam(value = "level", required = true) Integer level) {
		// do some magic!
		return new ResponseEntity<List<Region>>(HttpStatus.OK);
	}

	public ResponseEntity<Region> regionindexDelete(
			@ApiParam(value = "get region of index", required = true) @PathVariable("index") Integer index) {
		// do some magic!
		return new ResponseEntity<Region>(HttpStatus.OK);
	}

	public ResponseEntity<Object> regionindexPut(
			@ApiParam(value = "get region of index", required = true) @PathVariable("index") Integer index,
			@ApiParam(value = "update instance", required = true) @RequestBody Region region) {
		// do some magic!
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	public ResponseEntity<Region> regionPost(@ApiParam(value = "region.", required = true) @RequestBody Region region) {
		// do some magic!
		return new ResponseEntity<Region>(HttpStatus.OK);
	}

}
