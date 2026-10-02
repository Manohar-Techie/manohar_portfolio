package com.example.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PortfolioApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(PortfolioApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Manohar Portfolio</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            margin: 0;
                            background: #f4f6f8;
                            color: #222;
                        }

                        header {
                            background: #1f2937;
                            color: white;
                            padding: 40px;
                            text-align: center;
                        }

                        header h1 {
                            font-size: 42px;
                            margin: 10px;
                        }

                        header p {
                            font-size: 20px;
                        }

                        section {
                            max-width: 900px;
                            margin: 30px auto;
                            background: white;
                            padding: 30px;
                            border-radius: 10px;
                            box-shadow: 0 2px 10px #ddd;
                        }

                        h2 {
                            color: #2563eb;
                        }

                        ul {
                            line-height: 2;
                        }

                        .project {
                            background: #f8fafc;
                            padding: 15px;
                            margin: 15px 0;
                            border-left: 5px solid #2563eb;
                        }

                        footer {
                            text-align: center;
                            padding: 30px;
                            background: #1f2937;
                            color: white;
                        }
                    </style>
                </head>

                <body>

                    <header>
                        <h1>Manohar Durgam</h1>
                        <p>Java Full Stack Developer</p>
                        <p>Spring Boot | Microservices | React | AWS</p>
                    </header>

                    <section>
                        <h2>About Me</h2>
                        <p>
                            I am a Java Full Stack Developer interested in
                            building scalable and reliable applications using
                            Spring Boot, Microservices and React.
                        </p>
                    </section>

                    <section>
                        <h2>Skills</h2>
                        <ul>
                            <li>Java</li>
                            <li>Spring Boot</li>
                            <li>Microservices</li>
                            <li>Spring Security</li>
                            <li>Hibernate / JPA</li>
                            <li>MySQL</li>
                            <li>React</li>
                            <li>AWS</li>
                            <li>Docker</li>
                            <li>Jenkins</li>
                        </ul>
                    </section>

                    <section>
                        <h2>Projects</h2>

                        <div class="project">
                            <h3>Mana Rythu Motor</h3>
                            <p>
                                Farm machinery booking application for
                                managing harvester slots and bookings.
                            </p>
                        </div>

                        <div class="project">
                            <h3>Microservices Application</h3>
                            <p>
                                REST-based microservices application using
                                Spring Boot, Eureka and API Gateway.
                            </p>
                        </div>

                        <div class="project">
                            <h3>Portfolio Application</h3>
                            <p>
                                Personal portfolio application deployed
                                using Jenkins and Tomcat.
                            </p>
                        </div>
                    </section>

                    <section>
                        <h2>Contact</h2>
                        <p>Email: your-email@example.com</p>
                        <p>GitHub: github.com/Manohar-Techie</p>
                    </section>

                    <footer>
                        © 2026 Manohar Durgam
                    </footer>

                </body>
                </html>
                """;
    }
}
