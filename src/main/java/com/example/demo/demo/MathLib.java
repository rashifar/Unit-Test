
package com.example.demo.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MathLib {

	public static boolean isEven(int value) {
        return value % 2 == 0;
	}

}
