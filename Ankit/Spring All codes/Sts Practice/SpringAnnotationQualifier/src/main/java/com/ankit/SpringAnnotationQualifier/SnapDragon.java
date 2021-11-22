package com.ankit.SpringAnnotationQualifier;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		
		System.out.println("World best CPU");
	}

}
