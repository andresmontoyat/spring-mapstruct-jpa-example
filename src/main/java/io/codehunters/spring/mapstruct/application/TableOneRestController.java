package io.codehunters.spring.mapstruct.application;

import io.codehunters.spring.mapstruct.application.model.request.TableOneCreateRequest;
import io.codehunters.spring.mapstruct.application.model.response.TableOneCreateResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

@Api(tags = "TableOne API")
public interface TableOneRestController {

    @ApiOperation("Save")
    ResponseEntity<TableOneCreateResponse> save(TableOneCreateRequest tableOneCreateRequest, BindingResult result);

}
