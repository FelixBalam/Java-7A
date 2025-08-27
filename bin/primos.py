# Clase principal que se encarga de buscar números primos
class BuscadorPrimos:
    def __init__(self, numeros):
        # Guardamos la lista de números que ingresa el usuario
        self.numeros = numeros

    # Método para verificar si un número es primo
    def es_primo(self, n):
        if n < 2:  # Los números menores a 2 no son primos
            return False
        # Recorremos posibles divisores desde 2 hasta la raíz cuadrada de n
        for i in range(2, int(n**0.5) + 1):
            if n % i == 0:  # Si es divisible, no es primo
                return False
        return True  # Si no tuvo divisores, es primo

    # Método para filtrar los primos de la lista de números
    def obtener_primos(self):
        # Se usa una lista por comprensión (forma declarativa de recorrer listas)
        return [num for num in self.numeros if self.es_primo(num)]


# Bloque principal del programa
if __name__ == "__main__":
    numeros = []  # Lista vacía para guardar los números del usuario
    
    # Pedimos al usuario cuántos números va a ingresar
    cantidad = int(input("¿Cuántos números deseas ingresar? "))

    # Ciclo para pedir uno por uno los números
    for i in range(cantidad):
        num = int(input(f"Ingrese el número {i+1}: "))
        numeros.append(num)  # Se agregan a la lista

    # Se crea un objeto de la clase BuscadorPrimos con los números ingresados
    buscador = BuscadorPrimos(numeros)

    # Mostramos la lista original y los resultados
    print("\nLista ingresada:", numeros)
    print("Números primos encontrados:", buscador.obtener_primos())
    print("Cantidad de primos:", len(buscador.obtener_primos()))
