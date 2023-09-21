package med.api;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DoctorMedApplication {

	public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(DoctorMedApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
	}
}
