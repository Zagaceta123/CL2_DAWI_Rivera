package DAWI_CL2_RiveraZagaceta.CL2_DAWI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
