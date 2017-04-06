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
import io.swagger.model.Human;
import io.swagger.model.Region;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T13:50:22.207Z")

@Controller
public class HumanApiController implements HumanApi {

	public ResponseEntity<List<Region>> humanGet(
			@ApiParam(value = "name of human") @RequestParam(value = "name", required = false) String name,
			@ApiParam(value = "sex of human") @RequestParam(value = "sex", required = false) String sex) {
		// do some magic!
		return new ResponseEntity<List<Region>>(HttpStatus.OK);
	}

	public ResponseEntity<Human> humanIidPut(
			@ApiParam(value = "iid of human", required = true) @PathVariable("iid") Integer iid,
			@NotNull @ApiParam(value = "the new lucky", required = true) @RequestParam(value = "lucky", required = true) Double lucky) {
		// do some magic!
		return new ResponseEntity<Human>(HttpStatus.OK);
	}

	public ResponseEntity<Human> humanPost(
			@ApiParam(value = "description of create", required = true) @RequestBody Human human) {
		// do some magic!
		return new ResponseEntity<Human>(HttpStatus.OK);
	}

}
