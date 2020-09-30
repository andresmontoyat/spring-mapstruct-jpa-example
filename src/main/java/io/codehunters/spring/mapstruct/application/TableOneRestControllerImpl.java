package io.codehunters.spring.mapstruct.application;

import io.codehunters.spring.mapstruct.application.model.TableOneModelMapper;
import io.codehunters.spring.mapstruct.application.model.request.TableOneCreateRequest;
import io.codehunters.spring.mapstruct.application.model.response.TableOneCreateResponse;
import io.codehunters.spring.mapstruct.domain.model.TableOne;
import io.codehunters.spring.mapstruct.domain.service.TableOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/tableone")
public class TableOneRestControllerImpl implements TableOneRestController {

    @Autowired
    private TableOneService tableOneService;

    @Autowired
    private TableOneModelMapper mapper;

    @PostMapping
    public ResponseEntity<TableOneCreateResponse> save(@Validated @RequestBody TableOneCreateRequest tableOneCreateRequest, BindingResult result) {
        TableOne tableOne = tableOneService.save(mapper.toTableOne(tableOneCreateRequest));
        return ResponseEntity.created(createURI("/{id}", tableOne.getId())).body(mapper.toTableOneCreateResponse(tableOne));
    }

    private URI createURI(String path, Object id) {
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path(path)
                .buildAndExpand(id)
                .toUri();
    }
}
