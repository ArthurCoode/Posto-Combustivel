package com.arthur.posto_combustivel.service;

import com.arthur.posto_combustivel.infrastructure.entities.Abastecimento;
import com.arthur.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.arthur.posto_combustivel.infrastructure.repository.AbastecimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor

public class AbastecimentoService {

    private final AbastecimentoRepository abastecimentoRepository;
    private final BombaDeCombustivelService bombaDeCombustivelService;

    public void abastecer(Integer idBomba, Long litros) {
        BombasDeCombustivel bomba = bombaDeCombustivelService.buscarBombaCombustivelPorId(idBomba);
        BigDecimal valorTotal = bomba.getTiposDeCombustivel()
                .getPreçoPorLitro().multiply(BigDecimal.valueOf(litros));

        Abastecimento abastecimento = Abastecimento.builder()
                .dataAbastecimento(LocalDate.now())
                .bombasDeCombustivel(bomba)
                .valorTotal(valorTotal)
                .quantidadeLitros(litros)
                .build();

        abastecimentoRepository.save(abastecimento);
    }

    public List<Abastecimento> buscarAbastecimento() {
       return abastecimentoRepository.findAll();
    }
}
