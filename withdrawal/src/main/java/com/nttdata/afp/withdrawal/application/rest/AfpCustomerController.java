package com.nttdata.afp.withdrawal.application.rest;

import com.nttdata.afp.withdrawal.domain.entities.AfpCustomerDto;
import com.nttdata.afp.withdrawal.domain.services.AfpCustomerService;
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
 * Controlador para afpCustomer.
 */
@RestController
@RequestMapping("/api/afpCustomers")
public class AfpCustomerController {
  @Autowired
  private AfpCustomerService afpCustomerService;

  @GetMapping()
  public ResponseEntity<List<AfpCustomerDto>> findAll() {
    return new ResponseEntity<>(afpCustomerService.findAll(), HttpStatus.OK);
  }

  /**
   * Método para buscar por id.
   *
   * @param id id de afpCustomer
   * @return objeto afpCustomer
   */
  @GetMapping(path = {"{id}"}, produces = {"application/json"})
    public ResponseEntity<AfpCustomerDto> findById(@PathVariable("id") Long id) {
    return afpCustomerService.findById(id)
            .map(a -> new ResponseEntity<>(a, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @GetMapping(path = {"/identityCard/{identityCard}"}, produces = {"application/json"})
  public ResponseEntity<AfpCustomerDto> getByIdentityCard(@PathVariable("identityCard")
                                                       String identityCard) {
    return new ResponseEntity<>(afpCustomerService
            .findByIdentityCard(identityCard), HttpStatus.OK);
  }

  @PostMapping()
  public ResponseEntity<AfpCustomerDto> create(@RequestBody AfpCustomerDto afpCustomerDto) {
    return new ResponseEntity<>(afpCustomerService.create(afpCustomerDto), HttpStatus.OK);
  }

  @PutMapping(path = {"{id}"}, produces = {"application/json"})
  public void update(@PathVariable("id") Long id, @RequestBody AfpCustomerDto afpCustomerDto) {
    afpCustomerService.update(id, afpCustomerDto);
  }

  @DeleteMapping(path = {"{id}"}, produces = {"application/json"})
  public void deleteById(@PathVariable("id") Long id) throws Exception {
    afpCustomerService.deleteById(id);
  }
}
