package com.javanauta.posto_combustivel.service;

import com.javanauta.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.javanauta.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import com.javanauta.posto_combustivel.infrastructure.repositories.TipoDeCombustivelRepostory;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TiposDeCombustivelService {

    private final TipoDeCombustivelRepostory tipoDeCombustivelRepostory;

    public void criar(TiposDeCombustivel tiposDeCombustivel){
        tipoDeCombustivelRepostory.save(tiposDeCombustivel);
    }

    public TiposDeCombustivel buscarTiposDeCombustivelPorId(Integer id){
        return tipoDeCombustivelRepostory.findById(id).orElseThrow(() ->
                new NullPointerException("Tipo de combustível não encontrada pelo id" + id));
    }

    public List<TiposDeCombustivel> buscarTiposDeCombustivel(){
        return tipoDeCombustivelRepostory.findAll();
    }

    @Transactional
    public void deletarTipoDeCombustivel(Integer id){
        tipoDeCombustivelRepostory.deleteById(id);
    }

    public void alterarTipoDeCombustivel(Integer id, TiposDeCombustivel tiposDeCombustivel){
        TiposDeCombustivel bomba = buscarTiposDeCombustivelPorId(id);
        tiposDeCombustivel.setId(bomba.getId());
        tipoDeCombustivelRepostory.save(tiposDeCombustivel);
    }
}