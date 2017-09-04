package com.wisely.highlight.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")//默认为singleton
public class DemoPrototypeService {

}
