package pl.cms.ciastka.ciastkazon.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import pl.cms.ciastka.ciastkazon.Services.interfaces.CategoryRepository;
import pl.cms.ciastka.ciastkazon.domain.Category;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepository;


	public Page<Category> findAll(Pageable pagination) {
		return categoryRepository.findAll(pagination);
	}
}
