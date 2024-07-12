package dev.abbby.postcode.Suburb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SuburbController {
    @Autowired
    private SuburbService suburbService;

    @GetMapping("/suburb")
    public ResponseEntity<Suburb> getSuburbByPostcode(@RequestParam String postcode) {
        return suburbService.getSuburbByPostcode(postcode)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/postcode")
    public ResponseEntity<Suburb> getPostcodeBySuburb(@RequestParam String name) {
        return suburbService.getPostcodeBySuburb(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/suburb")
    public ResponseEntity<Suburb> addSuburb(@RequestBody Suburb suburb) {
        Suburb savedSuburb = suburbService.addSuburb(suburb);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSuburb);
    }
}
