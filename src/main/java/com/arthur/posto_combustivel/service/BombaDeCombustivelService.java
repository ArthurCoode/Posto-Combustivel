package com.arthur.posto_combustivel.service;

import com.arthur.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.arthur.posto_combustivel.infrastructure.repository.BombaDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BombaDeCombustivelService {

    private final BombaDeCombustivelRepository bombaDeCombustivelRepository;

    public void criar(BombasDeCombustivel bombasDeCombustivel) {
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }

    public BombasDeCombustivel buscarBombaCombustivelPorId(Integer id) {
        return bombaDeCombustivelRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Bomba de Combustível não encontrada pelo ID: " + id));
    }

    public List<BombasDeCombustivel> buscarBombasdeCombustivel(){
        return bombaDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarBombaCombustivel(Integer id) {
        bombaDeCombustivelRepository.deleteById(id);
    }

    public void alterarBombaCombustivel(Integer id, BombasDeCombustivel bombasDeCombustivel) {
        BombasDeCombustivel bomba = buscarBombaCombustivelPorId(id);
        bombasDeCombustivel.setId(bomba.getId());
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }

}
