package com.example.SGPT_BACKEND.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Pagination<T> {
    List<T> data;
    Integer paginaActual;
    Long totalElementos;
    Integer totalPaginas;
}