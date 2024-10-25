package com.sentiment.review.service;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.*;

import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.util.CoreMap;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class SentimentAnalyzer {

    public List<String> analyzeSentiment() {

        Properties properties = new Properties();
        properties.setProperty("annotators", "tokenize, ssplit, pos, parse, sentiment");
        StanfordCoreNLP pipeline = new StanfordCoreNLP(properties);

        List<String> reviews = new ArrayList<>();
        reviews.add("The product is amazing and works perfectly! I love it.");
        reviews.add("This is the worst product I have ever bought.");
        reviews.add("It's okay, but it could be better.");
        reviews.add("I had high hopes, but I am disappointed with the product.");
        reviews.add("Fantastic! Exceeded my expectations.");

        List<String> sentiments = new ArrayList<>();

        for (String review : reviews) {

            sentiments.add(analyzeSentiment(review, pipeline));

        }


        return sentiments;
    }

    private static String analyzeSentiment(String text, StanfordCoreNLP pipeline) {
        Annotation annotation = new Annotation(text);

        pipeline.annotate(annotation);

        String result = "";

        for (CoreMap sentence : annotation.get(CoreAnnotations.SentencesAnnotation.class)) {
            String sentiment = sentence.get(SentimentCoreAnnotations.SentimentClass.class);
//            System.out.println(sentence + " : " + sentiment);
            result = sentence + " : " + sentiment;
        }

        return result;
    }
}
