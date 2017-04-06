/**
 * 
 */
package io.swagger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author reset
 *
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.thepassby", "io.swagger"})
public class PrototypeApplication implements CommandLineRunner {

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... arg0) throws Exception {
		if (arg0.length > 0 && arg0[0].equals("exitcode")) {
			throw new ExitException();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(PrototypeApplication.class, args);
	}
	
	class ExitException extends RuntimeException implements ExitCodeGenerator {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7493154578645749132L;

		@Override
		public int getExitCode() {
			return 10;
		}
	}
}
