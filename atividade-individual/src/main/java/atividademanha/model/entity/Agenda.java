package atividademanha.model.entity;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class Agenda {

    private List<Pessoa> listaPessoa = new ArrayList<>();

}
