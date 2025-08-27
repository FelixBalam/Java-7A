class BuscadorPrimos:
    def __init__(self, numeros):
        self.numeros = numeros

    def es_primo(self, n):
        if n < 2:
            return False
        for i in range(2, int(n**0.5) + 1):
            if n % i == 0:
                return False
        return True

    def obtener_primos(self):
        return [num for num in self.numeros if self.es_primo(num)]


if __name__ == "__main__":
    numeros = []
    cantidad = int(input("¿Cuántos números deseas ingresar? "))

    for i in range(cantidad):
        num = int(input(f"Ingrese el número {i+1}: "))
        numeros.append(num)

    buscador = BuscadorPrimos(numeros)

    print("\nLista ingresada:", numeros)
    print("Números primos encontrados:", buscador.obtener_primos())
    print("Cantidad de primos:", len(buscador.obtener_primos()))
