package com.arthur.posto_combustivel.controller;

import com.arthur.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.arthur.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.arthur.posto_combustivel.service.BombaDeCombustivelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bombasDeCobustivel")

public class BombasDeCombustivelController {

    private final BombaDeCombustivelService bombaDeCombustivelService;

    @PostMapping
    public ResponseEntity<Void> criar(@RequestBody BombasDeCombustivel bombasDeCombustivel) {

        bombaDeCombustivelService.criar(bombasDeCombustivel);
        return ResponseEntity.accepted().build();
    }

    @GetMapping
    public ResponseEntity<List<BombasDeCombustivel>> buscarBombasDeCombustivel() {
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombasdeCombustivel());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BombasDeCombustivel> buscarBombasDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(bombaDeCombustivelService.buscarBombaCombustivelPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> DeletarBombasDeCombustivelPorId(@PathVariable(name = "id") Integer id){
        bombaDeCombustivelService.deletarBombaCombustivel(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> alterarBombaDeCombustivel(@RequestParam(name = "id") Integer id,
                                                         @RequestBody BombasDeCombustivel BombasDeCombustivel) {
        bombaDeCombustivelService.alterarBombaCombustivel(id, BombasDeCombustivel);
        return ResponseEntity.ok().build();
    }
}
