package com.kaliningleb25.github.card_translator_project;

import com.kaliningleb25.github.card_translator_project.service.translator.TranslatorServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class CardTranslatorProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CardTranslatorProjectApplication.class, args);
	}
}

class Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
		TranslatorServiceImpl translator = new TranslatorServiceImpl();
		System.out.println(translator.getWordsTranslations("complain", "auto", "russian"));
	}
}



