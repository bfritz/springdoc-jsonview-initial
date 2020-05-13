package test.org.springdoc.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema
@JsonInclude(Include.NON_NULL)
@JsonView(View.Default.class)
public class TestResponse {

	@Schema(name = "status")
	@JsonView(View.Test.class)
	private boolean status;

	@Schema(name = "createdTime")
	private String createdTime;

}