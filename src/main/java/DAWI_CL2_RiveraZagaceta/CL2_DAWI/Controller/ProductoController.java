package DAWI_CL2_RiveraZagaceta.CL2_DAWI.Controller;

import DAWI_CL2_RiveraZagaceta.Service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoController {
    private ProductoService productoService;

    @GetMapping("/Producto")
    public String Producto(Model model){
        model.addAttribute("listaproducto",productoService.listarProducto());

        return "Producto";
    }
}
