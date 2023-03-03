package com.api.restaws.utils;

import org.springframework.beans.BeanUtils;

import java.util.List;

public class DtoUtils {
    private DtoUtils() {
    }

    public static <S, T> T copyProperties(S source, T target) {
        BeanUtils.copyProperties(source, target);
        return target;
    }

    public static <S, T> List<T> copyProperties(List<S> source, T target) {
        return source.stream().map(s -> copyProperties(s, target)).toList();
    }
}
