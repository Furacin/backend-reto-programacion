package com.autentia.catalogocursos.springbootmybatis.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Curso {

    private String titulo;

    private String nivel;

    private String numHoras;

    private Boolean activo;

    private Long profesor_id;

    private String temario;

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo='" + titulo + '\'' +
                ", nivel='" + nivel + '\'' +
                ", numHoras='" + numHoras + '\'' +
                ", activo='" + activo + '\'' +
                ", profesor_id=" + profesor_id +
                '}';
    }
}
    