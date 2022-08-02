package com.nttdata.afp.withdrawal.application.rest;

import com.nttdata.afp.withdrawal.domain.entities.RequestWithdrawalDto;
import com.nttdata.afp.withdrawal.domain.services.RequestWithdrawalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para requestWithdrawal.
 */
@RestController
@RequestMapping("/api/requestWithdrawales")
public class RequestWithdrawalController {
  @Autowired
  private RequestWithdrawalService requestWithdrawalService;

  @GetMapping()
  public ResponseEntity<List<RequestWithdrawalDto>> findAll() {
    return new ResponseEntity<>(requestWithdrawalService.findAll(), HttpStatus.OK);
  }

  /**
   * Método para buscar por id.
   *
   * @param id id de la solicitud de retiro
   * @return objeto requestWithdrawal
   */
  @GetMapping(path = {"{id}"}, produces = {"application/json"})
  public ResponseEntity<RequestWithdrawalDto> getById(@PathVariable("id") Long id) {
    return requestWithdrawalService.findById(id)
            .map(c -> new ResponseEntity<>(c, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping()
  public ResponseEntity<RequestWithdrawalDto> create(
          @RequestBody RequestWithdrawalDto requestWithdrawalDto) {
    return new ResponseEntity<>(requestWithdrawalService
            .create(requestWithdrawalDto), HttpStatus.OK);
  }

  @PutMapping(path = {"{id}"}, produces = {"application/json"})
  public void update(@PathVariable("id") Long id,
                     @RequestBody RequestWithdrawalDto requestWithdrawalDto) {
    requestWithdrawalService.update(id, requestWithdrawalDto);
  }

  @DeleteMapping(path = {"{id}"}, produces = {"application/json"})
  public void deleteById(@PathVariable("id") Long id) throws Exception {
    requestWithdrawalService.deleteById(id);
  }
}
