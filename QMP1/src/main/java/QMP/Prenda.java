package QMP;

public class Prenda {
    private String tipo;
    private String categoria;
    private String material;
    private String colorPrimario;
    private String colorSecundario;

    public Prenda(String tipo, String categoria, String material, String colorPrimario, String colorSecundario) {
        if (tipo == null || categoria == null || material == null || colorPrimario == null) {
            throw new IllegalArgumentException("No se pudo crear la prenda");
        }
        if (!categoriaValidaParaTipo(tipo, categoria)) {
            throw new IllegalArgumentException("Error en la categoria");
        }
        this.tipo = tipo;
        this.categoria = categoria;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    private boolean categoriaValidaParaTipo(String tipo, String categoria) {
        switch (tipo) {
            case "camisa":
            case "remera":
                return categoria.equals("parte superior");
            case "pantalon":
            case "short":
            case "pollera":
                return categoria.equals("parte inferior");
            case "zapato":
            case "zapatilla":
                return categoria.equals("calzado");
            default:
                return false;
        }
    }
}
