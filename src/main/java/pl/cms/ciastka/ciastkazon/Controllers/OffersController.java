package pl.cms.ciastka.ciastkazon.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import pl.cms.ciastka.ciastkazon.Services.OffersService;
import pl.cms.ciastka.ciastkazon.domain.Offers;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/offers")
public class OffersController {
    @Autowired
    OffersService offersService;

    @GetMapping(params = {"page", "size"})
    public Page<Offers> getAll(@RequestParam("page") int page, @RequestParam("size") int size, UriComponentsBuilder uriBuilder, HttpServletResponse response) {
        Pageable pagination = PageRequest.of(page, size);
        return offersService.findAll(pagination);
    }

}
