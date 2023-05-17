package com.shourov.webfluxmonoflux;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

//    @Test
//    public void testMono() {
//        Mono<?> monoString = Mono.just("monofluxtest")
//                .doOnNext(value -> System.out.println("1 -> " + value))
//                .log()
//                .doOnNext(value -> System.out.println("2 -> " + value));
//        monoString.subscribe(value -> System.out.println("3 -> " + value));
//    }

    @Test
    public void testFlux() {
        Flux<String> fluxStrings = Flux
                .just("Spring", "Spring Boot", "Hibernate", "Microservice")
                .concatWithValues("AWS", "Reactive Programming")
                .log();
        fluxStrings.subscribe(value -> System.out.println(value));
    }

}
