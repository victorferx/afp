package com.nttdata.afp.withdrawal.application.rest;

import com.nttdata.afp.withdrawal.domain.entities.CustomerDto;
import com.nttdata.afp.withdrawal.domain.services.CustomerService;
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
 * Controllador para Customer.
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @GetMapping()
  public ResponseEntity<List<CustomerDto>> findAll() {
    return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
  }

  /**
   * Método para buscar por id.
   *
   * @param id id del cliente
   * @return objeto cliente
   */
  @GetMapping(path = {"{id}"}, produces = {"application/json"})
  public ResponseEntity<CustomerDto> getById(@PathVariable("id") Long id) {
    return customerService.findById(id)
            .map(c -> new ResponseEntity<>(c, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping(path = {"/identityCard/{identityCard}"}, produces = {"application/json"})
  public ResponseEntity<CustomerDto> getByIdentityCard(@PathVariable("identityCard")
                                                         String identityCard) {
    return new ResponseEntity<>(customerService.findByIdentityCard(identityCard), HttpStatus.OK);
  }

  @PostMapping()
  public ResponseEntity<CustomerDto> create(@RequestBody CustomerDto customerDto) {
    return new ResponseEntity<>(customerService.create(customerDto), HttpStatus.OK);
  }

  @PutMapping(path = {"{id}"}, produces = {"application/json"})
  public void update(@PathVariable("id") Long id, @RequestBody CustomerDto customerDto) {
    customerService.update(id, customerDto);
  }

  @DeleteMapping(path = {"{id}"}, produces = {"application/json"})
  public void deleteById(@PathVariable("id") Long id) throws Exception {
    customerService.deleteById(id);
  }
}
