package pl.cms.ciastka.ciastkazon.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.cms.ciastka.ciastkazon.Services.interfaces.OfferRepository;
import pl.cms.ciastka.ciastkazon.domain.Offers;

@Service
public class OffersService {
    @Autowired
    OfferRepository offerRepository;


    public Page<Offers> findAll(Pageable pagination) {
        return offerRepository.findAll(pagination);
    }

}
