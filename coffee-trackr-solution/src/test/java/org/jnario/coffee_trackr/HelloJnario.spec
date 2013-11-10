package org.jnario.coffee_trackr

describe HelloJnario{
	
	fact "says hello to everyone"{
		subject.sayHello("everyone") => "Hello everyone"
	}
}