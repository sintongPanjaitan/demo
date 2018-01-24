package id.myindo.demo.config;

import id.myindo.demo.utils.DateFormatter;
import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.ThemeResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
public class ThymeleafConfig extends WebMvcConfigurerAdapter {


    @Value("${application.thymeleaf.themes}")
    private String themes;
    @Value("${application.thymeleaf.skin}")
    private String skin;

    private static final Logger logger = LoggerFactory.getLogger(ThemeResolver.class);

    @Bean
    public ServletContextTemplateResolver templateResolver() {

        logger.info("load TemplateResolver");
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        logger.info("themes : " + themes +  " with skin : " + skin);

        String prefix = "/WEB-INF/templates/" + themes + "/templates/";
        resolver.setPrefix(prefix);
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        resolver.setOrder(1);
        return resolver;
    }
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/css/**").addResourceLocations("/WEB-INF/assets/css/");
        registry.addResourceHandler("/assets/images/**").addResourceLocations("/WEB-INF/assets/image/");
        registry.addResourceHandler("/assets/js/**").addResourceLocations("/WEB-INF/assets/js/");
        //dist
        registry.addResourceHandler("/dist/js/**").addResourceLocations("/WEB-INF/dist/js/");
        registry.addResourceHandler("/dist/img/**").addResourceLocations("/WEB-INF/dist/img/");
        registry.addResourceHandler("/dist/css/**").addResourceLocations("/WEB-INF/dist/css/");
        //plugins
        registry.addResourceHandler("/plugins/iCheck/**").addResourceLocations("/WEB-INF/plugins/iCheck/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/WEB-INF/plugins/");


        //skin
        registry.addResourceHandler("/assets/template/css/**").addResourceLocations("/WEB-INF/templates/" + themes + "/css/");
        registry.addResourceHandler("/assets/template/images/**").addResourceLocations("/WEB-INF/templates/" + themes + "/image/");
        registry.addResourceHandler("/assets/template/img/**").addResourceLocations("/WEB-INF/templates/" + themes + "/img/");
        registry.addResourceHandler("/assets/template/js/**").addResourceLocations("/WEB-INF/templates/" + themes + "/js/");
        registry.addResourceHandler("/assets/template/components/**").addResourceLocations("/WEB-INF/templates/" + themes + "/components/");

        registry.addResourceHandler("/assets/skin/css/**").addResourceLocations("/WEB-INF/templates/" + themes + "/skin/" + skin + "/css/");
        registry.addResourceHandler("/assets/skin/images/**").addResourceLocations("/WEB-INF/templates/" + themes + "/skin/" + skin + "/image/");
        registry.addResourceHandler("/assets/skin/js/**").addResourceLocations("/WEB-INF/templates/" + themes + "/skin/" + skin + "/js/");

    }

    public SpringTemplateEngine templateEngine(){
        logger.info("load SpringTemplateEngine");
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());
        engine.addDialect(new LayoutDialect());
        /*engine.addDialect(new SpringSecurityDialect());
        engine.addDialect(new SpringStandardDialect());*/
        return engine;
    }

    @Bean
    public ViewResolver viewResolver(){
        logger.info("load ViewResolver");
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver() ;
        viewResolver.setTemplateEngine(templateEngine());
        viewResolver.setOrder(1);
        viewResolver.setViewNames(new String[] {".html", ".xhtml"});
        return viewResolver;
    }

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("Messages");
        return messageSource;
    }

    @Override
    public void addFormatters(final FormatterRegistry registry) {
        super.addFormatters(registry);
        //registry.addFormatter(varietyFormatter());
        registry.addFormatter(dateFormatter());
    }

    /*@Bean
    public VarietyFormatter varietyFormatter() {
        return new VarietyFormatter();
    }*/

    @Bean
    public DateFormatter dateFormatter() {
        return new DateFormatter();
    }
}