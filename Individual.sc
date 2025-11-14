//Pregunta 1
def myMethod(datos: List[Double]): Double = {
  val promedio = datos.sum / datos.size
  val sumaCuadrados = datos.map(x => math.pow(x - promedio,2)).sum
  math.sqrt(sumaCuadrados / datos.size)
}
val nums: List[Double] = List(5.6, 7.8 ,8.9)
myMethod(nums)

//Pregunta 2
// Se requiere elaborar una solución donde exista una única función capaz de recibir la lista de precios y,
// además, la función que representa la regla de ajuste que se quiera aplicar en ese momento.
// Esta función deberá retornar una nueva lista de precios ya modificados de acuerdo con la política específica que se haya suministrado.

def tiendaDigital(precios: List[Double], ajuste:Double => Double): List[Double] = precios.map(ajuste)

//Pregunta 3
//Transforme la función anónima a una función con nombre

val generadorIncrementadorAnonimo: Int => (Int => Int) = (incremento: Int) => (x: Int) => x + incremento

def generarIncrementoAnonimo(incremento: Int): Int => Int = (x: Int) => x + incremento