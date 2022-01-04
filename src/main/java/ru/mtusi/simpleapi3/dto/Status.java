package ru.mtusi.simpleapi3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Status {
    String hostName;
    String helloWord;
}
