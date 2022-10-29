package ir.maktab;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Test3 {
    public static void main(String[] args) {


    List<String> strings = List.of("ali", "baba", "samafar", "daryoush");

    Map<Integer, List<String>> result = strings.stream()
            .collect(groupingBy(String::length));

System.out.println(result);

}}
