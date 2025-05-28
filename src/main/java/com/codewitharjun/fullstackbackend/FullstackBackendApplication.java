@SpringBootApplication
public class FullstackBackendApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(FullstackBackendApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FullstackBackendApplication.class);
    }
}
