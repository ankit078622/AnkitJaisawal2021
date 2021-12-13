package com.ankit.SpringAnnotationQualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTec implements MobileProcessor {

    public void process() {
		
		System.out.println("2nd best CPU");
	}
}
