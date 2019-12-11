package com.example.p342;

import com.example.p342.bean.GoodGuitarist;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {
    public boolean matches(Method method, Class<?> aClass) {
        return "sing".equalsIgnoreCase(method.getName());
    }

    @Override
    public ClassFilter getClassFilter() {
        return cls -> (cls == GoodGuitarist.class);
    }
}
