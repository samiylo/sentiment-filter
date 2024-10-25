package com.sentiment.review.controller;

import com.sentiment.review.service.SentimentAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    SentimentAnalyzer sentimentAnalyzer;

    @GetMapping(value = "/sentiment")
    public List<String> analyzeSentiment() {

        return sentimentAnalyzer.analyzeSentiment();
    }
}
