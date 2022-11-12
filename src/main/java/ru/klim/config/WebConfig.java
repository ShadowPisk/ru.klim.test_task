package ru.klim.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class<?>[]{
                    SpringConfig.class
            };
        }

        // Тут добавляем конфигурацию, в которой инициализируем ViewResolver
        @Override
        protected Class<?>[] getServletConfigClasses() {

            return new Class<?>[]{
                    SpringConfig.class
            };
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }

    }