package com.example.api.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtil {
    public List<String> arrayToList(String[] arr) {
        return Arrays.asList(arr).stream().sorted().collect(Collectors.toList());
    }

}
