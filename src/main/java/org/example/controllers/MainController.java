package org.example.controllers;

import org.example.models.Review;
import org.example.repo.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("/")
    public String home(Map<String, Object> model){
        model.put("name","World");
        return "home";
    }

    @GetMapping("/about")
    public String about(Map<String, Object>  model){
        model.put("title","Страница про нас");
        return "about";
    }

    @GetMapping("/reviews")
    public String reviews(Map<String, Object>  model){
        Iterable<Review> reviews = reviewRepository.findAll();
        model.put("title","Страница про нас");
        model.put("reviews", reviews);
        return "reviews";
    }


}