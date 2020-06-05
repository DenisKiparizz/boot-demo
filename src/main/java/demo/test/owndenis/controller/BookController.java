package demo.test.owndenis.controller;

import demo.test.owndenis.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping("/book")
    public String getAllBooks(Model model) {
        model.addAttribute("book", bookRepository.findAll());
        return "books";
    }
}
