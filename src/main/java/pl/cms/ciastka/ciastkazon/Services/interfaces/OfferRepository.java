package pl.cms.ciastka.ciastkazon.Services.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.cms.ciastka.ciastkazon.domain.Offers;

import java.util.Optional;

@Repository
public interface OfferRepository extends PagingAndSortingRepository<Offers, Long> {
    Optional<Offers> findByTitleContains(String title);

    Page<Offers> findAll(Pageable pageable);
}
