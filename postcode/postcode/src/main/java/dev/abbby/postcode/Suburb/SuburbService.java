package dev.abbby.postcode.Suburb;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
public class SuburbService {
    @Autowired
    private SuburbRepository suburbRepository;

    public Optional<Suburb> getSuburbByPostcode(String postcode) {
        return suburbRepository.findByPostcode(postcode);
    }

    public Optional<Suburb> getPostcodeBySuburb(String name) {
        return suburbRepository.findByName(name);
    }

    @Secured("ROLE_ADMIN")
    public Suburb addSuburb(Suburb suburb) {
        return suburbRepository.save(suburb);
    }
}
