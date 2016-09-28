package com.softwares.swamisamarth.t3databinding.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by C145557 on 9/28/2016.
 */


@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationContext {
}