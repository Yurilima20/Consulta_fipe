package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true) // ignora detlahes que não tem na classe, mas tem no banco e não lança uma exceção.
public record Modelos (List<Dados> modelos){
}
