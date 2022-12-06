/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package substrate.client.java;

import jnr.ffi.LibraryLoader;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        LibC libc = LibraryLoader.create(LibC.class).load("c"); // load the "c" library into the libc variable
        libc.puts("Hello World!"); // prints "Hello World!" to console
        System.out.println(new App().getGreeting());
    }
}


