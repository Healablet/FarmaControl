package co.farmacontrol.lotes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoteRepository extends JpaRepository<Lote, Long> {

    List<Lote> findByMedicamentoIdOrderByFechaVencimientoAsc(Long medicamentoId);

    List<Lote> findByFechaVencimientoBetweenOrderByFechaVencimientoAscIdAsc(
            LocalDate fechaInicial, LocalDate fechaFinal);
}
