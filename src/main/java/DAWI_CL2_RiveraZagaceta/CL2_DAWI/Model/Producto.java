package DAWI_CL2_RiveraZagaceta.CL2_DAWI.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdProducto;
    @Column(name = "NomCliente")
    private String NomCliente;
    @Column(name = "ApeCliente")
    private String ApeCliente;
    @Column(name = "FechaReg")
    private String FechaReg;
    @Column(name = "Edad")
    private String Edad;

}
