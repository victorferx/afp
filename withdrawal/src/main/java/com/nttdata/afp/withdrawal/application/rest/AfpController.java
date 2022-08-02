package com.nttdata.afp.withdrawal.application.rest;


import com.nttdata.afp.withdrawal.domain.entities.AfpDto;
import com.nttdata.afp.withdrawal.domain.services.AfpService;
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
 * Controlador para Afp.
 */
@RestController
@RequestMapping("/api/afps")
public class AfpController {

  @Autowired
  private AfpService afpService;

  @GetMapping()
  public ResponseEntity<List<AfpDto>> findAll() {
    return new ResponseEntity<>(afpService.findAll(), HttpStatus.OK);
  }

  /**
   * Método para buscar por id.
   *
   * @param id id de la afp
   * @return objeto afp
   */
  @GetMapping(path = {"{id}"}, produces = {"application/json"})
  public ResponseEntity<AfpDto> findById(@PathVariable("id") Long id) {
    return afpService.findById(id)
            .map(a -> new ResponseEntity<>(a, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping()
  public ResponseEntity<AfpDto> create(@RequestBody AfpDto afpDto) {
    return new ResponseEntity<>(afpService.create(afpDto), HttpStatus.OK);
  }

  @PutMapping(path = {"{id}"}, produces = {"application/json"})
  public void update(@PathVariable("id") Long id, @RequestBody AfpDto afpDto) {
    afpService.update(id, afpDto);
  }

  @DeleteMapping(path = {"{id}"}, produces = {"application/json"})
  public void deleteById(@PathVariable("id") Long id) {
    afpService.deleteById(id);
  }
}
