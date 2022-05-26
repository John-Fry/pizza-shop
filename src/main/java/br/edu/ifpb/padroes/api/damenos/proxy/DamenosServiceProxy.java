package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class DamenosServiceProxy implements DamenosService {
    private List<DamenosPizza> damenosCache = new ArrayList<>();
    private DamenosServiceImpl damenosService = new DamenosServiceImpl();

    @Override
    public List<DamenosPizza> getPizzas() {
        if (damenosCache.isEmpty()) {
            damenosCache = damenosService.getPizzas();
        }

        return damenosCache;
    }
}
