package pl.cms.ciastka.ciastkazon.Services.interfaces;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import pl.cms.ciastka.ciastkazon.domain.Category;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
    Optional<Category> findByNameContains(String title);

    Page<Category> findAll(Pageable pageable);
}
