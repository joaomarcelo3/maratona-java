package orientacao_a_objetos.introducao_Generics.exemplo_COM_Generics.Parte_1;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    //Colcar equipamentos Genericos
    public void addEquipamentos(T equipamentoGenerico){
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa De equipamentos: " + equipamentos.toString();
    }
}
