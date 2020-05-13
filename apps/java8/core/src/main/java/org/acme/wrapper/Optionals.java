package org.acme.wrapper;

import java.util.Optional;

public class Optionals {
    

    public static Optional<String> optionalExample(String name) {
        return Optional.ofNullable(name);
    }
    
    public static void main(String args[]) {

        System.out.println(optionalExample("Alex").get());
        //System.out.println(optionalExample(null).get());

        System.out.println(optionalExample(null).isPresent());
        System.out.println(optionalExample(null).orElse("default"));
        System.out.println(optionalExample("Edson").or(() -> Optional.of("Burr")).get());

    }

}