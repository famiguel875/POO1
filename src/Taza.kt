class Taza(var color: String = "blanco", var capacidad: Double = 50.00) {

    var cantidad: Double = 0.00
        get() = field
        set(value) {
            if (value>this.capacidad) {
                (value == this.capacidad)
            }
            field = value
        }

    fun llenar() = this.cantidad == capacidad

    override fun toString(): String {
        return "Taza(color = ${this.color}, cantidad = ${this.cantidad}, capacidad = ${this.capacidad}}"
    }
}