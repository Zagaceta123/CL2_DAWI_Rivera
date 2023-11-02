package DAWI_CL2_RiveraZagaceta.CL2_DAWI;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductoService {
    private ProductoRepository productoRepository;

    public List<Producto> listarProducto(){
        return productoRepository.findAll();
    }
}
