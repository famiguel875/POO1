class Cafetera(var ubicacion: String) {

    var capacidad: Double = 1000.00
    var cantidad: Double = 0.00

    constructor(ubicacion: String, capacidad: Double) : this(ubicacion, 1000.00) {
        this.capacidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Double, cantidad: Double) : this(ubicacion, 1000.00, 0.00) {
        this.capacidad = capacidad
        this.cantidad = cantidad
        if (this.cantidad > capacidad) {
            this.cantidad = capacidad
        }
    }

    fun llenar() = this.cantidad == capacidad

    fun vaciar() = this.cantidad == 0.00

    fun agregarCafe() = this.cantidad + 200.00 {
        if agregarCafe()
    }


    override fun toString(): String {
        return "Cafetera(ubicacion = ${this.ubicacion}, capacidad = ${this.capacidad}, cantidad = ${this.cantidad}}"
    }

}