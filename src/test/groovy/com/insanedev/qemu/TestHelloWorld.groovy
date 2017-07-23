package com.insanedev.qemu

import spock.lang.Specification

class TestHelloWorld extends Specification {

	def 'hello world'() {
		setup:
		HelloWorld greeter = new HelloWorld();

		when:
		String greeting = greeter.generateGreeting()

		then:
		greeting == 'Hello World'
	}
}
